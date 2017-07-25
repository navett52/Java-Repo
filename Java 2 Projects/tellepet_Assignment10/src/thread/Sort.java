/******************************************************
 * Evan Tellep                                        *
 * Assignment 10                                      *
 * 04/05/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Sort method used to take up a lot of time          *                                                    
 * Ref:Stack Overflow for timing                      *
 ******************************************************/

package thread;

import java.util.Random;

public class Sort extends Thread {
	//Setting total time so the main can access it
	private long totalTime = System.currentTimeMillis();
	
	public void run() {
		//Getting the start time
		final long startTime = System.currentTimeMillis();
		
		//declaring and instantiating a test array of unsorted numbers
		Random random = new Random();
		//Making an array to hold 100000 integers
		int[] test = new int[100000];
		//Assigns random numbers to the array
		for (int i = 0; i < test.length; i++) {
			test[i] = random.nextInt();
		}
		//sort the int array
		Sort sort = new Sort();
		
		//calling the sort method and assigning the returned array to the result array
		int[] result = sort.sort(test);
		
		System.out.println(result[100]);
		
		//Cycle through and print the result array
		/*for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}*/
		//getting the end time
		final long endTime = System.currentTimeMillis();
		//Figuring out total time elapsed
		setTotalTime(endTime - startTime);
		//printing out how long the thread took
		System.out.println("The sort thread ran for " + totalTime + " milliseconds.");
	}

	/**
	 * An insertion sort
	 * @param numArray The array to be sorted
	 * @return the sorted array
	 */
	public int[] sort(int[] numArray) {
		//Cycle through the original array
		for (int i = 1; i < numArray.length; i++) {
			//Set the current number at the index to x for safe keeping
			int x = numArray[i];
			//Set j to equal the index before the current index
			int j = i - 1;
			//Loop determines if the immediate previous indexes number is greater than the current number, and if it is, move the current number back 1 index
			while (j >= 0 && numArray[j] > x) {
				//Replace the number at index i with the number at index j
				numArray[j+1] = numArray[j];
				//Subtracts 1 from j to move backwards through the array
				j = j - 1;
			}
			//Adds 1 back to j and inserts the current indexes number back into the array where it belongs
			numArray[j + 1] = x;
		}
		//Returns the sorted array
		return numArray;
	}

	public long getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}

}