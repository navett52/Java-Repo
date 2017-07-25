/******************************************************
 * Evan Tellep                                        *
 * Assignment 11                                      *
 * 11/17/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * Writing isPrime method to work with BigInteger     *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment11;

//importing the java math class
import java.math.*;

public class Utilities {
	
	private BigInteger bigNum;
	
	/**
	 * Method tests to see if any BigInteger isPrime
	 * @param bigNum : Variable we are checking primeness of
	 * @return : returns true or false depending on primeness
	 */
	public boolean isPrime(BigInteger bigNum) {
		BigInteger i;
		for (i = new BigInteger("2"); i.compareTo(bigNum) > 0; i.add(BigInteger.ONE)) {
			System.out.println(i);
			if((bigNum.remainder(i)).compareTo(BigInteger.ZERO) == 0) {
				return false;
			}
			return true;
		}
		return true;
	}
	
	/**
	 * Method returns bigNum
	 * @return
	 */
	public BigInteger getBigNum() {
		return bigNum;
	}
	
	/**
	 * Method sets bigNum to a new value
	 * @param bigNum
	 */
	public void setBigNum(BigInteger bigNum) {
		this.bigNum = bigNum;
	}
	
}
