<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet"
	type="text/css">
<TITLE>MyJSP3</TITLE>
</HEAD>

<%@ page session="true" import="java.text.*,
java.sql.*,
java.util.*,
javax.sql.DataSource,com.avtech.j2ee.db.DBConnection,
javax.naming.*" errorPage="GeneralError.jsp"
%>
<%

	Connection con = null;

	try
	{
		System.out.println("testing");
		log("con3");
		// Obtain our environment naming context
		//InitialContext initCtx = new InitialContext();
		// Look up our data source
		//DataSource ds = (DataSource) 
		//initCtx.lookup("jdbc/MySqlDB");
		
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/MySqlDB");

		log("Got dataSource");

		// Allocate and use a connection from the pool
		con = ds.getConnection();

		%>
		<P>This is my third JSP page. DB Conn= <%= con %>.<br>
		<%
		
		//log("con="+con);
		System.out.println("con=" + con);
		
	} catch (Exception e)
	{
		System.out.println( "Failed to get connection: " + e );
		e.printStackTrace();
	}

%>

<BODY>
<P>This is my third JSP page.<br>



</BODY>
</HTML>
