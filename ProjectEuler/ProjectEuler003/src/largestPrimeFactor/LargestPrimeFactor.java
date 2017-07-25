package largestPrimeFactor;

import java.math.BigInteger;

public class LargestPrimeFactor {
	
	public BigInteger largestPrimeFactor(BigInteger number) {
		BigInteger answer = new BigInteger("0");
		for (BigInteger i = new BigInteger("2"); i.compareTo(number) < 0; i = i.add(BigInteger.ONE)) {
			if (checkForBigIntPrimeOptomized(i) == true) {
				if (number.mod(i) == BigInteger.ZERO) {
					System.out.println("Found a prime factor: " + i);
					answer = i;
				}
			}
		}
		return answer;
	}
	
	/**
	 * Checks for primeness.
	 * @param number The number to be checked.
	 * @return True or false whether the number is prime or not.
	 */
	 public static boolean checkForBigIntPrimeOptomized(BigInteger number) {
		 BigInteger two = new BigInteger("2");
		 BigInteger limit = new BigInteger("0");
		 if (number.compareTo(two) != 0) {
		 	if (number.mod(two) == BigInteger.ZERO) return false;
		 }
		 limit = sqrt(number).add(BigInteger.ONE);

		 //Cycle through all numbers, starting from 2 (since all numbers are divisible by 1), smaller than the number to be checked
		 for(BigInteger i = new BigInteger("3"); i.compareTo(limit) < 0; i = i.add(two)) {
		 //If a number is found that returns 0 as remainder the number is not prime and returns false
         if(number.mod(i) == BigInteger.ZERO)
             return false;
     	 }
     	 //If no number is found that returns a 0 remainder the number is prime.
     	 return true;
	 }
	
	/**
	 * Checks for primeness using BigInt.
	 * @param number The BigInt number to be checked.
	 * @return True or false whether the BigInt number is prime or not.
	 */
	public static boolean checkForBigIntPrime(BigInteger number) {
		//Cycle through all numbers, starting from 2 (since all numbers are divisible by 1), smaller than the number to be checked
	    for(BigInteger i = new BigInteger("2"); i.compareTo(number) < 0; i = i.add(BigInteger.ONE)) {
	    	//If a number is found that returns 0 as remainder the number is not prime and returns false
	        if(number.mod(i) == BigInteger.ZERO)
	            return false;
	    }
	    //If no number is found that returns a 0 remainder the number is prime.
	    return true;
	}
	
	/**
	 * Checks for primeness.
	 * @param number The number to be checked.
	 * @return True or false whether the number is prime or not.
	 */
	 public static boolean checkForPrimeOptomized(int number) {
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
	 
	 //sqrt by Faruk Akgul
	 //http://faruk.akgul.org/blog/javas-missing-algorithm-biginteger-sqrt/
	 public static BigInteger sqrt(BigInteger n) {
		  BigInteger a = BigInteger.ONE;
		  BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		  while(b.compareTo(a) >= 0) {
		    BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
		    if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
		    else a = mid.add(BigInteger.ONE);
		  }
		  return a.subtract(BigInteger.ONE);
		}
	 
}
