package com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.9
 * 2024-11-19T11:45:49.668+05:30
 * Generated source version: 3.5.9
 *
 */
@WebServiceClient(name = "DeactivationService",
                  wsdlLocation = "${project.basedir}/src/main/resources/wsdl/tandtest/consumption/DeactivationService_1.wsdl",
                  targetNamespace = "http://dtts.sfda.gov.sa/DeactivationService")
public class DeactivationService_Service extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://dtts.sfda.gov.sa/DeactivationService", "DeactivationService");
    public static final QName DeactivationService = new QName("http://dtts.sfda.gov.sa/DeactivationService", "DeactivationService");
    static {
        URL url = null;
        try {
            url = new URL("${project.basedir}/src/main/resources/wsdl/tandtest/consumption/DeactivationService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DeactivationService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "${project.basedir}/src/main/resources/wsdl/tandtest/consumption/DeactivationService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DeactivationService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeactivationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeactivationService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DeactivationService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DeactivationService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DeactivationService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DeactivationService
     */
    @WebEndpoint(name = "DeactivationService")
    public DeactivationService getDeactivationService() {
        return super.getPort(DeactivationService, DeactivationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeactivationService
     */
    @WebEndpoint(name = "DeactivationService")
    public DeactivationService getDeactivationService(WebServiceFeature... features) {
        return super.getPort(DeactivationService, DeactivationService.class, features);
    }

}
