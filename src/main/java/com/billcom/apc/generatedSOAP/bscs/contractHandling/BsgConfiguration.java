/**
 * BsgConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class BsgConfiguration  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.BaseSOIBean  implements java.io.Serializable {
    private java.lang.Long bsgId;

    private java.lang.Long preferedCugId;

    public BsgConfiguration() {
    }

    public BsgConfiguration(
           java.lang.Long bsgId,
           java.lang.Long preferedCugId) {
        this.bsgId = bsgId;
        this.preferedCugId = preferedCugId;
    }


    /**
     * Gets the bsgId value for this BsgConfiguration.
     * 
     * @return bsgId
     */
    public java.lang.Long getBsgId() {
        return bsgId;
    }


    /**
     * Sets the bsgId value for this BsgConfiguration.
     * 
     * @param bsgId
     */
    public void setBsgId(java.lang.Long bsgId) {
        this.bsgId = bsgId;
    }


    /**
     * Gets the preferedCugId value for this BsgConfiguration.
     * 
     * @return preferedCugId
     */
    public java.lang.Long getPreferedCugId() {
        return preferedCugId;
    }


    /**
     * Sets the preferedCugId value for this BsgConfiguration.
     * 
     * @param preferedCugId
     */
    public void setPreferedCugId(java.lang.Long preferedCugId) {
        this.preferedCugId = preferedCugId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BsgConfiguration)) return false;
        BsgConfiguration other = (BsgConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bsgId==null && other.getBsgId()==null) || 
             (this.bsgId!=null &&
              this.bsgId.equals(other.getBsgId()))) &&
            ((this.preferedCugId==null && other.getPreferedCugId()==null) || 
             (this.preferedCugId!=null &&
              this.preferedCugId.equals(other.getPreferedCugId())));
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
        if (getBsgId() != null) {
            _hashCode += getBsgId().hashCode();
        }
        if (getPreferedCugId() != null) {
            _hashCode += getPreferedCugId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BsgConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BsgConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "bsgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferedCugId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "preferedCugId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
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
