/**
 * ContractHandlingSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class ContractHandlingSoapBindingStub extends org.apache.axis.client.Stub implements com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandling {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[18];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeRateplan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRateplanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRateplanRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.ChangeRateplanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRateplanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkRateplan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "checkRateplanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "checkRateplanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContractDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractReference"), com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractDetailsResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDetailedInvoiceFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDetailedInvoiceFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoiceFileRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoiceFileResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDetailedInvoiceFileReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConsoDataHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "consoDataHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HistoryRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ConsoDataHistoryResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getConsoDataHistoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDetInvoicesByInv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "detInvoicesByInvRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetInvoicesByInvRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetInvoicesByInvResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDetInvoicesByInvReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDetailedInvoices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDetailedInvoicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoicesRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoicesResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDetailedInvoicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deactivateService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DeactivateServiceRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.DeactivateServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "deactivateServiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditRechargeHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rechargeHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HistoryRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RechargeHistoryResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCreditRechargeHistoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "retrieveServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RetrieveServicesRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RetrieveServicesResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "retrieveServicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "moveContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MoveContractRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.MoveContractRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "moveContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInvoices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "invoicesReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getInvoicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallsHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "callHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HistoryRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CallsHistoryResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCallsHistoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateContractRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.UpdateContractRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoConso");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "infoConsoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoConsoRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoConsoResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getInfoConsoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInvoiceFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getInvoiceFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceFileRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceFileResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getInvoiceFileReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("takeOver");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "takeOverRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeOverRequest"), com.billcom.apc.generatedSOAP.bscs.contractHandling.TakeOverRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "EntityResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "takeOverReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContractList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerReference"), com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractListResponse"));
        oper.setReturnClass(com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[17] = oper;

    }

    public ContractHandlingSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ContractHandlingSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ContractHandlingSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfBasicServiceGroupAssignment");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.BasicServiceGroupAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BasicServiceGroupAssignment");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfBsgConfiguration");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.BsgConfiguration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BsgConfiguration");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfCallDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CallDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CallDetails");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfConsoDataDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ConsoDataDetails");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfContractsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractsBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfCugMembership");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CugMembership[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CugMembership");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfDetailedInvoice");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoice");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfDirectoryNumber");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DirectoryNumber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirectoryNumber");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfDirnumBlocksBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DirnumBlocksBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirnumBlocksBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfFactureDetaillee");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.FactureDetaillee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "FactureDetaillee");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfInvoiceDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceDetails");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfInvoicesByBillingAccount");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesByBillingAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesByBillingAccount");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfMultValue");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.MultValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MultValue");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfParamValue");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ParamValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ParamValue");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfPort");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Port[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Port");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfRechargeDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RechargeDetails");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfReference");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Reference");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfService");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Service[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfValue");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Value[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Value");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BaseSOIBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.BaseSOIBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BasicServiceGroupAssignment");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.BasicServiceGroupAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BillingAccountReference");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BsgConfiguration");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.BsgConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CallDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CallDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CallsHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRateplanRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ChangeRateplanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ConsoDataDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ConsoDataHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Contract");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Contract.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractFull");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractFull.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractListResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractReference");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractsBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractsBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractsSearchBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractsSearchBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CugMembership");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CugMembership.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DateBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateTimeBean");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DateTimeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DeactivateServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DeactivateServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoice");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoiceFileRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoiceFileResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoicesRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoicesResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetInvoicesByInvRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetInvoicesByInvResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirectoryNumber");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DirectoryNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirnumBlocksBeanOut");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.DirnumBlocksBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "EntityResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "FactureDetaillee");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.FactureDetaillee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoConso");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoConsoRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoConsoResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoFields");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceFileRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceFileResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesByBillingAccount");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesByBillingAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MoveContractRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.MoveContractRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MultValue");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.MultValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ParamValue");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.ParamValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Port");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Port.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RechargeDetails");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RechargeHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Reference");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Reference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RetrieveServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RetrieveServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "SessionChange");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.SessionChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeOverRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.TakeOverRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateContractRequest");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.UpdateContractRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Value");
            cachedSerQNames.add(qName);
            cls = com.billcom.apc.generatedSOAP.bscs.contractHandling.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse changeRateplan(com.billcom.apc.generatedSOAP.bscs.contractHandling.ChangeRateplanRequest changeRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeRateplan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeRateplanRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse checkRateplan(com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkRateplan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkRateplanRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.CheckRateplanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse getContractDetails(com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contractReference) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getContractDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contractReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse getDetailedInvoiceFile(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileRequest getDetailedInvoiceFileRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDetailedInvoiceFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDetailedInvoiceFileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoiceFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse getConsoDataHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest consoDataHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getConsoDataHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consoDataHistoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse getDetInvoicesByInv(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvRequest detInvoicesByInvRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDetInvoicesByInv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {detInvoicesByInvRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.DetInvoicesByInvResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse getDetailedInvoices(com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesRequest getDetailedInvoicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDetailedInvoices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDetailedInvoicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.DetailedInvoicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse deactivateService(com.billcom.apc.generatedSOAP.bscs.contractHandling.DeactivateServiceRequest request) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deactivateService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse getCreditRechargeHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest rechargeHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCreditRechargeHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rechargeHistoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.RechargeHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse retrieveServices(com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesRequest retrieveServicesRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveServicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.RetrieveServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse moveContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.MoveContractRequest moveContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moveContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moveContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse getInvoices(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesRequest invoicesReq) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getInvoices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoicesReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse getCallsHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.HistoryRequest callHistoryRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCallsHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {callHistoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.CallsHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse updateContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.UpdateContractRequest updateContractRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse getInfoConso(com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoRequest infoConsoRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getInfoConso"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {infoConsoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConsoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse getInvoiceFile(com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileRequest getInvoiceFileRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getInvoiceFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getInvoiceFileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.InvoiceFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse takeOver(com.billcom.apc.generatedSOAP.bscs.contractHandling.TakeOverRequest takeOverRequest) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "takeOver"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {takeOverRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.EntityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse getContractList(com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer) throws java.rmi.RemoteException, com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getContractList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) {
              throw (com.billcom.apc.generatedSOAP.bscs.contractHandling.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
