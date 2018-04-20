<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<head>
<s:head/>
<sj:head/>
</head>
<s:debug/>
<s:form name="validatonForm" action="xmlValidation" namespace="/validation">
   <s:textfield name="test_int" label="test_int[20,50]"/>
   <s:textfield name="test_double" label="test_double(50,90)"/>
   <s:textfield name="test_required" label="test_required" requiredLabel="true"/>
   <s:textfield name="test_requiredstring" label="test_requiredstring" requiredLabel="true"/>
   <s:textfield name="test_stringlength" label="test_stringlength(至少三个字符)"/>
   <s:textfield name="email" label="email" type="email"/>
   <sj:datepicker value="today" id="date" name="date" key="date" displayFormat="%{getText('display.date.format')}"
   changeMonth="true" changeYear="true"/>
   <s:textfield name="pass" label="pass"/>
   
  
   <s:submit/>
</s:form>
 date-action:<s:date name="date"/>
 <br>
 request.loc:<%=request.getLocale()%><br>
 server.loc:<%=java.util.Locale.getDefault()%><br>
 action.loc<s:property value="locale"/>