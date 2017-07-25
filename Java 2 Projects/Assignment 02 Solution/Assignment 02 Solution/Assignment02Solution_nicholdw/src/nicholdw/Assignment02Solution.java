/******************************************************************************************
 * A wonky way to solve the problem.                                                      *
 * Generate random strings of A' and B's until we get the desired pair count.             *
 * Bill Nicholson                                                                         *
 * nicholdw@ucmail.uc.edu                                                                 *
 * ****************************************************************************************/
 
package nicholdw;

import java.util.Random;

public class Assignment02Solution {

	public static void main(String args[])
	{
		Assignment02Solution a02 = new Assignment02Solution();		
		String myString = a02.Solve(10,5);
		System.out.println("A solution is " + myString);

		myString = a02.Solve(3,2);
		System.out.println("A solution is " + myString);
		
		// Will this ever solve?
		myString = a02.Solve(30,50);
		System.out.println("A solution is " + myString);
	}
	/***
	 * Solve the problem
	 * @param length The desired length of the final string
	 * @param pairCount The desired number of pairs in the final string
	 * @return A string of 'length' characters that contains pairCount pairs.
	 */
	private String Solve(int length, int pairCount) {
		String result = "";
		Random r = new Random();	// Truly random. No seed.
		int iterationCount = 0;
		while (true) {
			result = "";
			// Generate a random string of the desired length consisting of A's and B's.
			for (int i = 0; i < length; i++) {
				if (r.nextInt(2) == 1) {	// Generate a random number that can only be 0 or 1.
					result += "A";
				} else {
					result += "B";
				}
			}
			System.out.println(result);
			iterationCount++;
			if (countPairs(result) == pairCount) break;
		}
		System.out.println(iterationCount + " iterations");
		
		return result;
	}
	/***
	 * Count the AB pairs in a string
	 * @param s The string to be processed
	 * @return The number of AB pairs in s
	 */
	private int countPairs(String s) {
		int pairCount = 0, aCount = 0; 
		// Step through the string one char at a time.
		for (int i = 0; i < s.length(); i++) {
			String c;
			c = s.substring(i, i+1);	 // Extract the next character in the string
			if (c.equals("A")) {
				aCount++;
			} else {
				if (c.equals("B")) {
					// The number of A's preceding this B is the number of pairs that we can ake with this B
					pairCount += aCount;
				}
			}
		}
		return pairCount;
	}
}
