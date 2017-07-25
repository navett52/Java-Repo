/***********************************
 * A class to use in the JUnit demo
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 ***********************************/
package somethingToTest;

public class ComplexMathStuff {
	
	private double num;
	
	/**
	 * Constructor
	 * @param num The number to initialize the object
	 */
	public ComplexMathStuff( double num)
	{
		this.num = num;
	}
	
	/**
	 * Get the value of the number 
	 * @return The value of the number
	 */
	public double getNum(){return num;}
	/**
	 * Increment by .001
	 * @return The incremented number
	 */
	public double IncrementBy001()
	{
		num += .001;
		return num;
	}
	/**
	 * Increment by .00000001
	 * @return The incremented number
	 */
	public double IncrementBy00000001()
	{
		num += .00000001;
		return num;
	}
}
