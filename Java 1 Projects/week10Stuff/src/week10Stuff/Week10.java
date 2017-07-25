package week10Stuff;

import java.util.Scanner;

public class Week10 {

	public static void main(String[] args) {
		
		//some string things
		String licensePlate;
		
		//Read from the keyboard into licensePlate
		Scanner scanner = new Scanner(System.in);
		licensePlate = scanner.nextLine();
		
		//Print what we just read so we know it works
		System.out.println(licensePlate);
		
		//How long is the license plate number? Print the length.
		int licensePlateLength = licensePlate.length();
		System.out.println("Your license plate is " + licensePlateLength + " characters long.");
		
		//what is the first character of the license plate?
		System.out.println("Your license plate begins with " + licensePlate.charAt(0));
		
		//Print the second and third characters. Don't use charAt.
		System.out.println("The second and third characters in your license plate are " + licensePlate.substring(1, 3));
		
		//Write a loop to process the string one character at a time.
		//Count the number of characters in the string that are letters
		int numOfLetters = 0;
		for (int i = 0; i < licensePlate.length(); i++) { //A rudimentary design pattern!
			if (Character.isLetter(licensePlate.charAt(i))) {
				numOfLetters ++;
			}
		}
		System.out.println("Your license plate has " + numOfLetters + " letters.");
		
		//Print the string backwards
		String temp = "";
		for (int i = licensePlate.length() - 1; i >= 0; i--) { //There is a built in method for this; Look it up
			System.out.print(licensePlate.charAt(i));
		}
	}
}
