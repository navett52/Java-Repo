/******************************************************
 * Evan Tellep                                        *
 * Assignment 04                                      *
 * 02/09/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Finds the GCD of two numbers using int             *                                                 
 * Ref:                                               *
 ******************************************************/

package tellepet_Assignment04;

public class Euclid {
	/**
	 * This method calculates the GCD between two numbers entered with a having to be bigger than b
	 * @param a the larger number to be entered
	 * @param b the smaller number to be entered
	 * @return The Greatest Common Divisor of the two numbers
	 */
	public int gcd(int a, int b) {
		//Declaring the remainder variable outside of the loop to give it proper scope
		int remainder = 0;
		//This loop cycles through the numbers, continuously dividing them until the remainder is 0
		while (b != 0) {
			//Finds the remainder of the two numbers
			remainder = a % b;
			//Sets a to b
			a = b;
			//Sets b to the remainder
			b = remainder;
		}
		//Return the GCD
		return a;
		
	}

}
