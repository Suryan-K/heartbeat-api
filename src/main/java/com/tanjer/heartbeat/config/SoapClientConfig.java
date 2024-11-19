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
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationService.DeactivationService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService.PharmacySaleCancelService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleService.PharmacySaleService;

@Configuration
public class SoapClientConfig {

	@Value("${integration.rsd.url}")
	private String rsdUrl;

	@Value("${integration.rsd.username}")
	private String rsdUsername;

	@Value("${integration.rsd.password}")
	private String rsdPassword;

	@Bean
	protected PharmacySaleService pharmacySaleService() {
		return createSoapClient(PharmacySaleService.class, rsdUrl + "/PharmacySaleService/PharmacySaleService");
	}

	@Bean
	protected AcceptService acceptService() {
		return createSoapClient(AcceptService.class, rsdUrl + "/AcceptService/AcceptService");
	}

	@Bean
	protected AcceptDispatchService acceptDispatchService() {
		return createSoapClient(AcceptDispatchService.class, rsdUrl + "/AcceptDispatchService/AcceptDispatchService");
	}

	@Bean
	protected ConsumeService consumeService() {
		return createSoapClient(ConsumeService.class, rsdUrl+"/ConsumeService/ConsumeService");
	}
	
	@Bean
	protected PharmacySaleCancelService phamacySaleCancelService() {
		return createSoapClient(PharmacySaleCancelService.class, rsdUrl+"/PharmacySaleCancelService/PharmacySaleCancelService");
	}
	
	@Bean
	protected DeactivationService deactivationSaleService() {
		return createSoapClient(DeactivationService.class, rsdUrl+"/DeactivationService/DeactivationService");
	}

	@SuppressWarnings("unchecked")
	private <T> T createSoapClient(Class<T> serviceClass, String serviceUrl) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(serviceClass);
		factory.setAddress(serviceUrl);

		T client = (T) factory.create();

		Client clientProxy = org.apache.cxf.frontend.ClientProxy.getClient(client);
		HTTPConduit httpConduit = (HTTPConduit) clientProxy.getConduit();
		httpConduit.getAuthorization().setUserName(rsdUsername);
		httpConduit.getAuthorization().setPassword(rsdPassword);

		httpConduit.setAuthSupplier(new DefaultBasicAuthSupplier());
		return client;
	}
}