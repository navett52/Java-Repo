/******************************************************
 * Evan Tellep                                        *
 * Assignment 02                                      *
 * 01/26/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Topcoder AB problem                                *                                                       
 * Ref: Bill's posted solution and notes              *
 ******************************************************/

package assignment02_tellepet;

public class AB {
	//Properties used throughout the class
	private static char[] x;
	
	private static char[] b;
	
	private int pairCounter;
	
	/**
	 * Method creates a string with length N and has K number of pairs if possible
	 * @param N Length of the String
	 * @param K Number of pairs you would like the String to have
	 * @return returns a String that satisfies the conditions
	 */
	public String createString(int N, int K) {
		//Limit will be used to help figure out if conditions cannot be met
		int limit = 0;
		
		//Creating a string to use as a blank string if the conditions cannot be met
		String blank = "";
		
		//Declaring stringForAB for later use
		String stringForAB = null;
		
		//Declaring x2 for later use
		String x2 = null;
		
		/**
		 * If the length of the desired string is greater than the number of pairs
		 * the code runs through this step which should return a string to satisfy
		 * the conditions
		 */
		if (N > K) {
			
		//Making the array length equal to the value of N - K - 1
		x = new char[N - K - 1];
		
		//Making the array length equal the value of K
		b = new char[K];
		
		//For loop cycles through the x array setting all spots to character 'B'
		for (int i = 0; i < N - K - 1; i++) {
			x[i] = 'B';
		}
		
		//For loop cycles through the b array setting all spots to character 'B'
		for (int i = 0; i < K; i++) {
			b[i] = 'B';
		}
		
		//Creates a string of just an "A" to e stuck between the arrays of 'B's
		String a = "A";
		
		//Assigns the array x to a string named x1
		String x1 = new String(x);
		
		//Assigns the array b to a string named b1
		String b1 = new String(b);
		
		//Combines all the string to form the string that will be returned to satisfy the conditions
		stringForAB = x1 + a + b1;
		
		//Returns the string that satisfies the conditions
		return stringForAB;
		
		/**
		 * The else if handles if the length is less than the number of pairs that are desired
		 */
		} else if (K > N) {
			
			//Declares the x array to have a length equal to the value of N
			x = new char [N];
			
			//Sets the first character in the array to 'A'
			x[0] = 'A';
			
			//For loop sets the rest of the array to be char 'B'
			for (int i = 1; i < N; i++) {
				x[i] = 'B';
			}
			
			//Testing to make sure the block works this far
			//System.out.println(x);
			
			int pairs = 0;
			int aCount = 0;
			//For loop cycles through the array x to make the length of posOfA equal to the number of 'A'
			//and to make the length of posOfB equal to the number of 'B'
			for (int i = 0; i < N; i++) {
				
				//Every time an 'A' appears increases the length of posOfA
				if (x[i] == 'A') {
					//posOfA = new int [i];
					aCount++;
				}
				
				//Every time a 'B' appears increases the length of posOfB
				if (x[i] == 'B') {
					pairs += aCount;
				}
				
			}
			// now we have the number of pairs in the string, in pairs.
			
			/**
			 * This section of code takes care of circumstances in which the pairCounter is not equal to K
			 */
			while (pairs < K) {
				//Increments limit variable to determine if there will never be a viable solution
				limit++;
				//if checks if limit is 100 and if so the conditions cannot be met
				if (limit == 1000) {
					return blank;
				}
				//Holds the number of A's
				aCount = 0;
				//Keeps track of the number of pairs
				pairs = 0;
				
				//Cycles through the x array backwards
				for (int a = x.length - 1; a > 0; a--) {
					
					//Takes out a 'B' and puts in an 'A' at the rightmost side of the x array
					x[a] = 'A';
					
					//This for loop checks for any new pairs
					//If there are none, goes back through the while loop
					for (int i = 0; i < N; i++) {
						
						//Every time an 'A' appears increases the length of posOfA
						if (x[i] == 'A') {
							//posOfA = new int [i];
							aCount++;
						}
						
						//Every time a 'B' appears increases the length of posOfB
						if (x[i] == 'B') {
							pairs += aCount;
						}
						
					}
					//If pairs is less than K resets the current 2nd A to a B and resets the aCount and pairs counter
					if (pairs < K) {
						x[a] = 'B';
						aCount = 0;
						pairs = 0;
					//If conditions are met it returns the string
					} else {
						x2 = new String(x);
						return x2;
					}
					
				}
				
			}
			
		}
		
		//Returns the blank string
		return blank;
	}
	
}
