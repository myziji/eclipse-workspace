<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<%@ page 
language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet"
	type="text/css">
<TITLE>MyJSP.jsp</TITLE>
</HEAD>

<%-- JSP Declaration --%>
<%! String myName = "Ascend"; %>



<BODY>
<P>This is my first JSP page.<br>

<%-- JSP Expression --%>
Today is <%= new java.util.Date() %>



</BODY>
</HTML>
