<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<head>
<s:head/>
</head>
<s:debug/>
<s:form name="validatonForm" action="xmlValidation" namespace="/validation">
   <s:textfield name="test_int" label="test_int[20,50]"/>
   <s:textfield name="test_double" label="test_double(50,90)"/>
   
   
   <s:submit/>
</s:form>