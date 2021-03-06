/**
 * GetCUGResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class GetCUGResponse  extends com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.apcHandling.CUGBean[] cug;

    public GetCUGResponse() {
    }

    public GetCUGResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.CUGBean[] cug) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.cug = cug;
    }


    /**
     * Gets the cug value for this GetCUGResponse.
     * 
     * @return cug
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.CUGBean[] getCug() {
        return cug;
    }


    /**
     * Sets the cug value for this GetCUGResponse.
     * 
     * @param cug
     */
    public void setCug(com.billcom.apc.generatedSOAP.bscs.apcHandling.CUGBean[] cug) {
        this.cug = cug;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCUGResponse)) return false;
        GetCUGResponse other = (GetCUGResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cug==null && other.getCug()==null) || 
             (this.cug!=null &&
              java.util.Arrays.equals(this.cug, other.getCug())));
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
        if (getCug() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCug());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCug(), i);
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
        new org.apache.axis.description.TypeDesc(GetCUGResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCUGResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cug");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CUGBean"));
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
