<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<head>
<s:head/>
</head>
<s:debug/>
<s:actionerror/>
<s:form action="fileUpload" method="post" enctype="multipart/form-data">
    <s:file name="upload" label="File" accept="image/*"/>
    <s:submit/>
</s:form>