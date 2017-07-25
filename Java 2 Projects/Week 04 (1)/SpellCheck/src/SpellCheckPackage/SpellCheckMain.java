// Name(s): 		Jim Dusing
// Assignment:		SpellCheck Program
// Due Date:		1/29/2012
// Course Title:	(13SS) COMP PROGRAM II (005)
// Description:
//				Program to spell check a sentence.
//				Sentence is read in and passed to the "SpellCheck" class for spell checking.
//				The SpellCheck class reads in all words from the dictionary file english.ALL.txt
//				After reading in the file, the sentence is split into words and the words are
//				checked for spelling errors.  If the first letter is upper case, the word is check 
//				with it's lower case equivalent to see if the word is spelled correctly.
// References:	
// Other: 
//              2/3/2012 Bill Nicholson added test() method

package SpellCheckPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class SpellCheckMain {

	public static void main(String[] args) throws Exception {
		Test();
		
		
		// Get input from user on string to be checked
		Scanner input = new Scanner(System.in) ;
		System.out.print ("Enter a string to be spell checked: ") ;
		String sentence = input.nextLine() ;
		
		// Get list of miss spelled words.
		ArrayList<String> missSpelledWords = SpellCheck.SpellCheck(sentence) ;
		
		// Print out all the miss spelled words
		System.out.println();
		for (int i = 0; i < missSpelledWords.size(); i++) {
			System.out.println("Miss spelled word: " + missSpelledWords.get(i)) ;
		}
		// If size of the array returned is 0 then there were no miss spelled words.
		if (missSpelledWords.size() == 0)
			System.out.println ("No miss spelled words were found") ;
	}
	/**
	 * Added by Bill Nicholson
	 */
	private static void Test() 
	{
		int failureCount = 0;
		String test = "";	// Empty String
		ArrayList<String> missSpelledWords = null;
//		Test #1
		/*try {
			missSpelledWords = SpellCheck.SpellCheck(test) ;
		} catch (Exception ex) {}	// Eat it?
		if (missSpelledWords.size() != 0) {
			System.out.println("Test 1 FAILED");
			failureCount++;
		}*/
//		Test #2
		test = "Hello World";
		try {
			missSpelledWords = SpellCheck.SpellCheck(test) ;
		} catch (Exception ex) {}	// Eat it?
		if (missSpelledWords.size() != 0) {
			System.out.println("Test 2 FAILED");
			failureCount++;
		}
			
//		Test #3
		test = "Huello Wurld";
		try {
			missSpelledWords = SpellCheck.SpellCheck(test) ;
		} catch (Exception ex) {}	// Eat it?
		if (!(missSpelledWords.contains("Huello")) || !(missSpelledWords.contains("Wurld"))) {
			System.out.println("Test 3 FAILED");
			failureCount++;
		}

//		Test #4. First and last words in the list
		test = "ACM zygotes";
		try {
			missSpelledWords = SpellCheck.SpellCheck(test) ;
		} catch (Exception ex) {}	// Eat it?
		if (missSpelledWords.size() != 0) {
			System.out.println("Test 4 FAILED");
			failureCount++;
		}
//		Test #5. Punctuation
		test = "Hello! Wurld.";
		try {
			missSpelledWords = SpellCheck.SpellCheck(test) ;
		} catch (Exception ex) {}	// Eat it?
		if (missSpelledWords.size() != 0) {
			System.out.println("Test 5 FAILED");
			failureCount++;
		}

		if (failureCount > 0) {
			System.out.println(failureCount + " tests failed.");
		} else {
			System.out.println("All is well. No tests failed.");
		}
}
}


