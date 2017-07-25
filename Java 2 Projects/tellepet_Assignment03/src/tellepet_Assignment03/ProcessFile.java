/******************************************************
 * Evan Tellep                                        *
 * Assignment 03                                      *
 * 02/02/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Read a file and return the contents                *                                                    
 * Ref:                                               *
 ******************************************************/

package tellepet_Assignment03;
//Importing utilities to use
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProcessFile {
	/**
	 * This method reads the file and prints the contents in alphabetical order by last name
	 * @param fileName This is the name of the file to be read
	 * @return Returns the String array of the file contents
	 * @throws FileReadingException Will throw a FileReadingException if it cannot read part of the file
	 */
	public String[] ProcessFile(String fileName) throws FileReadingException {
		//Declaring and instantiating the array to hold the records
		String[] doc = new String[21];
		//Multi-Dimensional array to hold the rows of data
		String[][] names = new String[21][6];
		
		try {
			//Instantiating a FileReader object to read the file.
			FileReader reader = new FileReader(fileName);
			//Instantiating a BufferedReader object to use the readLine() method.
			BufferedReader buffer = new BufferedReader(reader);
			//For loop fills the array with the lines read from the file.
			//It also splits the lines at the commas and puts the new lines into a multi-dimensional array
			for (int i = 0; i < doc.length; i++) {
				doc[i] = buffer.readLine();
				names[i] = doc[i].split(",");
			}
		//Catches the custom file reading exception
		} catch (FileReadingException e) {
			 System.out.println(e.Message);
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
}
