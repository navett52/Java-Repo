package sayingHello;

import java.util.Scanner;

public class HelloWorld {
	
	public void Greet() {
		//Importing the Scanner class to obtain input.
		Scanner scanner = new Scanner(System.in);
		//Asking them to provide input.
		System.out.print("What is your name?");
		//Obtaining and storing the input.
		String name = scanner.next();
		//Concatenating the string
		String greeting = "Hello, " + name + ", nice to meet you!";
		//Printing out the greeting
		System.out.println(greeting);
	
	}
	
}
