package com.tanjer.heartbeat.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transport.http.auth.DefaultBasicAuthSupplier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice.ConsumeCancelService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.DeactivationCancelService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice.DeactivationService;


@Configuration
public class CunsumptionSoapClientConfig {

	@Value("${integration.rsd.url}")
	private String rsdUrl;

	@Value("${integration.rsd.username}")
	private String rsdUsername;

	@Value("${integration.rsd.password}")
	private String rsdPassword;


	@Bean
	protected ConsumeService consumeService() {
		return createSoapClient(ConsumeService.class, rsdUrl+"/ConsumeService/ConsumeService");
	}
	
	@Bean
	protected ConsumeCancelService consumeCancelService() {
		return createSoapClient(ConsumeCancelService.class, rsdUrl+"/ConsumeCancelService/ConsumeCancelService");
	}
	
	@Bean
	protected DeactivationService cunsumptionDeactivationService() {
		return createSoapClient(DeactivationService.class, rsdUrl+"/DeactivationService/DeactivationService");
	}
	
	@Bean
	protected DeactivationCancelService deactivationCancelService() {
		return createSoapClient(DeactivationCancelService.class, rsdUrl+"/DeactivationCancelService/DeactivationCancelService");
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
