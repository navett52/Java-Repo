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

package SpellCheckPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 * @author jdusing
 *
 *				The SpellCheck class reads in all words from the dictionary file english.ALL.txt
 *				After reading in the file, the sentence is split into words and the words are
 *				checked for spelling errors.  If the first letter is upper case, the word is check 
 *				with it's lower case equivalent to see if the word is spelled correctly.
 */
public class SpellCheck {

	/**
	 * 
	 * @param sentence = String to be spell checked
	 * @returns ArrayList of miss spelled words or NULL if the Dictionary is not found
	 * @throws Exception if file english.ALL.txt is not found 
	 */
	
		// WordList is the array of words to be checked.
		static ArrayList<String> WordList = new ArrayList()  ;

		public static ArrayList<String> SpellCheck(String sentence) throws Exception {

			// regular expression to remove question marks, commas, white space, periods and exclamation.
//			String pattern = "[,\\s.]+" ; 
			String pattern = "[?,\\s.!]+" ;

			if (!Init()) {
				System.out.println ("\nDictionary file does not exists") ;
				return null ;
			}

			// Split the sentence into individual words to be check
			String wordsToBeChecked[] = sentence.split(pattern) ;
			System.out.println ("Number of words to be checked = " + wordsToBeChecked.length) ;
			
			// Establish new string array for words not in the dictionary
			ArrayList<String> wordsNotInDictionary = new ArrayList<String>() ;
			
			// Check each word, check to see if it's in the dictionary
			for (int i = 0; i < wordsToBeChecked.length; i++) {
				if (WordList.contains(wordsToBeChecked[i])) {
					System.out.println ("Word '" + wordsToBeChecked[i] + "' is in dictionary") ;
				}
				// Word is not in the dictionary
				else {
					System.out.println ("Word '" + wordsToBeChecked[i] + "' is NOT in dictionary") ;
					
					// Let's see if the first character is upper case, if so, we need to check for lower case
					if (Character.isUpperCase(wordsToBeChecked[i].charAt(0))) {
						System.out.println ("First character is uppercase, need to check again") ;
						
						// First letter IS upper case.  Let's see if it's lower case is in dict.
						if (WordList.contains(wordsToBeChecked[i].toLowerCase())) {
							System.out.println ("Word '" + wordsToBeChecked[i].toLowerCase() + "' is in dictionary") ;
						} else {
							// Lower case is not in dictionary either.  It's miss spelled
							System.out.println ("Word '" + wordsToBeChecked[i].toLowerCase() + "' STILL is NOT in dictionary") ;
							wordsNotInDictionary.add(wordsToBeChecked[i]) ;
						} 
					} else
					// First letter was not upper case so word wasn't in the dictionary at all. 
					wordsNotInDictionary.add(wordsToBeChecked[i]) ;
				}
			}
			return wordsNotInDictionary;
		}
		
		/**
		 * 
		 * @returns TRUE if file exists.
		 * @throws Exception if there is an error with the file and 
		 */
		private static boolean Init () throws Exception  {
			
			FileReader myFileReader ;
//			ArrayList<String> WordList = new ArrayList()  ;
			
			// Check to see if file exists.  If so, good, otherwise throw an exception
			try {
			    myFileReader = new FileReader("english.ALL.txt");
			} catch(Exception ex) {
			  System.out.println("Error opening file: " + ex.getLocalizedMessage());
			  throw new Exception ("Error opening file 'english.ALL.txt'") ;
			}
			
//			If i get here, I was able to open the file.
			BufferedReader dictionary = new BufferedReader (myFileReader) ;
			
			String tmp ;
			
//			Read the file a line at a time.
			while ((tmp = dictionary.readLine()) != null )
				WordList.add(tmp) ;
					
			System.out.println ("Words read in from dictionary = " + WordList.size()) ;
			return true;
		}
}
