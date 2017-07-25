package madLib;

import java.util.Scanner;

public class MadLibClass {
	
	public void CreateMadLib() {
		//Importing the scanner class to get input.
		Scanner scanner = new Scanner(System.in);
		//Prompting the user for the various words needed to construct a sentence.
		System.out.print("Please enter a noun:");
		String noun = scanner.nextLine();
		System.out.print("Please enter a verb:");
		String verb = scanner.nextLine();
		System.out.print("Please enter an adjective:");
		String adjective = scanner.nextLine();
		System.out.print("Please enter a adverb:");
		String adverb = scanner.nextLine();
		//Using string interpolation to form the ad lib sentence.
		String output = String.format("Do you %s your %s %s %s?", verb, adjective, noun, adverb);
		//Print the final output.
		System.out.println(output);
		
	}
	
}
