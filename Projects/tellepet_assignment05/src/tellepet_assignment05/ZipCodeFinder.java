/******************************************************
 * Evan Tellep                                        *
 * assn.06                                            *
 * Due Date: 9/29/2015                                *
 * IT1090C (Computer Programming 1)                   *
 * Writing a program which reads zip codes            *
 * Ref:                                               *
 * M04424011                                          *
 ******************************************************/

package tellepet_assignment05;
//importing the scanner class
import java.util.Scanner;

public class ZipCodeFinder {

	public static void main(String[] args) {
		//Setting up scanner
		Scanner scanner = new Scanner(System.in);
		//Setting up variable to hold zip code info
		int zipCode;
		
		//prompts user to enter in a value to be defined as zipCode
		System.out.println("Please enter your zip code.");
		zipCode = scanner.nextInt();
		
		//if statements that determine which area each zip code represents
		//prints appropriate message
		if (zipCode == 45103) {
			System.out.println("You live in Batavia.");
			System.out.println("You are my neighbour.");
		} else if (zipCode == 49242) {
			System.out.println("You have a long drive to UC Clermont.");
		} else {
			System.out.println("Zip code not supported yet.");
		}


	}

}
