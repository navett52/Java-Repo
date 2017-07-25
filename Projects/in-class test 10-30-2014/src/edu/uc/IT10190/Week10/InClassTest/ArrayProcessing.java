/******************************************************
 * Evan Tellep                                        *  
 * assn. 9                                            *
 * 11/3/2015                                          *
 * IT1090C (Computer Programming 1)                   *
 * Follow the following comments                      *
 * Ref:                                               *
 ******************************************************/

/* Name: 
 * 
 * 
 * In-class Test 10-30-2014
 * Complete the six methods below as described in the comments. Use at least one loop in each method. Do not change the main method. 
 */

package edu.uc.IT10190.Week10.InClassTest;

public class ArrayProcessing {


	public static void main(String[] args) {
		int[] someArray = new int[6];
		someArray[0] = 10;
		someArray[1] = 11;
		someArray[2] = 12;
		someArray[3] = 13;
		someArray[4] = 14;
		someArray[5] = 15;
		
		System.out.print("Average: ");		Average(someArray); 	System.out.println();
		System.out.print("Max: ");			Max(someArray);         System.out.println();
		System.out.print("Min: ");			Min(someArray);         System.out.println();
		System.out.print("Sum: ");			Sum(someArray);         System.out.println();
		System.out.print("Print: ");		Print(someArray);     	System.out.println();
		System.out.print("Zero Count: ");	ScanForZero(someArray);	System.out.println();
		
		
	}
	// Calculate the average of the array, using at least one loop, and print it.
	/**
	 * Method finds the average of someArray
	 * @param someArray : this is the given array
	 */
	public static void Average(int[] someArray){
		//Declaring variable that holds comes to hold the average of the array
		float Average = someArray[0];
		//Loop adds all elements of someArray together
		for (int i = 1; i < 6; i++) {
			Average = Average + someArray[i];
		}
		//Takes the sum of array elements then divides it by the array length to determine the average
		Average = Average / someArray.length;
		//Prints the average
		System.out.print(Average);
	}
	
	// Find the maximum value in the array, using at least one loop, and print it,
	/**
	 * Method finds the maximum element within someArray
	 * @param someArray : this is the given array
	 */
	public static void Max(int[] someArray){
		//Setting maximumValue to lowest possible integer to ensure the first element of someArray will become the maximumValue
		int maximumValue = -2147483647;
		//Loop cycles through the elements of the array
		for (int i = 0; i < 6; i++) {
			//If statement determines if current maximumValue is less than the current element of someArray
			//If true maximumValue is then set equal to the current someArray element
			if (maximumValue < someArray[i]) {
				maximumValue = someArray[i];
			}
		}
		//Prints maximumValue
		System.out.print(maximumValue);
	}
	
	// Find the minimum value in the array, using at least one loop, and print it,
	/**
	 * Method finds the minimum element within someArray
	 * @param someArray : this is the given array
	 */
	public static void Min(int[] someArray){
		//Setting minimumValue to highest possible integer to ensure the first element of someArray will become the minimumValue
		int minimumValue = 2147483647;
		//Loop cycles through the elements of the array
		for (int i = 0; i < 6; i++) {
			//If statement determines if current minimumValue is greater than the current element of someArray
			//If true minimumValue is then set equal to the current someArray element
			if (minimumValue > someArray[i]) {
				minimumValue = someArray[i];
			}
		}
		//Prints minimumValue
		System.out.print(minimumValue);		
	}
	
	// Find the sum of the array, using at least one loop, and print it.
	/**
	 * Method finds the sum of all the elements in the someArray
	 * @param someArray : this is the given array
	 */
	public static void Sum(int[] someArray){
		//Declaring variable that holds comes to hold the sum of the array
		int Sum = someArray[0];
		//Loop adds all elements of someArray together
		for (int i = 1; i < 6; i++) {
			Sum = Sum + someArray[i];
		}
		//Prints the sum
		System.out.print(Sum);
	}
	
	// Print all the elements of the array using at least one loop.
	/**
	 * Method prints every element in someArray
	 * @param someArray : this is the given array
	 */
	public static void Print(int[] someArray){
		//loop cycles through someArray while printing each element as it cycles through the index
		for (int i = 0; i < 6; i++) {
			System.out.println(someArray[i]);
		}
	}
	
	// Scan all the elements of the array, using at least one loop, and count the number of zeroes in the array. Print that count.
	/**
	 * Method counts how many zeroes are present in all elements of someArray
	 * @param someArray : this is the given array
	 */
	public static void ScanForZero(int[] someArray){
		//Temp holds the modulo of 10 of the current element of someArray
		int temp = 0;
		//Count holds the count of how many zeroes there are in the elements of someArray
		int count = 0;
		//Loop cycles through someArray
		for (int i = 0; i < 6; i++) {
			//Checks modulo 10 for each element, if modulo is 0 then there is a zero
			temp = someArray[i] % 10;
			//If modulo is 0 and there is a zero count increments 1
			if (temp == 0) {
				count++;
			}
		}
		//prints count
		System.out.print(count);
	}
		
}
