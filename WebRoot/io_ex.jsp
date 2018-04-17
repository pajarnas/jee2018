<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<s:debug/>
IOException
<hr>
<s:property value="exception"/>
<hr>
message:<s:property value="exception.message"/>
<hr>
<s:property value="exceptionStack"/>