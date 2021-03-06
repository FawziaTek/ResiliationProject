/**
 * RetrieveServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class RetrieveServicesResponse  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse  implements java.io.Serializable {
    private java.lang.Long contractID;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.Service[] detailedServices;

    public RetrieveServicesResponse() {
    }

    public RetrieveServicesResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           java.lang.Long contractID,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.Service[] detailedServices) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.contractID = contractID;
        this.detailedServices = detailedServices;
    }


    /**
     * Gets the contractID value for this RetrieveServicesResponse.
     * 
     * @return contractID
     */
    public java.lang.Long getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this RetrieveServicesResponse.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Long contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the detailedServices value for this RetrieveServicesResponse.
     * 
     * @return detailedServices
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.Service[] getDetailedServices() {
        return detailedServices;
    }


    /**
     * Sets the detailedServices value for this RetrieveServicesResponse.
     * 
     * @param detailedServices
     */
    public void setDetailedServices(com.billcom.apc.generatedSOAP.bscs.contractHandling.Service[] detailedServices) {
        this.detailedServices = detailedServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveServicesResponse)) return false;
        RetrieveServicesResponse other = (RetrieveServicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.detailedServices==null && other.getDetailedServices()==null) || 
             (this.detailedServices!=null &&
              java.util.Arrays.equals(this.detailedServices, other.getDetailedServices())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getDetailedServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailedServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailedServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RetrieveServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "detailedServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
