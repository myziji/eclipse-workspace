package com.avtech.j2ee.lab3;

import java.io.IOException;
import java.io.PrintWriter;

import com.avtech.j2ee.lab1.MortgagePayment4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MortgageCalculatorServlet
 */
@WebServlet("/MortgageCalculatorServlet")
public class MortgageCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MortgageCalculatorServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.println("<html><body>");
//		out.println("<h1>Welcome to Super Mortgage Calculator!</h1>");
//		out.println("</body></html>");
//
//		MortgagePayment4 mp = new MortgagePayment4();
//		mp.calculateMortgage(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
