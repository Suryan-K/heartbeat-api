package com.tanjer.heartbeat.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transport.http.auth.DefaultBasicAuthSupplier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.PharmacySaleService;

@Configuration
public class SoapClientConfig {

    @Value("${pharmacy_saleservice}")
    private String pharmacySaleService;
    
    @Value("${tandtest_username}")
    private String tandtestUserName;
    
    @Value("${tandtest_password}")
    private String tandtestPassword;
    
    @Bean
    public PharmacySaleService pharmacySaleService() {
        System.out.println("urls  "+ pharmacySaleService );
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(PharmacySaleService.class);
        factory.setAddress(pharmacySaleService);
        
        PharmacySaleService client = (PharmacySaleService) factory.create();
        Client clientProxy = org.apache.cxf.frontend.ClientProxy.getClient(client);
        HTTPConduit httpConduit = (HTTPConduit) clientProxy.getConduit();
        
        httpConduit.getAuthorization().setUserName(tandtestUserName);
        httpConduit.getAuthorization().setPassword(tandtestPassword);
        
        // Set authentication supplier
        httpConduit.setAuthSupplier(new DefaultBasicAuthSupplier());
        
        return client;
    }
}
