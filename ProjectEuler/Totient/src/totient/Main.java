/******************************************************
 * Evan Tellep                                        *
 * Practice problem given by Bill Nicholson           *
 * Completed 5/3/2016                                 *
 * Did it just because I could                        *
 * Wrote a totient method and a method that gets the  *                                                 
 * sum of the totients of a specified prime and all   *
 * primes before it                                   *
 ******************************************************/

package totient;

public class Main {

	public static void main(String[] args) {
		//instantiating a SumOfTotientsObject
		SumOfTotients x = new SumOfTotients();
		
		//Test cases to test the getTotient() method
		int test = x.getTotient(1);
		System.out.println("The totient of 1 is: " + test);
		test = x.getTotient(2);
		System.out.println("The totient of 2 is: " + test);
		test = x.getTotient(3);
		System.out.println("The totient of 3 is: " + test);
		test = x.getTotient(4);
		System.out.println("The totient of 4 is: " + test);
		test = x.getTotient(5);
		System.out.println("The totient of 5 is: " + test);
		test = x.getTotient(6);
		System.out.println("The totient of 6 is: " + test);
		test = x.getTotient(7);
		System.out.println("The totient of 7 is: " + test);
		test = x.getTotient(8);
		System.out.println("The totient of 8 is: " + test);
		test = x.getTotient(9);
		System.out.println("The totient of 9 is: " + test);
		test = x.getTotient(10);
		System.out.println("The totient of 10 is: " + test);
		test = x.getTotient(11);
		System.out.println("The totient of 11 is: " + test);
		test = x.getTotient(12);
		System.out.println("The totient of 12 is: " + test);
		test = x.getTotient(13);
		System.out.println("The totient of 13 is: " + test);
		test = x.getTotient(14);
		System.out.println("The totient of 14 is: " + test);
		test = x.getTotient(15);
		System.out.println("The totient of 15 is: " + test);
		
		//printing a line for seperation
		System.out.println();
		
		//Getting the sum of the totients of the first 10000 prime numbers with the trick
		test = x.sumOfTotientsWithTrick(10000);
		System.out.println("The sum of the totients of the first 10000 prime numbers is: " + test);
	}

}
