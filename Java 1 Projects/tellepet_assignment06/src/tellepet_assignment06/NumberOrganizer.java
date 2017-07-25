/******************************************************
 * Evan Tellep                                        *
 * assn.06                                            *
 * Due Date: 10/06/2015                               *
 * IT1090C (Computer Programming 1)                   *
 * Writing a program that organizes numbers           *
 * Ref:                                               *
 * M04424011                                          *
 ******************************************************/

package tellepet_assignment06;

import java.util.Scanner;

public class NumberOrganizer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//initializing variables
		int minNumber = 0;//smallest number
		int maxNumber = 0;//biggest number
		int sum = 0;//sum of all numbers entered
		int count = 0;//amount of numbers entered
		
		//Letting the program know when the first iteration is
		boolean firstIteration = true;

		//while loop asks for number until 42 is entered
		while (true) {
			System.out.println("Please enter a number");
			int number = scanner.nextInt();
			
			//checks if number is 42, if not calculates average, how many numbers entered, what the max number is, and what the minimum number is
			if (number == 42) {
				System.out.println("you pressed 42");
				int average = sum / count;
				System.out.println("The average of your numbers is " + average);
				System.out.println("The amount of numbers you have entered is " + count);
				System.out.println("The smallest number you have entered is " + minNumber);
				System.out.println("The biggest number you have entered is " + maxNumber);
			
			} else {
				System.out.println("You did not press 42");
				sum += number;
				count++;
				//declaring min and max to first number entered
				if (firstIteration = true) {
					minNumber = number;
					maxNumber = number;
					firstIteration = false;
				} else {
					if (minNumber > number) {
						minNumber = number;
					}
					if (maxNumber < number) {
						maxNumber = number;
					}
					
				}
				
			}
			
		}

	}

}
