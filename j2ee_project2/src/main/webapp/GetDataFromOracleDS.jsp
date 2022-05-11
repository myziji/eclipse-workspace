<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

JNDI Testing Page for Oracle

<sql:query var="rs" dataSource="jdbc/OracleDB">
	select EMPLOYEE_ID,FIRST_NAME,LAST_NAME from EMPLOYEES
</sql:query>

<html>
  <head>
    <title>DB Test</title>
  </head>
  <body>

  <h2>Results</h2>
  <TABLE border="1">
	<TR>
	    <TD>EMPLOYEE_ID</TD> 
	    <TD>FIRST_NAME</TD> 
	    <TD>LAST_NAME</TD> 
	</TR>
	<c:forEach var="row" items="${rs.rows}">
	<TR>
	    <TD>${row.EMPLOYEE_ID}</TD> 
	    <TD>${row.FIRST_NAME}</TD> 
	    <TD>${row.LAST_NAME}</TD> 
	</TR>
	</c:forEach>
</TABLE>
  </body>
</html>
