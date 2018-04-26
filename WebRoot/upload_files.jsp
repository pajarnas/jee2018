<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<head>
<s:head/>
</head>
<s:debug/>
<s:actionerror/>
<s:form action="filesUpload" method="post" enctype="multipart/form-data">
    <s:file name="uploads" label="File"/>
	<s:file name="uploads" label="File"/>
	<s:file name="uploads" label="File"/>
    <s:submit/>
</s:form>