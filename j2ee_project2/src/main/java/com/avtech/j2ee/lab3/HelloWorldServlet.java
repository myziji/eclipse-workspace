package com.avtech.j2ee.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//String userName = request.getParameter("userName");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Welcome to Mortgate Calculator - doGet() </h1>");
		out.println("</body></html>");
		
		calculateMortgage(out); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String userName = request.getParameter("userName");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Welcome to Mortgate Calculator - doPost() </h1>");
		out.println("</body></html>");
		
		calculateMortgage(out); 
	}
	
	private void calculateMortgage(PrintWriter out) 
	//private void calculateMortgage() 
	{
		//declare variables
		//------------------
		double principal, rate, years, months, monthlyInterest, monthlyPayment;
		BufferedReader lineIn= new BufferedReader(new InputStreamReader(System.in));

		//Setup up formatting for the monthly payment (round to two decimal places)
		//-------------------------------------------------------------------------
		DecimalFormat twoDigits = new DecimalFormat("$#,000.00");

		//Set variables for calculation, this will later be
		//provided by the user input
		//--------------------------------------------------
		principal = 200000.00;
		rate = 5.75;
		years = 30;
		months = 30 * 12.0;
		monthlyInterest = rate / (12 * 100);

		//Calculate the monthly payment
		//---------------------------------------------------
		monthlyPayment = principal * (monthlyInterest / (1 - Math.pow((1 + monthlyInterest),(months * -1))));

		// Display in console
		//---------------------------
		System.out.println();
		System.out.println("\tMortgage Calculator");
		System.out.println("\t=====================================");
		System.out.println();
		System.out.println("\tPrincipal:\t\t" + twoDigits.format(principal));
		System.out.println("\tInterest Rate:\t\t" + rate + "%");
		System.out.println("\t# of Years:\t\t" + years);
		System.out.println();
		System.out.println("\t=====================================");
		System.out.println();
		System.out.println("\tMonthly Payment:\t" + twoDigits.format(monthlyPayment));
		System.out.println();

		
		// Display in page
		//---------------------------
		out.println("<html><body>");
		out.println("<br>\tMortgage Calculator");
		out.println("<br>\t=====================================");
		out.println();
		out.println("<br>\tPrincipal:\t\t" + twoDigits.format(principal));
		out.println("<br>\tInterest Rate:\t\t" + rate + "%");
		out.println("<br>\t# of Years:\t\t" + years);
		out.println();
		out.println("<br>\t=====================================");
		out.println();
		out.println("<br>\tMonthly Payment:\t" + twoDigits.format(monthlyPayment));
		out.println("</body></html>");
		out.close();
		
	}  

}
