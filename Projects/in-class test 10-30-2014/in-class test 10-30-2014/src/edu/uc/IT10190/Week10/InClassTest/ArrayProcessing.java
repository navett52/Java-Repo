/* Name: 
 * 
 * 
 * In-class Test 10-30-2014
 * Complete the six methods below as described in the comments. Use at least one loop in each method. Do not change the main method. 
 */

package edu.uc.IT10190.Week10.InClassTest;

public class ArrayProcessing {


	public static void main(String[] args) {
		int[] someArray = new int[5];
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
	public static void Average(int[] myArray)
	{
	}
	
	// Find the maximum value in the array, using at least one loop, and print it,
	public static void Max(int[] myArray){
	}
	
	// Find the minimum value in the array, using at least one loop, and print it,
	public static void Min(int[] myArray){
	}
	
	// Find the sum of the array, using at least one loop, and print it.
	public static void Sum(int[] myArray){
	}
	
	// Print all the elements of the array using at least one loop.
	public static void Print(int[] myArray){
	}
	
	// Scan all the elements of the array, using at least one loop, and count the number of zeroes in the array. Print that count.
	public static void ScanForZero(int[] myArray){
	}
	
	
}
