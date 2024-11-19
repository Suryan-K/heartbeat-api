package com.tanjer.heartbeat.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transport.http.auth.DefaultBasicAuthSupplier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptDispatch.AcceptDispatchService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptService.AcceptService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleService.PharmacySaleService;

@Configuration
public class SoapClientConfig {
	
	 @Value("${consumption_consumeservice}")
	 private String consumptionConsumeService;

	@Value("${tandtest_username}")
	private String tandtestUserName;

	@Value("${tandtest_password}")
	private String tandtestPassword;

	@Bean
	public PharmacySaleService pharmacySaleService() {
		return createSoapClient(PharmacySaleService.class,
				"https://tandttest.sfda.gov.sa/ws/PharmacySaleService/PharmacySaleService");
	}

	@Bean
	public AcceptService acceptService() {
		return createSoapClient(AcceptService.class, "https://tandttest.sfda.gov.sa/ws/AcceptService/AcceptService");
	}

	@Bean
	public AcceptDispatchService acceptDispatchService() {
		return createSoapClient(AcceptDispatchService.class,
				"https://tandttest.sfda.gov.sa/ws/AcceptDispatchService/AcceptDispatchService");
	}
	
	@Bean
    public ConsumeService consumeService() {
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(ConsumeService.class);
        factory.setAddress(consumptionConsumeService);
        
        ConsumeService client = (ConsumeService) factory.create();
        Client clientProxy = org.apache.cxf.frontend.ClientProxy.getClient(client);
        HTTPConduit httpConduit = (HTTPConduit) clientProxy.getConduit();
        
        httpConduit.getAuthorization().setUserName(tandtestUserName);
        httpConduit.getAuthorization().setPassword(tandtestPassword);
        
        // Set authentication supplier
        httpConduit.setAuthSupplier(new DefaultBasicAuthSupplier());
        
        return client;
    }

	/**
	 * Generic method to create a SOAP client. *@param* serviceClass The service
	 * interface class. *@param* serviceUrl The service URL. *@param* <T> The type
	 * of the service. *@return* The service client.
	 */
	@SuppressWarnings("unchecked")
	private <T> T createSoapClient(Class<T> serviceClass, String serviceUrl) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(serviceClass);
		factory.setAddress(serviceUrl);

// Create the client
		T client = (T) factory.create();

// Set up authentication
		Client clientProxy = org.apache.cxf.frontend.ClientProxy.getClient(client);
		HTTPConduit httpConduit = (HTTPConduit) clientProxy.getConduit();
		httpConduit.getAuthorization().setUserName(tandtestUserName);
		httpConduit.getAuthorization().setPassword(tandtestPassword);

// Set authentication supplier
		httpConduit.setAuthSupplier(new DefaultBasicAuthSupplier());

		return client;
	}
}