package com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.9
 * 2024-11-19T12:25:52.020+05:30
 * Generated source version: 3.5.9
 *
 */
@WebServiceClient(name = "DeactivationCancelService",
                  wsdlLocation = "${project.basedir}/src/main/resources/wsdl/tandtest/consumption/DeactivationCancelService_1.wsdl",
                  targetNamespace = "http://dtts.sfda.gov.sa/DeactivationCancelService")
public class DeactivationCancelService_Service extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "DeactivationCancelService");
    public static final QName DeactivationCancelService = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "DeactivationCancelService");
    static {
        URL url = null;
        try {
            url = new URL("${project.basedir}/src/main/resources/wsdl/tandtest/consumption/DeactivationCancelService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DeactivationCancelService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "${project.basedir}/src/main/resources/wsdl/tandtest/consumption/DeactivationCancelService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DeactivationCancelService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeactivationCancelService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeactivationCancelService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DeactivationCancelService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DeactivationCancelService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DeactivationCancelService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DeactivationCancelService
     */
    @WebEndpoint(name = "DeactivationCancelService")
    public DeactivationCancelService getDeactivationCancelService() {
        return super.getPort(DeactivationCancelService, DeactivationCancelService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeactivationCancelService
     */
    @WebEndpoint(name = "DeactivationCancelService")
    public DeactivationCancelService getDeactivationCancelService(WebServiceFeature... features) {
        return super.getPort(DeactivationCancelService, DeactivationCancelService.class, features);
    }

}