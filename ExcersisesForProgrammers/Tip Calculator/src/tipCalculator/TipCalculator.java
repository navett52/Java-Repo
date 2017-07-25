package tipCalculator;

import java.text.DecimalFormat;

import java.util.Scanner;

public class TipCalculator {
	
	public static void CalculateTip () {
		//Setting up a decimal format so the doubles will only show the first two decimal places.
		DecimalFormat df = new DecimalFormat("#.00");
		//Importing a scanner object for input
		Scanner scanner = new Scanner(System.in);
		//Asking for the bill amount and assigning the entered value to a double.
		System.out.print("What is the bill amount?");
		double billAmount = scanner.nextDouble();
		//Asking for the tip rate and assigning the entered value to a double.
		System.out.print("What is the tip rate?");
		double tipRate = scanner.nextDouble();
		//Figuring out the tip by changing the tip rate to a decimal and then multiplying it with the bill amount.
		double tip = (double)billAmount * ((double)tipRate / 100);
		//Getting the total amount of the bill after tip.
		double total = tip + billAmount;
		//Telling what the tip is.
		System.out.println("The tip is " + df.format(tip));
		//Telling what the total cost of the bill is after tip.
		System.out.println("You're total, including the tip is " + df.format(total));
		
	}
	
}
