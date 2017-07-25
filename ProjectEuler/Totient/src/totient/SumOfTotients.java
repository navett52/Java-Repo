/******************************************************
 * Evan Tellep                                        *
 * Practice problem given by Bill Nicholson           *
 * Completed 5/3/2016                                 *
 * Did it just because I could                        *
 * Holds the methods to find a numbers totient        *                                                 
 * Also includes a checkForPrime method               *
 * And a method the finds the sum of the totients of  *
 * all primes up to a specified prime                 *
 ******************************************************/

package totient;

import java.util.ArrayList;

public class SumOfTotients {
	/**
	 * Finds the sum of the totients of the specified amount of prime numbers using the prime number totient trick
	 * @return The sum of the totients of all primes less than the specified prime and the specified prime
	 */
	public int sumOfTotientsWithTrick(int specifiedPrime) {
		//Initializing the sum which is to be returned to 0
		int sum = 0;
		//Initializing a count of prime numbers to 0
		int primeCount = 0;
		//Initializing the count to be used to keep track of how many iterations
		int count = 0;
		//Cycles through all numbers less than the Int max value
		for (int i = 2; i < Integer.MAX_VALUE; i++) {
			//If the current number is prime
			if (checkForPrime(i) == true) {
				//Add it's totient to the sum (A Prime's totient is equal to the prime minus 1)
				sum += i - 1;
				//Increment the prime count
				primeCount++;
			}
			//If the primeCount equals the prime number specified
			if (primeCount == specifiedPrime) {
				//break out of the loop
				break;
			}
			//If i / 1000 gives a 0 remainder
			if (i % 1000 == 0) {
				//Increment the count
				count++;
				//Print how many thousand numbers have been cycled through
				System.out.println(count + " thousand increments have been traversed");
			}
		}
		//Return the sum of the totients
		return sum;
	}
	
	
	/**
	 * Finds the sum of the totients of the specified amount of prime numbers
	 * (Takes a really long time if the number is large)
	 * @return The sum of the totients of the specified amount of prime numbers
	 */
	public int sumOfTotients(int specifiedPrime) {
		//Initializing the sum which is to be returned to 0
		int sum = 0;
		//Initializing a count of prime numbers to 0
		int primeCount = 0;
		//Initializing the count to be used to keep track of how many iterations
		int count = 0;
		//Cycles through all numbers less than the Int max value
		for (int i = 2; i < Integer.MAX_VALUE; i++) {
			//If i / 1000 gives a 0 remainder
			if (i % 1000 == 0) {
				//Increment the count
				count++;
				//Print how many thousand numbers have been cycled through
				System.out.println(count + " thousand increments have been traversed");
			}
			//If the current number is prime
			if (checkForPrime(i) == true) {
				//Increment the primeCount
				primeCount++;
				//Find the numbers totient using the getTotient() method, add it to the sum of the totients
				sum += getTotient(i);
			}
			//If primeCount equals the specified number of prime
			if (primeCount == specifiedPrime) {
				//break out of the loop
				break;
			}
		}
		//Return the sum of the totients
		return sum;
	}

	/**
	 * Finds the totient value of a number
	 * @param number The number you want the totient value for
	 * @return The totient value of the specified number
	 */
	public int getTotient(int number) {
		//Initializing the totient count to 1 since 1 is relatively prime to all numbers
		int totient = 1;
		//Setting the commonFactorCount to 1 to ensure that it will inherently not effect the totient count
		int commonFactorCount = 1;
		//Cycle through and grab a number less than the specified number
		for (int i = 2; i < number; i++) {
			//Set commonFactorCount to 0 so that if there are no common factors totient will be incremented
			commonFactorCount = 0;
			//Cycle through the specified number to find it's factors
			for (int j = 2; j < number; j++) {
				//If j is a factor of the specified number
				if (number % j == 0) {
					//and if i shares that factor
					if (i % j == 0) {
						//commonFactorCount will increment
						commonFactorCount++;
						//and then break out of the loop
						break;
					}
				}
			}
			//if i makes it through to here without incrementing the commonFactorCount then totient will increment
			if (commonFactorCount == 0) {
				totient++;
			}
		}
		//return the total totient count of the specified number
		return totient;
	}
	
	/**
	 * Checks for primeness.
	 * @param number The number to be checked.
	 * @return True or false whether the number is prime or not.
	 */
	 public static boolean checkForPrime(int number) {
		 if (number != 2) {
		 	if (number % 2 == 0) return false;
		 }
		 int limit = (int) (Math.sqrt(number)+1);

		 //Cycle through all numbers, starting from 2 (since all numbers are divisible by 1), smaller than the number to be checked
		 for(int i = 3; i <= limit; i+=2) {
		 //If a number is found that returns 0 as remainder the number is not prime and returns false
         if(number % i == 0)
             return false;
     	 }
     	 //If no number is found that returns a 0 remainder the number is prime.
     	 return true;
	 }
}
