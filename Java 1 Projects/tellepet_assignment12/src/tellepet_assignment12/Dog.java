/******************************************************
 * Evan Tellep                                        *
 * Assignment 12                                      *
 * 11/24/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment12;

public class Dog extends Animal {
	//Property that describes weight
	private int weight;
	//Property that describes the length of the snout
	private int snoutLength;
	
	/**
	 * This is the blank constructor class
	 */
	public Dog() {}
	
	/**
	 * This is the constructor class where we define our object
	 * @param numberOfLegs : Tells how many legs the dog has
	 * @param color : Tells us what color the dog is
	 * @param weight : Tells us the weight of the dog
	 * @param snoutLength : Tells us the snout length of the dog
	 */
	public Dog(int numberOfLegs, String color, int weight, int snoutLength) {
		//Calls in the variables from the super class which is Animal
		super(numberOfLegs, color);
		//sets the value entered for weight to variable weight
		setWeight(weight);
		//sets the value entered for snout length to variable snoutLength
		setSnoutLength(snoutLength);
	}
	
	/**
	 * Method gets the weight of the dog
	 * @return
	 */
	public int getWeight() {
		//returns weight
		return weight;
	}
	/**
	 * Method sets the value of weight for dog
	 * @param weight : Property being defined
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	 * Method gets the snout length of the dog
	 * @return
	 */
	public int getSnoutLength() {
		//Returns snout length
		return snoutLength;
	}
	/**
	 * Method sets the value of snout length for dog
	 * @param snoutLength : Property being defined
	 */
	public void setSnoutLength(int snoutLength) {
		this.snoutLength = snoutLength;
	}

}
