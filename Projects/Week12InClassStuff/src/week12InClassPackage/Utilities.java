/******************************************************
 * Evan Tellep                                        *
 * Assignment 11                                      *
 * 11/17/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * Writing isPrime method to work with BigInteger     *
 * Ref:                                               *
 ******************************************************/

package week12InClassPackage;

import java.math.BigInteger;

public class Utilities {
	
	public boolean isPrime(BigInteger bigNum) {
		
		if (bigNum.isProbablePrime(1)) {
			return true;
		}
		
		return false;		
	}
}
