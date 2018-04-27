<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<s:debug/>
upload suc
<a href="<%=basePath%><s:property value='downFilePath'/>">download</a>
<s:url var="downUrl" action="fileDownload">
   <s:param name="contentType" value="uploadContentType"/>
   <s:param name="fileName" value="uploadFileName"/>
   <s:param name="downFilePath" value="downloadFilePath"/>
</s:url>