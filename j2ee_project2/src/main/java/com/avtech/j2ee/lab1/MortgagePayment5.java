package com.avtech.j2ee.lab1;

import java.math.BigDecimal;
import java.util.ArrayList;

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


public class MortgagePayment5
{

	public ArrayList[] calculateMortgage()
	{
		final double initLoan = 200000.00;   // the initial amount of the loan
		int pmtNum = 0;                      // sequential payment number
		double prevBal, newBal;              // balances
		double monthlyInt;                   // interest for them month

		int term[] = {84,180,360};  // the term of the loans in months

		double intRte[] = {0.0535 / 12,0.0535 / 12,0.0575 / 12};   // monthly interest rates

		double paymentAmt;          // monthly payment amount

		System.out.println("\tMORTGAGE CALCULATION PROGRAM RESULTS");	// overall header

		ArrayList returnList[] = new ArrayList[3];

		for (int i=0; i < 3; i++) 	// loop for each loan
		{

			returnList[i] = new ArrayList();

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
	
					// Output values
					System.out.println(pmtNum);
	
					// Add results to ArrayList
					ArrayList amountList = new ArrayList();
	
					amountList.add(convert(prevBal));
					amountList.add(convert(monthlyInt));
					amountList.add(convert(newBal));
					returnList[i].add(amountList);
	
					if (pmtNum == term[i]) break;  	// break out of loop if this is last payment
	
					prevBal = newBal; // set balance for next period
	
                }
			}


			// outupt
			System.out.println();
			System.out.println(paymentAmt);
			System.out.println(initLoan);
			System.out.println();
						
		}

		return returnList;
	}

	private String convert(double value)
	{
		BigDecimal bigDecimal = new BigDecimal(value);
		bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
		
		return bigDecimal.toString();
	}
}
