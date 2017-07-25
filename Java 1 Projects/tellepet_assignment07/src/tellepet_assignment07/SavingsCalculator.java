/*********************************************************
 * Evan Tellep                                           *
 * assn.07                                               *
 * Due Date:10/09/2015                                   *
 * IT1090C (Computer Programming 1)                      *
 * Writing a program that calculates savings after a time*
 * Ref:                                                  *
 * M04424011                                             *
 *********************************************************/

package tellepet_assignment07;
//importing Java scanner
import java.util.Scanner;

public class SavingsCalculator {

	public static void main(String[] args) {
		
		//calling scanner class
		Scanner scanner = new Scanner(System.in);
		
		//Declaring parameters to be used in the function
		System.out.println("Please enter a monthly principle amount.");
		double amount = scanner.nextDouble();
		System.out.println("Please enter an annual interest rate.");
		double annualInterestRate = scanner.nextDouble();
		System.out.println("Please enter the amount of months you plan to wait.");
		int months = scanner.nextInt();
		
		double calculatedSavings = CalculateSavings(amount, annualInterestRate, months);
		System.out.println("Your calculated savings are $" + calculatedSavings);

	}
	 
	/**
	 * Function calculates amount saved with an entered monthly amount, yearly interest rate, and months waited
	 * @param amount Amount of money saved every month
	 * @param annualInterestRate The yearly interest rate
	 * @param months The number of months waited
	 * @return Total amount of money saved after a specific number of months after the interest rate is applied
	 */
	
	private static double CalculateSavings(double amount, double annualInterestRate, int months) {
		
		double monthlyInterestRate = annualInterestRate / 12;
		double calculatedSavings = 0;
		
		for (int i = 0; i < months; i++) {
			
			calculatedSavings = (amount + calculatedSavings) * (1 + monthlyInterestRate);
			
		}
		
		return calculatedSavings;
	}

}
