/******************************************************
 * Evan Tellep                                        *
 * Assignment 03                                      *
 * 02/02/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method of the project                     *                                                    
 * Ref:                                               *
 ******************************************************/

package tellepet_Assignment03;

public class Main {

	public static void main(String[] args) {
		//declaring and instantiating a new ProcessFile object
		ProcessFile file = new ProcessFile();
		
		try {
			//Using the ProcessFile method to process the names.csv file
			String[] document = file.ProcessFile("names.csv");
			//for loop prints the lines of the file that has been processed
			for (int i = 1; i < document.length; i ++) {
				System.out.println(document[i]);
			}
		//Catches the FileReadingException if it is thrown
		} catch (FileReadingException e) {
			e.printStackTrace();
		}

	}

}
