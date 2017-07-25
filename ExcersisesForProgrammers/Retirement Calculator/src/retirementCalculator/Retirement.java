package retirementCalculator;

import java.util.Calendar;
import java.util.Scanner;

public class Retirement {
	
	public void calculateRetirement() {
		//Importing the scanner to acquire input.
		Scanner scanner = new Scanner(System.in);
		//Prompting the user to input their current age.
		System.out.print("What is your current age?");
		//Storing their current age.
		String num1 = scanner.nextLine();
		//Prompting the user to input when they want to retire.
		System.out.print("At what age would you like to retire?");
		//Storing when they want to retire.
		String num2 = scanner.nextLine();
		//Converting the string that have been stored into floats
		float currentAge = Float.parseFloat(num1);
		float retireAge = Float.parseFloat(num2);
		//Calculating how many years user has before retirement
		int yearsLeft = (int)retireAge - (int)currentAge;
		//Acquiring the year
		int year = Calendar.getInstance().get(Calendar.YEAR);
		//Telling the user how many years they have until retirement and in what year they can retire.
		System.out.println("You have " + (yearsLeft) + " years left until you can retire.");
		System.out.println("It's " + year + ", so you can retire in " + (year + yearsLeft));
	}
	
}
