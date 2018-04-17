<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<s:debug/>
SQLException
<hr>
<s:property value="exception"/>
<hr>
message:<s:property value="exception.message"/>
<hr>
<s:property value="exceptionStack"/>