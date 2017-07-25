/******************************************************
 * Evan Tellep                                        *
 * Assignment 04                                      *
 * 02/09/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Will find the GCD between two numbers using BigInt *                                                    
 * Ref:                                               *
 ******************************************************/

package tellepet_Assignment04;

import java.math.BigInteger;

public class EuclidBigInt {
	/**
	 * This method calculates the GCD between two BigInteger numbers entered with a having to be bigger than b
	 * @param a the larger number to be entered
	 * @param b the smaller number to be entered
	 * @return The Greatest Common Divisor of the two numbers
	 */
	public BigInteger gcd(BigInteger a, BigInteger b) {
		//Declaring and Instantiating a variable to 0 to be compared to the value that is returned by the compareTo method of BigInt
		BigInteger compareValue = new BigInteger("0");
		
		//Declaring and instantiating the remainder variable outside of the loop to give it proper scope
		BigInteger remainder = new BigInteger("0");
		
		//Declaring a variable to hold the value returned from the compareTo method
		int compared;
		
		//The initial comparison of the second BigInt to 0
		compared = b.compareTo(compareValue);
		
		//This loop cycles through the numbers, continuously dividing them until the remainder is 0 and finds the GCD
		while (compared != 0) {
			//Finds the remainder of the two numbers
			remainder = a.mod(b);
			//Sets the value of a to the value of b
			a = b;
			//Sets the value of b to the value of remainder
			b = remainder;
			//Compares b to 0 to update the compare value and see if the remainder is equal to 0
			compared = b.compareTo(compareValue);
		}
		//Returns the GCD
		return a;
		
	}

}
