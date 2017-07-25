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
import java.math.BigInteger;
import java.util.Scanner;
public class BigIntMain
{
	public static void main(String[] args)
	{	//Declare/Instantiate an object of BigIntEuclid class
		BigIntEuclid biggcd = new BigIntEuclid();
		
		//test case one
		BigInteger testOneA = new BigInteger("2500000000000000000000000000000000000");
		BigInteger testOneB = new BigInteger("50000000");
		System.out.println("GCD of " + testOneA +" and " + testOneB +" is : " + biggcd.biggcd(testOneA,testOneB));
		System.out.println("Test Case One Passed");
		
		//test case two
		BigInteger testTwoA = new BigInteger("125324543654756578968098076576676666666665");
		BigInteger testTwoB = new BigInteger("25");
		System.out.println("GCD of " + testTwoA +" and " + testTwoB +" is : " + biggcd.biggcd(testTwoA,testTwoB));
		System.out.println("Test Case Two Passed");
				
		//test case three
		BigInteger testThreeA = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		BigInteger testThreeB = new BigInteger("10000");
		System.out.println("GCD of " + testThreeA +" and " + testThreeB +" is : " + biggcd.biggcd(testThreeA,testThreeB));
		System.out.println("Test Case Three Passed");
				
		//Print 3 empty lines to separate test cases from user input
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//Enter two numbers whose GCD needs to be calculated.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Remember -- A needs to be greater than or equal to B");
		System.out.println("Please enter 'A'");
		BigInteger a = scanner.nextBigInteger();
		System.out.println("Please enter 'B'");
		BigInteger b = scanner.nextBigInteger();
		System.out.println("GCD of " + a +" and " + b +" is : " + biggcd.biggcd(a,b));
		scanner.close();
	}
}
