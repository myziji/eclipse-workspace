<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<html>
  <head>
    <title>Format Date</title>
  </head>

  <%! java.util.Date now = new java.util.Date(); %>
  <body>
    
    <table border="1" cellpadding="0" cellspacing="0"
    style="border-collapse: collapse" bordercolor="#111111"
    width="63%" id="AutoNumber2">
      <tr>
        <td width="100%" colspan="2" bgcolor="#0000FF">
          <p align="center">
            <b>
              <font color="#FFFFFF" size="4">Formatting Number: 
				<fmt:formatNumber value="1234567.89" type="number" pattern="#,###.00"/>
              </font>
            </b>
          </p>
        </td>
      </tr>
      <tr>
        <td width="100%" colspan="2" bgcolor="#0000FF">
          <p align="center">
            <b>
              <font color="#FFFFFF" size="4">Formatting Currency: 
				<fmt:formatNumber value="1234567.89" type="currency"/>
              </font>
            </b>
          </p>
        </td>
      </tr>
    </table>
  </body>
</html>
