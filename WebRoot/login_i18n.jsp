<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>login i18n</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<s:head/>
  </head>
  
  <body>
    login i18n<br>
    <s:actionerror/>
    <s:form name="loginI18N" method="post" action="loginI18N">
    <s:textfield name="username" key="username" requiredLabel="true" requiredPosition="left"/>
    <s:password name="pass" label="pass"/>   
    <s:textfield name="java" label="java"/>
    <s:radio name="type" list="{'forward','redirect'}" value="'forward'" label="type"/>
    <s:submit/>
    </s:form>
   
  </body>
</html>
