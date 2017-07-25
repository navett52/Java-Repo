/******************************************************
 * Evan Tellep                                        *
 * Assignment 06                                      *
 * 02/23/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method of the project                     *                                                    
 * Ref: Old Programs                                  *
 ******************************************************/

package assignment06_tellepet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Importing the scanner class to be used for user input
		Scanner scanner = new Scanner(System.in);
		
		//Declares an integer that will hold the value for which prime we want to find
		int numberPrime;
		
		//Test case to find the 4th prime
		numberPrime = 4;
		int answer = PrimeFinder.findPrimeNumber(numberPrime);
		boolean check = PrimeFinder.checkForPrime(answer);
		System.out.println("It is " + check + " that " + answer + " is the " + numberPrime + " prime.");
		
		//Test case to find the 15th prime
		numberPrime = 15;
		answer = PrimeFinder.findPrimeNumber(numberPrime);
		check = PrimeFinder.checkForPrime(answer);
		System.out.println("It is " + check + " that " + answer + " is the " + numberPrime + " prime.");
		
		//Test case to find the 700th prime
		numberPrime = 700;
		answer = PrimeFinder.findPrimeNumber(numberPrime);
		check = PrimeFinder.checkForPrime(answer);
		System.out.println("It is " + check + " that " + answer + " is the " + numberPrime + " prime.");
		
		//Finding the 10001st prime as the assignment stated
		numberPrime = 10001;
		answer = PrimeFinder.findPrimeNumber(numberPrime);
		check = PrimeFinder.checkForPrime(answer);
		System.out.println("It is " + check + " that " + answer + " is the " + numberPrime + " prime.");
		
		//Allowing user to enter whichever prime they feel like finding.
		System.out.println("Please enter what number prime you would like to find. Ex. 7 is the 4th prime so you would enter a 4 to get 7.");
		numberPrime = scanner.nextInt();
		answer = PrimeFinder.findPrimeNumber(numberPrime);
		check = PrimeFinder.checkForPrime(answer);
		System.out.println("It is " + check + " that " + answer + " is the " + numberPrime + " prime.");
	}
}
