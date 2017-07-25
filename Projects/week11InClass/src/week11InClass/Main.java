/******************************************************
 * Evan Tellep                                        *
 *                                                    *
 * 11/3/2015                                          *
 * IT1090C (Computer Programming 1)                   *
 *                                                    *
 * Ref:                                               *
 ******************************************************/
//Main Class
//We will create instances of the Car class and use the methods in that class
package week11InClass;

public class Main {

	public static void main(String[] args) {
		//Declare and instantiate an object from the Car class
		Car crasher = new Car();
		
		//initialize the make of the Car object
		crasher.setMake("Chevy");
		crasher.setModel("Corvette");
		crasher.setWeight(4000);
		crasher.setCurrentSpeed(42);
		
		//Print the make of the Car object
		System.out.println("The make is " + crasher.getMake());
		
	}

}
