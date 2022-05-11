<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet"
	type="text/css">
<TITLE>MyJSP4.jsp</TITLE>
</HEAD>

<%@ page session="true" import="java.text.*,
java.sql.*,java.util.*,javax.sql.DataSource,
com.avtech.j2ee.db.DBConnection,
javax.naming.*" errorPage="GeneralError.jsp"
%>

<BODY>
<P>This is my 4th JSP Page.<br>
<br>=================================
<br>The EMP table details in MySql 5:
<br>=================================
<br>

<%
	DBConnection db = new DBConnection();

	// MySql 5.1
	ArrayList list = db.getTableDetails("MySQL 5", "EMPLOYEES", false);
	
	Iterator iterator = list.iterator();
	String item;
	while (iterator.hasNext()) {
		item = (String) iterator.next();
%>	
		<%= item %><br>
<%	
	}				
%>
    -------------------------------------------
<br>Total # of Employees in MySql 5: <%= list.size() %>.
<br>================================
<br>

<br>====================================
<br>The EMP table details in Oracle 10g:
<br>====================================
<br>
<%
	// Oracle 10g
	list = db.getTableDetails("Oracle 10g", "JOBS", false);

	iterator = list.iterator();
	while (iterator.hasNext()) {
		item = (String) iterator.next();
%>	
		<%= item %><br>
<%	
	}				
%>
    ------------------------------------------
<br>Total # of Employees in Oracle 10g: <%= list.size() %>.
<br>===================================

</BODY>
</HTML>

