/*
 * A BigInteger demonstration class
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package bigIntegerExample;


// You will need the BigInteger class
import java.math.BigInteger;

public class BigIntegerExample {

	/**
	 * Demonstrate some BigInteger techniques
	 */
	public void Demo() {
		System.out.println("A demo of the BigInteger class...");
		
		// Declare and instantiate
		BigInteger alpha = new BigInteger("1");
		
		// Just declare
		BigInteger beta;
		
		// Add
		beta = alpha.add(new BigInteger("42"));
		
		// Print
		System.out.println("The result of addition is " + beta.toString());
		
		// Check the number of digits in the BigInteger object
		int numOfDigits = beta.toString().length();
		System.out.println("The BigInteger object has " + numOfDigits + " digits");
	}
}
