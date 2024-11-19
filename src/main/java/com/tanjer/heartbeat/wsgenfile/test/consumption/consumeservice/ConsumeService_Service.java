package com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.9
 * 2024-11-18T12:47:46.680+05:30
 * Generated source version: 3.5.9
 *
 */
@WebServiceClient(name = "ConsumeService",
                  wsdlLocation = "${project.basedir}/src/main/resources/wsdl/tandtest/consumption/ConsumeService_1.wsdl",
                  targetNamespace = "http://dtts.sfda.gov.sa/ConsumeService")
public class ConsumeService_Service extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://dtts.sfda.gov.sa/ConsumeService", "ConsumeService");
    public static final QName ConsumeService = new QName("http://dtts.sfda.gov.sa/ConsumeService", "ConsumeService");
    static {
        URL url = null;
        try {
            url = new URL("${project.basedir}/src/main/resources/wsdl/tandtest/consumption/ConsumeService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConsumeService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "${project.basedir}/src/main/resources/wsdl/tandtest/consumption/ConsumeService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConsumeService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsumeService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsumeService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ConsumeService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ConsumeService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ConsumeService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ConsumeService
     */
    @WebEndpoint(name = "ConsumeService")
    public ConsumeService getConsumeService() {
        return super.getPort(ConsumeService, ConsumeService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsumeService
     */
    @WebEndpoint(name = "ConsumeService")
    public ConsumeService getConsumeService(WebServiceFeature... features) {
        return super.getPort(ConsumeService, ConsumeService.class, features);
    }

}