/****************************************************************************************
 *	Matthew Frank																		*
 *	Assignment 04																		*
 *	Due: 02.09.16																		*
 *	IT2045C/003/16SS																	*
 *	Design and program a Java application to calculate the GCD as discussed in class.	*
 *	Euclid Class for calc - Main for exercise & test.									*
 *																						*
 *	EXTRA CREDIT - Also write BigInt gcd(Big a, Big b)									*
 ****************************************************************************************/
package greatestCommonDenominator;
import java.util.Scanner;
public class Main
{	public static void main(String[] args)
	{	
		//Declare/Instantiate an object of Euclid class 
		Euclid gcd = new Euclid();
		
		//test case one
		int testOneA = 25;
		int testOneB = 5;
		System.out.println("GCD of " + testOneA +" and " + testOneB +" is : " + gcd.gcd(testOneA,testOneB));
		System.out.println("Test Case One Passed");
		
		//test case two
		int testTwoA = 125;
		int testTwoB = 25;
		System.out.println("GCD of " + testTwoA +" and " + testTwoB +" is : " + gcd.gcd(testTwoA,testTwoB));
		System.out.println("Test Case Two Passed");
		
		//test case three
		int testThreeA = 1000000;
		int testThreeB = 10000;
		System.out.println("GCD of " + testThreeA +" and " + testThreeB +" is : " + gcd.gcd(testThreeA,testThreeB));
		System.out.println("Test Case Three Passed");
		
		//Print 3 empty lines to separate test cases from user input
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//Enter two numbers whose GCD needs to be calculated.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Remember -- A needs to be greater than or equal to B");
		System.out.println("Please enter 'A'");
		int a = scanner.nextInt();
		System.out.println("Please enter 'B'");
		int b = scanner.nextInt();
		System.out.println("GCD of " + a +" and " + b +" is : " + gcd.gcd(a,b));
		scanner.close();
	}
}
