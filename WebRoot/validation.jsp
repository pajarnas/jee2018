<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<head>
<s:head/>
</head>
<s:debug/>
<s:form name="validatonForm" action="xmlValidation" namespace="/validation">
   <s:textfield name="test_int" label="test_int[20,50]"/>
   <s:textfield name="test_double" label="test_double(50,90)"/>
   <s:textfield name="test_required" label="test_required" requiredLabel="true"/>
   <s:textfield name="test_requiredstring" label="test_requiredstring" requiredLabel="true"/>
   <s:textfield name="test_stringlength" label="test_stringlength(至少三个字符)"/>
   <s:textfield name="email" label="email" type="email"/>
   <s:textfield key="date" type="date">
   <s:textfield name="pass" label="pass"/>
  
   </s:textfield>
   <s:submit/>
</s:form>
 <s:date name="date" format="yyyy-MM-dd"/>