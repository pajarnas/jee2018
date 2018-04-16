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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    
   入门
   <br>
   <a href="login.jsp">jsp登录验证</a>
  
   <a href="private.jsp">登录之后才能访问</a>
   <a href="logout">logout</a>
   <a href="login.jsp">jsp数据库中验证登录</a>
   <br>
   <a href="login_s2.jsp">struts2登录验证</a>
   <a href="login_s2.jsp">struts2数据库中登录验证</a>
   <br>
   <a href="stu_list">显示所有学生</a>
    <br>
   <a href="login_s2_tags.jsp">使用struts2自带标签</a>
   <a href="login_obj.jsp">用Stu接收值</a>
   <br>
   java中的国际化:demo\I18NDemo&nbsp;&nbsp;&nbsp;
   <a href="login_i18n.jsp">国际化</a>
   <a href="showLocs">显示所有地区</a>
   <hr width="30%" align="left" style="border:1px solid green"/>
   <s:url var="default2Default" action="default" namespace="" />
    <a href="${default2Default}">缺省命名空间访问自己（可以）</a>
    <s:url var="default2Root" action="root" namespace="" />
    <a href="${default2Root}">缺省命名空间访问/命名空间访问</a>
    <s:url var="default2Sub" action="sub" namespace="" />
    <a href="${default2Sub}">缺省命名空间访问/sub（不可以）</a>
   <br>
   <s:url var="root2Default" action="default" namespace="/"/>
    <a href="${root2Default}">/命名空间访问缺省</a>    
    <s:url var="root2Root" action="root" namespace="/" />
    <a href="${root2Root}">/命名空间访问自己</a>    
    <s:url var="root2Sub" action="sub" namespace="/" />
    <a href="${root2Sub}">/命名空间访问/sub（不可以）</a>
    <br>
     <s:url var="sub2Sub" action="sub" namespace="/sub" />
    <a href="${sub2Sub}">/sub访问自己</a>
    <s:url var="sub2Default" action="default" namespace="/sub" />
    <a href="${sub2Default}">/sub访问缺省</a>
    <s:url var="sub2Root" action="root" namespace="/sub" />
    <a href="${sub2Root}">/sub访问/（不可以）</a>
    <hr width="30%" align="left" style="border:1px solid red">
    拦截器
    <a href="myAction">拦截器示例</a>
  </body>
</html>
