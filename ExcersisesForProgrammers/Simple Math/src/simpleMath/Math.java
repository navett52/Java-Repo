package simpleMath;

import java.util.Scanner;

public class Math {
	
	public void basicMath() {
		//Importing the scanner to acquire input.
		Scanner scanner = new Scanner(System.in);
		//Prompting for the first number to be computed.
		System.out.print("What is the first number you wish to compute?");
		String num1 = scanner.nextLine();
		//Prompting for the second number to be computed.
		System.out.print("What is the second number you wish to compute?");
		String num2 = scanner.nextLine();
		//Converting the Strings that were entered into floats so math could be done.
		float number1 = Float.parseFloat(num1);
		float number2 = Float.parseFloat(num2);
		//Using a single output statement to output all calculations.
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2) + "\n" + number1 + " - " + number2 + " = " + (number1 - number2) + "\n" + number1 + " * " + number2 + " = " + (number1 * number2) + "\n" + number1 + " / " + number2 + " = " + (number1 / number2));
		
	}
	
}
