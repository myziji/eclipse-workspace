/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2022-05-11 14:50:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.text.*;
import java.sql.*;
import java.util.*;
import javax.sql.DataSource;
import com.avtech.j2ee.db.DBConnection;
import javax.naming.*;

public final class GetDataFromDB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("javax.naming");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.sql.DataSource");
    _jspx_imports_classes.add("com.avtech.j2ee.db.DBConnection");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"GeneralError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<META name=\"GENERATOR\" content=\"IBM WebSphere Studio\">\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<LINK href=\"theme/Master.css\" rel=\"stylesheet\"\r\n");
      out.write("	type=\"text/css\">\r\n");
      out.write("<TITLE>MyJSP4.jsp</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("<P>This is my 4th JSP Page.<br>\r\n");
      out.write("<br>=================================\r\n");
      out.write("<br>The EMP table details in MySql 5:\r\n");
      out.write("<br>=================================\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");

	DBConnection db = new DBConnection();

	// MySql 5.1
	ArrayList list = db.getTableDetails("MySQL 5", "EMPLOYEES", false);
	
	Iterator iterator = list.iterator();
	String item;
	while (iterator.hasNext()) {
		item = (String) iterator.next();

      out.write("	\r\n");
      out.write("		");
      out.print( item );
      out.write("<br>\r\n");
	
	}				

      out.write("\r\n");
      out.write("    -------------------------------------------\r\n");
      out.write("<br>Total # of Employees in MySql 5: ");
      out.print( list.size() );
      out.write(".\r\n");
      out.write("<br>================================\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>====================================\r\n");
      out.write("<br>The EMP table details in Oracle 10g:\r\n");
      out.write("<br>====================================\r\n");
      out.write("<br>\r\n");

	// Oracle 10g
	list = db.getTableDetails("Oracle 10g", "JOBS", false);

	iterator = list.iterator();
	while (iterator.hasNext()) {
		item = (String) iterator.next();

      out.write("	\r\n");
      out.write("		");
      out.print( item );
      out.write("<br>\r\n");
	
	}				

      out.write("\r\n");
      out.write("    ------------------------------------------\r\n");
      out.write("<br>Total # of Employees in Oracle 10g: ");
      out.print( list.size() );
      out.write(".\r\n");
      out.write("<br>===================================\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
