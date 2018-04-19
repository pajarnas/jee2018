<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<s:debug/>
<s:form name="validatonForm" action="xmlValidation">
   <s:textfield name="test_int" label="test_int"/>
   <s:submit/>
</s:form>