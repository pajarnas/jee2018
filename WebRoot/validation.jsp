<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<head>
<s:head/>
<sj:head/>
</head>
<s:debug/>
<s:actionerror/>
<s:form name="validatonForm" action="xmlValidation" namespace="/validation">
   <s:textfield name="test_int" label="test_int[20,50]" value="23"/>
   <s:textfield name="test_int_fieldexpression" label="test_int_fieldexpression(20,50)"/>
   <s:textfield name="test_double" label="test_double(50,90)" value="56"/>
   <s:textfield name="test_required" label="test_required" requiredLabel="true"/>
   <s:textfield name="test_requiredstring" label="test_requiredstring" requiredLabel="true" value="test"/>
   <s:textfield name="test_stringlength" label="test_stringlength(至少三个字符)" value="test"/>
   <s:textfield name="email" label="email" type="email" value="cs_jsp@126.com"/>
   <sj:datepicker value="today" id="date" name="date" key="date" displayFormat="%{getText('format.date.input')}"
   changeMonth="true" changeYear="true"/>
   <s:textfield name="pass" label="pass"/>
   <s:textfield name="repass" label="repass"/>   
   <s:textfield name="stu.username" label="username"/> 
   <s:textfield name="test_regex" label="test_regex(123.*456)"/>
   <s:submit/>
</s:form>

 date-action:<s:date name="date"/>
 <br>
 request.loc:<%=request.getLocale()%><br>
 server.loc:<%=java.util.Locale.getDefault()%><br>
 action.loc<s:property value="locale"/>