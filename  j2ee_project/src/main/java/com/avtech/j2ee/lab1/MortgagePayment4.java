package com.avtech.j2ee.lab1;

import java.io.PrintWriter;

/*
    Have the program calculate the payment amount for three mortgage loans.

      - 7 year at 5.35%
      - 15 year at 5.5%
      - 30 year at 5.75%

   Using an array for the different loans and displaying the mortgage payment for each loan.
-----------------------------------------------------------

    Display the mortgage payment amount for each loan and then list the loan balance and
    interest paid for each payment over the term of the loan.

    Use loops to prevent lists from scrolling off the screen.

*/


public class MortgagePayment4
{
    public static void main(String[] args)
    {
		MortgagePayment4 mc = new MortgagePayment4();
		mc.calculateMortgage();
	}

    public void calculateMortgage()
    {
        final double initLoan = 200000.00;   // the initial amount of the loan
        int pmtNum = 0;                      // sequential payment number
        double prevBal, newBal;              // balances
        double monthlyInt;                   // interest for them month

        int term[] = {84,180,360};  // the term of the loans in months

        double intRte[] = {0.0535 / 12,0.055 / 12,0.0575 / 12};   // monthly interest rates

        double paymentAmt;          // monthly payment amount

        System.out.println("\tMORTGAGE CALCULATION PROGRAM RESULTS");	// overall header

        for (int i=0; i < 3; i++) 	// loop for each loan
        {

            double temp = Math.pow(1.0 + intRte[i],term[i]); // intermediate calculation

            paymentAmt = initLoan * ((intRte[i] * temp) / (temp - 1.0));

	    System.out.println("\nPayment\tPrev Balance\tInterest Paid\tNew Balance");
            System.out.println("\n-------\t------------\t-------------\t-----------");

            prevBal = initLoan;	// initialize previous balance

            pmtNum = 0;
            while (pmtNum < term[i])   // loop as long as the payment # is less than the term
            {
                for (int j=0; j < 20; j++)
                {
                    pmtNum++;		// increment payment # each time through loop

                    monthlyInt = intRte[i] * prevBal; // calculate interest for this period

                    if (paymentAmt > prevBal)	// if balance is >= the payment amount, this is last payment
                    {
                        newBal = 0;
                    }
                    else
                    {
                        newBal = prevBal + monthlyInt - paymentAmt;	// calculate new balance
                    }


                    // output values
                    System.out.format("\n%3d\t$%,.2f\t$%,.2f\t\t$%,.2f", pmtNum, prevBal, monthlyInt, newBal);

                    if (pmtNum == term[i]) break;  	// break out of loop if this is last payment

                    prevBal = newBal; // set balance for next period

                }
                try {Thread.sleep(1000);}		// pause for 1000 ms (one second)

                catch (InterruptedException e)
                {
                    System.out.println("Exception Occurred, exiting");
                    System.exit(0);
                }
            }


            // outupt
            System.out.println();
            System.out.format("\tMONTHLY MORTGAGE PAYMENT = $%.2f", paymentAmt);
            System.out.format("\n(Based on a loan of $%,.2f for %d months at an annual rate of %4.2f%%)", initLoan, term[i], (intRte[i] * 12) * 100);
            System.out.println();
        }
   }

    public void calculateMortgage(PrintWriter out)
    {
        final double initLoan = 200000.00;   // the initial amount of the loan
        int pmtNum = 0;                      // sequential payment number
        double prevBal, newBal;              // balances
        double monthlyInt;                   // interest for them month

        int term[] = {84,180,360};  // the term of the loans in months

        double intRte[] = {0.0535 / 12,0.055 / 12,0.0575 / 12};   // monthly interest rates

        double paymentAmt;          // monthly payment amount

        out.println("<br>\tMORTGAGE CALCULATION PROGRAM RESULTS");	// overall header

        for (int i=0; i < 3; i++) 	// loop for each loan
        {

            double temp = Math.pow(1.0 + intRte[i],term[i]); // intermediate calculation

            paymentAmt = initLoan * ((intRte[i] * temp) / (temp - 1.0));

	    out.println("<br>\nPayment\tPrev Balance\tInterest Paid\tNew Balance");
            out.println("<br>\n-------\t------------\t-------------\t-----------");

            prevBal = initLoan;	// initialize previous balance

            pmtNum = 0;
            while (pmtNum < term[i])   // loop as long as the payment # is less than the term
            {
                for (int j=0; j < 20; j++)
                {
                    pmtNum++;		// increment payment # each time through loop

                    monthlyInt = intRte[i] * prevBal; // calculate interest for this period

                    if (paymentAmt > prevBal)	// if balance is >= the payment amount, this is last payment
                    {
                        newBal = 0;
                    }
                    else
                    {
                        newBal = prevBal + monthlyInt - paymentAmt;	// calculate new balance
                    }


                    // output values
                    out.format("<br>\n%3d\t$%,.2f\t$%,.2f\t\t$%,.2f", pmtNum, prevBal, monthlyInt, newBal);

                    if (pmtNum == term[i]) break;  	// break out of loop if this is last payment

                    prevBal = newBal; // set balance for next period

                }
                try {Thread.sleep(1000);}		// pause for 1000 ms (one second)

                catch (InterruptedException e)
                {
                    out.println("<br>Exception Occurred, exiting");
                    System.exit(0);
                }
            }


            // outupt
            out.println();
            out.format("<br>\tMONTHLY MORTGAGE PAYMENT = $%.2f", paymentAmt);
            out.format("<br>\n(Based on a loan of $%,.2f for %d months at an annual rate of %4.2f%%)", initLoan, term[i], (intRte[i] * 12) * 100);
            out.println();
        }
   }

}
