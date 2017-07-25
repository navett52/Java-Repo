/******************************************************
 * Evan Tellep                                        *
 * Assignment 04                                      *
 * 02/09/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method tests the classes                  *                                                    
 * Ref: http://www.softschools.com/quizzes/math/greatest_common_factors/quiz3219.html *
 ******************************************************/

package tellepet_Assignment04;
//importing the BigInteger class so I can declare proper variables
//and the Scanner class to obtain input
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Importing the Scanner to allow for user input
		Scanner scanner = new Scanner(System.in);
		
		//instantiating a new Euclid object to be used in tests
		Euclid finder = new Euclid();
		
		//Declaring a variable gcd1 to hold the results of the gcd method, then prints the result
		int gcd1 = finder.gcd(75, 25);
		System.out.println(gcd1);
		System.out.println("Test: Passed");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Declaring a variable gcd2 to hold the results of the gcd method, then prints the result
		int gcd2 = finder.gcd(35, 10);
		System.out.println(gcd2);
		System.out.println("Test: Passed");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Declaring a variable gcd3 to hold the results of the gcd method, then prints the result
		int gcd3 = finder.gcd(27, 18);
		System.out.println(gcd3);
		System.out.println("Test: Passed");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Declaring a variable gcd4 to hold the results of the gcd method, then prints the result
		int gcd4 = finder.gcd(72, 32);
		System.out.println(gcd4);
		System.out.println("Test: Passed");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Declaring a variable gcd5 to hold the results of the gcd method, then prints the result
		int gcd5 = finder.gcd(36, 9);
		System.out.println(gcd5);
		System.out.println("Test: Passed");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Instantiating a new EuclidBigInt object to be used for tests
		EuclidBigInt test = new EuclidBigInt();
		
		//Declaring and instantiating two BigIntegers to be used in a test
		BigInteger a1 = new BigInteger("1050809373467776193539");
		BigInteger b1 = new BigInteger("32416190071");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Declaring a BigInteger variable to hold the results of the EuclidBigInt test, then prints the result
		BigInteger bigGCD = test.gcd(a1, b1);
		System.out.println(bigGCD);
		System.out.println("Test for EuclidBigInt: Pass");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Declaring and instantiating two BigIntegers to be used in a test
		BigInteger bigHonkingPrime1A = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000237000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000167111761000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000039605487357");
		BigInteger bigHonkingPrime1B = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000167111761");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//Declaring a BigInteger variable to hold the results of the EuclidBigInt test, then prints the result
		BigInteger bigGCD2 = test.gcd(bigHonkingPrime1A, bigHonkingPrime1B);
		System.out.println(bigGCD2);
		System.out.println("Test for EuclidBigInt: Pass");
		
		//Printing a blank line to create a gap between hard-coded test cases and the area where the end-user will interact with the program
		System.out.println();
		
		//This is where the end-user will interact with the program
		System.out.println("This program computes the Greatest Common Divisor of two numbers");
		System.out.println("Please enter two numbers, with the first number being bigger than the second.");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int userGCD = finder.gcd(input1, input2);
		System.out.println("The GCD of " + input1 + " and " + input2 + " is " + userGCD);
	}

}
