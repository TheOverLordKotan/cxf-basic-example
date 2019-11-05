
package org.itc.integracion.services.sifi.servicioactualizarclientesafe.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * Generated source version: 3.2.5
 */

@WebFault(name = "actualizarCrmSifiSafeFault", targetNamespace = "org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1")
public class ActualizarStateCrmSifiFault extends Exception {

    private org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.FaultServiceType actualizarCrmSifiSafeFault;

    public ActualizarStateCrmSifiFault() {
        super();
    }

    public ActualizarStateCrmSifiFault(String message) {
        super(message);
    }

    public ActualizarStateCrmSifiFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ActualizarStateCrmSifiFault(String message, org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.FaultServiceType actualizarCrmSifiSafeFault) {
        super(message);
        this.actualizarCrmSifiSafeFault = actualizarCrmSifiSafeFault;
    }

    public ActualizarStateCrmSifiFault(String message, org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.FaultServiceType actualizarCrmSifiSafeFault, java.lang.Throwable cause) {
        super(message, cause);
        this.actualizarCrmSifiSafeFault = actualizarCrmSifiSafeFault;
    }

    public org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.FaultServiceType getFaultInfo() {
        return this.actualizarCrmSifiSafeFault;
    }
}