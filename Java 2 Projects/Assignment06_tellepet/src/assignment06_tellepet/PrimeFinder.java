/******************************************************
 * Evan Tellep                                        *
 * Assignment 06                                      *
 * 02/23/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Finds a specified prime number                     *                                                    
 * Ref:Old programs                                   *
 ******************************************************/

package assignment06_tellepet;

public class PrimeFinder {
	/**
	 * Finds a specific prime identified by what number prime it is.
	 * @param primeCounterMax Which prime you want to find.
	 * @return The prime number you want
	 */
	public static int findPrimeNumber(int primeCounterMax) {
		//used to keep track of how many primes have been found
		int primeCounter = 0;
		//the starting number so 2 is included in the prime count.
		int number = 1;
		/**
		 * while loop cycles through all numbers until the prime specified is found
		 */
		while(primeCounter != primeCounterMax) {
			//increments the number
			number++;
			//Checks to see if the current number is prime
		    boolean check = checkForPrime(number);
		    //If the current number is prime increment the primeCounter.
		    if (check == true) {
		    	primeCounter++;
		    }
		}
		//return the prime that was specified
		return number;
    }
	/**
	 * Checks for primeness.
	 * @param number The number to be checked.
	 * @return True or false whether the number is prime or not.
	 */
	public static boolean checkForPrime(int number) {
		//Cycle through all numbers, starting from 2 (since all numbers are divisible by 1), smaller than the number to be checked
	    for(int i = 2; i < number; i++) {
	    	//If a number is found that returns 0 as remainder the number is not prime and returns false
	        if(number % i == 0)
	            return false;
	    }
	    //If no number is found that returns a 0 remainder the number is prime.
	    return true;
	}
}
