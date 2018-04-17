<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<s:debug/>
myActionNoParams:
<s:form name="inputForm" action="myActionNoParams" method="post">
  <s:textfield key="username"/>
  <s:submit/>
</s:form>
myActionWithParams:
<s:form name="inputForm" action="myActionWithParams" method="post">
  <s:textfield key="username"/>
  <s:submit/>
</s:form>
myActionWithStack:
<s:form name="inputForm" action="myActionWithStack" method="post">
  <s:textfield key="username"/>
  <s:submit/>
</s:form>