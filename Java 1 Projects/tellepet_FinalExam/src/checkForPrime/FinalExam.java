/*********************************************************
 * Evan Tellep                                           *
 * Final Exam                                            *
 * 12/08/2015                                            *
 * IT1090C (Computer Programming 1)                      *
 * Program checks for prime, throws exception if negative*
 * Ref: Notes and other programs from the semester       *
 *********************************************************/

package checkForPrime;

public class FinalExam {

	public static void main(String[] args) {
		//Testing the method
		System.out.println("2 is a " + tellepet(2) + " number");
		System.out.println("5 is a " + tellepet(5) + " number");
		System.out.println("4 is a " + tellepet(4) + " number");

		System.out.println("-12 is a " + tellepet(-12) + " number");

	}
	/**
	 * Method tests to see if number is prime.
	 * @param testNumber : Number we want to check for primeness
	 * @return : Returns whether the number is 'Prime' or 'Not Prime'
	 */
	public static String tellepet (int testNumber) {
		//Loop cycles through the numbers in between the test number and 1
		for (int i = 2; i <= testNumber/2; i++) {
			//If any of those numbers produce no remainder then it is not prime
			if (testNumber % i == 0) {
				return "Not Prime";
			}
		}
		//Checks to see if the number is negative
		if (testNumber < 0) {
			//If the number is negative the method will throw an exception and ask you to try a different number
			try {
				throw new Exception("The number cannot be negative");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Ignore the following output and use a different number please.");
			}
		}
		//Returns Prime if the number makes it through the for loop
		return "Prime";
	}
}
