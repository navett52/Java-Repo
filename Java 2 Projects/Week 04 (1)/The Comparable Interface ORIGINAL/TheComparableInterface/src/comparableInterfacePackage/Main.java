/************************************************
 * Illustrate the Comparable interface          *
 * Bill Nicholson                               *
 * nicholdw@ucmail.uc.edu                       *
 * **********************************************
 */

package comparableInterfacePackage;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Vehicle> v = new ArrayList<Vehicle>();
				
		Vehicle x = new Vehicle("Rocket", 0);
		v.add(x);
		
		/* Instantiate and immediately pass the reference to the ArrayList */
		v.add(new Vehicle("Huffy", 2));
		v.add(new Vehicle("Corvette", 4));
		v.add(new Vehicle("Unicyle", 1));
		v.add(new Vehicle("Truck", 18));
		v.add(new Vehicle("Tricycle", 3));
		v.add(new Vehicle("Motorcycle", 2));
		v.add(new Vehicle("Kite", 0));
		v.add(new Vehicle("MarsRover", 6));
		v.add(new Vehicle("BobSled", 0));
		v.add(new Vehicle("BobSled2", 0));
		
		Collections.sort(v);

		for (int i = 0; i < v.size(); i++) {
			Vehicle tmp = v.get(i);
			System.out.println(tmp.getName() + ":" + tmp.getNumberOfWheels());
		}
	}

}
