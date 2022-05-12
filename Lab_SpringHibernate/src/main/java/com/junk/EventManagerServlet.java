package com.junk;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class EventManagerServlet extends HttpServlet {

	WebApplicationContext springContext;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");

		try {
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>Event Manager</title></head><body>");
			System.out.println("EventManagerServlet RADIO BUTTOM = "
					+ request.getParameter("group1"));
			printEventForm(out);
			listEvents(out, dateFormatter, request);
			out.println("</body></html>");
			out.flush();
			out.close();
			System.out.println("End of try block in EventManagerServlet ");
		} catch (Exception ex) {
			if (ServletException.class.isInstance(ex)) {
				System.out.println("in exceptio +++++++++=");
				throw (ServletException) ex;
			} else {
				throw new ServletException(ex);
			}
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void printEventForm(PrintWriter out) {
		out.println("<h2>List of Clients</h2>");
	}

	private void listEvents(PrintWriter out, SimpleDateFormat dateFormatter,
			HttpServletRequest request) {
		try {

			String userId = request.getParameter("userId");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");

			if (userId != null)
				userId = userId.trim();

			UserDAO userDAO = (UserDAO) springContext.getBean("myUserDAO");

			userDAO.saveUser(new Integer(userId), firstName, lastName);
			List<Client> list = userDAO.listClient();

			out.println("The total # of client is: " + list.size() + "<br>");
			out.println("Client ID" + "\t" + "Client Name<br>");

			for (Client c : list) {
				out.println(c.getCustomerId() + "\t" + c.getFirstName() + " "
						+ c.getLastName() + "<br>");
			}

		} catch (Exception ex) {
			System.out.println("INSIDE main SQL EXCEPTION +****="
					+ ex.toString());
		}
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		springContext = WebApplicationContextUtils
				.getWebApplicationContext(getServletContext());
	}
}
