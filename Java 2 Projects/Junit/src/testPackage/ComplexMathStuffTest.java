/**********************************************
 * JUnit examples
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 **********************************************/
package testPackage;

import org.junit.Before;
import org.junit.Test;

import somethingToTest.ComplexMathStuff;
import junit.framework.TestCase;

public class ComplexMathStuffTest extends TestCase {
	
	// Declare a couple of Test Fixtures
	private ComplexMathStuff number1, number2;

   // Initialize the test fixtures for EACH test
   @Before
   public void setup() {
      number1 = new ComplexMathStuff(2);
      number2 = new ComplexMathStuff(1);
   }

	@Test
	public static void testConstructor() {
		System.out.println("testConstructor()...");
		ComplexMathStuff alpha = new ComplexMathStuff(1000.00);
		boolean result = alpha.getNum() == 1000;
		System.out.println("testConstructor(): result = " + result);
		assertTrue("Constructor failed. Bummer", result);
	}
	@Test
	public static void testIncrementBy001() {
		System.out.println("testIncrementBy001()...");
		ComplexMathStuff alpha = new ComplexMathStuff(1000);
		boolean result = alpha.IncrementBy001() == 1000.001;
		System.out.println("testIncrementBy001(): result = " + result);
		assertTrue("testIncrementBy001 failed. Bummer", result);
	}
	// This test "works" but it is very creepy. Do you know why?
	@Test
	public static void testIncrementBy000000001() {
		System.out.println("testIncrementBy000000001()...");
		ComplexMathStuff alpha = new ComplexMathStuff(1000000000);
		boolean result = alpha.IncrementBy00000001() == 1000000000.00000001;
		System.out.println("num = " + alpha.getNum());
		System.out.println("testIncrementBy000000001(): result = " + result);
		assertTrue("testIncrementBy000000001 failed. Bummer", result);
	}
	// This test is guaranteed to fail...
	// Increment 1 by .00000001 TWO Times. The result is not 1.00000002
	@Test
	public static void testIncrementBy000000001GuaranteedToFail() {
		System.out.println("another testIncrementBy000000001()...");
		ComplexMathStuff alpha = new ComplexMathStuff(1);
		alpha.IncrementBy00000001();
		boolean result = alpha.IncrementBy00000001() == 1.00000002;
		System.out.println("num = " + alpha.getNum());
		System.out.println("testIncrementBy000000001(): result = " + result);
		assertTrue("testIncrementBy000000001GuaranteedToFail failed. Bummer", result);
	}
}
