/******************************************************
 * Evan Tellep                                        *
 * Assignment 10                                      *
 * 04/05/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Reading, sorting,then writing a file               *                                                    
 * Ref:Stack Overflow for timing(unfinished)          *
 ******************************************************/

package thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Arrays;

public class SortWithIO extends Thread {
	
	public void run() {
		
		//Using the ProcessFile method to process the names.csv file
		String[] document = ProcessFile("RandomNumbers.csv");
		String[] result = sort(document);
		//for loop prints the lines of the file that has been processed
		for (int i = 1; i < result.length; i ++) {
			System.out.println(result[i]);
		}

	}
	
	/**
	 * This method reads the file and prints the contents in alphabetical order by last name
	 * @param fileName This is the name of the file to be read
	 * @return Returns the String array of the file contents
	 * @throws FileReadingException Will throw a FileReadingException if it cannot read part of the file
	 */
	public String[] ProcessFile(String fileName) {
		//Declaring and instantiating the array to hold each line
		String[] doc = new String[21];
		
		try {
			//Instantiating a FileReader object to read the file.
			FileReader reader = new FileReader(fileName);
			//Instantiating a BufferedReader object to use the readLine() method.
			BufferedReader buffer = new BufferedReader(reader);
			//For loop fills the array with the lines read from the file.
			//It also splits the lines at the commas and puts the new lines into a multi-dimensional array
			for (int i = 0; i < doc.length; i++) {
				doc[i] = buffer.readLine();
			}
		//Catches the FileFound exception if the file cannot be found
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
			e.printStackTrace();
		//Catches the IO Exception
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Returns the doc array to be printed
		return doc;
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
	
	/**
	 * An insertion sort
	 * @param stringArray The array to be sorted
	 * @return the sorted array
	 */
	public String[] sort(String[] stringArray) {
		//Cycle through the original array
		for (int i = 1; i < stringArray.length; i++) {
			//Set the current number at the index to x for safe keeping
			String x = stringArray[i];
			//Set j to equal the index before the current index
			int j = i - 1;
			//Loop determines if the immediate previous indexes number is greater than the current number, and if it is, move the current number back 1 index
			while (j >= 0 && stringArray[j].compareTo(x) > 0) {
				//Replace the number at index i with the number at index j
				stringArray[j+1] = stringArray[j];
				//Subtracts 1 from j to move backwards through the array
				j = j - 1;
			}
			//Adds 1 back to j and inserts the current indexes number back into the array where it belongs
			stringArray[j + 1] = x;
		}
		//Returns the sorted array
		return stringArray;
	}
	
}
