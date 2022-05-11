<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.avtech.j2ee.lab1.MortgagePayment5,java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mortgage Calculator - JSP Version</title>
</head>
<body>

<center>
<h1>Welcome to Mortgage Calculator - JSP Version</h1>

<%
	MortgagePayment5 mp = new MortgagePayment5();
	ArrayList results[] = mp.calculateMortgage();
	
	for (int i = 0; i< results.length; i++)
	{
%>
		<H2>Mortgage Loan # <%=i+1%></H2>
		<TABLE border="1">
		<TR>
			<TD><b>Payment #</b></TD>
			<TD><b>Prev Balance</b></TD>
			<TD><b>Interest Paid</b></TD>
			<TD><b>New Balance</b></TD>
		</TR>
<%
		ArrayList monthlyList = results[i];

		for (int j = 0; j < monthlyList.size(); j++)
		{
			ArrayList dataList = (ArrayList) monthlyList.get(j);
			%>
			<TR>
				<TD><%= j+1 %></TD>
<%
		
			for (int k = 0; k < dataList.size(); k++)
			{
				String value = (String) dataList.get(k);
%>
					<TD><%= value %></TD>
<%
			}	
%>
			</TR>
<%
			
		}	
%>		
		</TABLE>
<%
	}
%>

</center>
</body>
</html>