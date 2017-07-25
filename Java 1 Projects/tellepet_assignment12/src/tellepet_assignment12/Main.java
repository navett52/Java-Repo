/******************************************************
 * Evan Tellep                                        *
 * Assignment 12                                      *
 * 11/24/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment12;

public class Main {

	public static void main(String[] args) {
		//A new pug object called bob is created and defined
		Pug bob = new Pug(3, "Blue", 25, 1, true, true);
		
		//Printing all the gets for class pug to prove all setters and getters were set up properly
		System.out.println("Bob is " + bob.getColor());
		System.out.println("Bob has " + bob.getNumberOfLegs() + " legs.");
		System.out.println("Bob's snout is " + bob.getSnoutLength() + " inches long.");
		System.out.println("Bob weighs " + bob.getWeight() + " pounds.");
		System.out.println("It is " + bob.isBreathingProblems() + " that Bob has breathing problems.");
		System.out.println("It is " + bob.isFloppyEars() + " that Bob has floppy ears.");
		System.out.println("Uh oh, Bob has a flea named Joe.");
		
		//Created a new flea object because bob has-a flea
		//A new flea object called joe is created and defined
		Flea joe = new Flea(6, "Red", 20, 20);
		//adds joe to the array list fleas
		bob.getFleas().add(joe);
		//Printing out gets to prove gets and sets were set up properly.
		System.out.println("Joe can suck " + joe.getAmountOfBlood() + " milliliters of blood.");
		System.out.println("Joe can jump " + joe.getJumpHeight() + " feet in the air.");
	}

}
