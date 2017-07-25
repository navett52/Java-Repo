/*
 * Week 05 stuff covered in class
 */

package TonyRomosShoulder;

import java.util.Scanner;

public class MacAndCheese {

	public static void main(String[] args) {
		
		int foo;
		foo = 3 * 2 + 1;
		System.out.println("foo = " + foo);
		
		int delta = 1 + 2 * 3 + 6;
		System.out.println("delta = " + delta);
		
		int alpha = 100 % 30; //Modulo operator
		System.out.println("alpha = " + alpha);
		
		float troy;
		troy = 100.0F / 30;
		System.out.println("troy = " + troy);
		
		float roger;
		roger = 2.5F + 1.3F * 100 / 25 + 42;
		System.out.println("roger = " + roger);
		
		int integer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer");
		integer = scanner.nextInt();
		if (integer % 5 == 0) {
			System.out.println("Number divisible by 5");
		} else {
			System.out.println("Number not divisible by 5");
		}
		if (integer % 3 == 0) {
			System.out.println("Number divisible by 3");
		} else {
			System.out.println("Number not divisible by 3");
		}

	}

}
