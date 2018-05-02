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
    login_s2_suc <br>
     <s:debug/>
     <br>
     <a href="stu_new.jsp">add stu</a>
<table>
<tr><td>id<td>username<td>os<td>java<td>math<td>action</tr>
<s:iterator value="stus" var="row" status="status">
  <tr>
  <td><s:property value="#status.even"/>
  <td><s:property value="#status.count"/>  
  <td><s:property value="#row[0]"/>
  <td><s:property value="#row[1]"/>
  <td><s:property value="#row[2]"/>
  <td><s:property value="#row[3]"/>
  <td><s:property value="#row[4]"/>
  <td>
      <s:url var="editUrl" action="stu_edit">
          <s:param name="stu.id" value="#row[0]"/>
      </s:url>
      <a href="${editUrl}">edit</a>
      <s:url var="delUrl" action="stu_del">
          <s:param name="stu.id" value="#row[0]"/>
      </s:url>
      <a href="${delUrl}" onclick="return readyDel();">del</a>
</s:iterator>
</table>
<script>
       function readyDel(){
          if(confirm("是否删除?")) return true;
          else return false;
       }
    </script>
  </body>
</html>
