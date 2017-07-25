/******************************************************
 * Evan Tellep                                        *
 * Assignment 12                                      *
 * 11/24/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment12;

public class Animal {
	//Property that describes numberOfLegs
	private int numberOfLegs;
	//Property that describes color
	private String color;
	
	/**
	 * This is the blank constructor class
	 */
	public Animal() {}
	
	/**
	 * This is the constructor class where we define our object
	 * @param numberOfLegs : Tells us how many legs the animal has
	 * @param color : Tells us the color of the animal
	 */
	public Animal(int numberOfLegs, String color) {
		//sets the value entered for number of legs to variable numberOfLegs
		setNumberOfLegs(numberOfLegs);
		//sets the value entered for color to variable color
		setColor(color);
	}

	/**
	 * method gets the numberOfLegs
	 * @return
	 */
	public int getNumberOfLegs() {
		//Returns number of legs
		return numberOfLegs;
	}
	/**
	 * Method sets the value of numberOfLegs
	 * @param numberOfLegs : the property being defined
	 */
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	/**
	 * Method gets the color
	 * @return
	 */
	public String getColor() {
		//Returns color
		return color;
	}
	/**
	 * Method sets the value of color
	 * @param color : the property being defined
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
