/******************************************************
 * Evan Tellep                                        *
 * Assignment 12                                      *
 * 11/24/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment12;

public class Flea extends Animal {
	//Property describes the amount of blood a flea can suck
	private int amountOfBlood;
	//Property describes the height a flea can jump
	private int jumpHeight;
	
	/**
	 * This is the blank constructor for Flea
	 */
	public Flea() {}
	
	/**
	 * This is the constructor where the object is defined
	 * @param numberOfLegs : the number of legs the flea has
	 * @param color : the color of the flea
	 * @param amountOfBlood : the amount of blood a flea can suck
	 * @param jumpHeight : the height a flea can jump
	 */
	public Flea(int numberOfLegs, String color, int amountOfBlood, int jumpHeight) {
		//calling variables from the super class of animal
		super(numberOfLegs, color);
		//Taking value entered and setting it to amount of blood
		setAmountOfBlood(amountOfBlood);
		//Taking value entered and setting it to jump height
		setJumpHeight(jumpHeight);
	}

	/**
	 * Method returns value entered for amountOfBlood
	 * @return
	 */
	public int getAmountOfBlood() {
		return amountOfBlood;
	}
	/**
	 * Method sets the value for amountOfBlood
	 * @param amountOfBlood : Property being defined
	 */
	public void setAmountOfBlood(int amountOfBlood) {
		this.amountOfBlood = amountOfBlood;
	}

	/**
	 * Method returns value entered for jump height
	 * @return
	 */
	public int getJumpHeight() {
		return jumpHeight;
	}
	/**
	 * Method sets the value for jump height
	 * @param jumpHeight
	 */
	public void setJumpHeight(int jumpHeight) {
		this.jumpHeight = jumpHeight;
	}

}
