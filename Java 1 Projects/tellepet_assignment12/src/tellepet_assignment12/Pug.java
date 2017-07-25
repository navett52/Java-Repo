/******************************************************
 * Evan Tellep                                        *
 * Assignment 12                                      *
 * 11/24/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment12;

import java.util.ArrayList;

public class Pug extends Dog {
	//Property that defines if a pug has floppy ears
	private boolean floppyEars;
	//Property that defines if a pug has breathing problems
	private boolean breathingProblems;
	//Property that lists the fleas and their properties
	private ArrayList<Flea> fleas = new ArrayList<Flea>();
	
	/**
	 * This is the blank constructor method
	 */
	public Pug() {}
	
	/**
	 * This is the constructor method where we define the object
	 * @param numberOfLegs : number of legs a pug has
	 * @param color : The color of the pug
	 * @param weight : The wiehgt of the pug
	 * @param snoutLength : The snout length of the pug
	 * @param floppyEars : Tells if the pug has floppy ears
	 * @param breathingProblems : Tells if the pug has breathing problems
	 */
	public Pug(int numberOfLegs, String color, int weight, int snoutLength, boolean floppyEars, boolean breathingProblems) {
		//Calling all variables from the super class of Dog
		super(numberOfLegs, color, weight, snoutLength);
		//Setting the value entered to variable floppyEars
		setFloppyEars(floppyEars);
		//Setting the value entered to variable breathingProblems
		setBreathingProblems(breathingProblems);
	}

	/**
	 * Method returns value for floppyEars
	 * @return
	 */
	public boolean isFloppyEars() {
		return floppyEars;
	}
	/**
	 * Method sets the value for floppyEars
	 * @param floppyEars : Property being defined
	 */
	public void setFloppyEars(boolean floppyEars) {
		this.floppyEars = floppyEars;
	}

	/**
	 * Method returns value for breathingProblems
	 * @return
	 */
	public boolean isBreathingProblems() {
		return breathingProblems;
	}
	/**
	 * Method sets the value for breathingProblems
	 * @param breathingProblems : Property being defined
	 */
	public void setBreathingProblems(boolean breathingProblems) {
		this.breathingProblems = breathingProblems;
	}

	/**
	 * Method gets the list of fleas
	 * @return
	 */
	public ArrayList<Flea> getFleas() {
		return fleas;
	}
	/**
	 * Method sets the values for fleas
	 * @param fleas : Property being defined
	 */
	public void setFleas(ArrayList<Flea> fleas) {
		this.fleas = fleas;
	}

}
