<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet"
	type="text/css">
<TITLE>MyJSP.jsp</TITLE>
</HEAD>

<%-- JSP Declaration --%>
<%! String myName = "AvTech"; %>

<%@ include file="doGet.html" %>

<BODY>
<P>This is my first JSP page.<br>

<%-- JSP Expression --%>
Today is <%= new java.util.Date() %>

<BR>Your context path is <%= request.getContextPath() %>.

<%-- JSP Action Tag --%>
<jsp:include page="doPost.html" flush="true" />

   <%-- JSP Scriplet --%>
   <%
   		String name = request.getParameter("name");
        if (name == null || "".equals(name)) {
            out.println("Please enter your name:");
        } else {
        	myName = name;
            out.println("Hello <b>" + name + "</b>!");
        }
    %>

</P>

<%-- JSP Expression --%>
The school is <%= myName %>.<br>
My local variable is <%= name %>.<br>

<form name=MyForm method=get action="MyJSP.jsp">
<input type=text value="" name="name">
<input type=submit value=Submit name=button>
</form>

<form name=MyForm method=post action="MyJSP2.jsp">
<input type=text value="" name="name">
<input type=submit value=Go name=button>
</form>

</BODY>
</HTML>
