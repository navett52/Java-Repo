/******************************************************
 * Evan Tellep                                        *
 * Insertion Sort                                     *
 * 03/15/2016                                         *
 *                                                    *
 * Main method to test if insertion sort works        *                                                    
 * Ref: wikipedia p-code                              *
 ******************************************************/

package practice_InsertionSort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//declaring and instantiating a test array of unsorted numbers
		
		Random random = new Random();
		
		int[] test = new int[100000];
		
		for (int i = 0; i < test.length; i++) {
			test[i] = random.nextInt();
		}
		
		/*int[] test = new int[9];
		
		test[0] = 6;
		test[1] = 4;
		test[2] = 7;
		test[3] = 2;
		test[4] = 8;
		test[5] = 9;
		test[6] = 1;
		test[7] = 3;
		test[8] = 5;*/
		
		//Declaring and instantiating the sort object
		InsertionSort sorting = new InsertionSort();
		//calling the sort method and assigning the returned array to the result array
		int[] result = sorting.sort(test);
		//Cycle through and print the result array
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
