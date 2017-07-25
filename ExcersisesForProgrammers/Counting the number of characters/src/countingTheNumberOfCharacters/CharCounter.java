package countingTheNumberOfCharacters;

import java.util.Scanner;

public class CharCounter {
	
	public void CountChar() {
		//Importing the scanner class to obtain input.
		Scanner scanner = new Scanner(System.in);
		//Declaring a string to be used later.
		String string;
		//Prompting the user for input.
		System.out.print("What is the input string?");
		//Obtaining and storing the input given.
		string = scanner.next();
		//Prints the outcome telling them how many characters the entered string was.
		System.out.println(string + " has " + string.length() + " characters.");
		
	}
	
}
