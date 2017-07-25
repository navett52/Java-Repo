/*
 * Exception Handling Demo
 * Bill Nicholson
 * IT1090C - Intro to Computer Programming
 * Week 15
 */

package exceptionHandlingPackage;

public class ZeroDivideWithTryCatch {
	public static void main(String[] args) {
		 int alpha;
		 try {
			 alpha = 3 / 0; // force a zero-divide
			 System.out.println(alpha);
		 } catch (Exception ex) {
			 System.out.println("Exception caught: " + ex.getLocalizedMessage());
		 }
		 System.out.println("Made it to the end of main()");
	}
}
