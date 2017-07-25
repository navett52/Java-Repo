/**
 * Demonstrate the use of the Comparable interface
 * This is a common construct that you will see in other OOP languages
 */
package comparableInterfacePackage;

public class Vehicle implements Comparable<Vehicle> {
	private String name;
	private int numberOfWheels;
	
	public Vehicle (String name, int numberOfWheels){
		this.name = name;
		this.numberOfWheels = numberOfWheels;
	}
	public int getNumberOfWheels() {return numberOfWheels;}
	public String getName() {return name;}
	
	/**
	 * Compare two vehicles.
	 * @return 0 if the vehicles are equal, -1 if v is < 'this', +1 if v > 'this'
	 * @param v = the vehicle to be compared with 'this' vehicle
	 */
	public int compareTo(Vehicle v) {
		int result = 0;	// Assume equality
		System.out.println("Comparing " + this.getName() + " and " + v.getName());
//		You get to decide how to compare 2 vehicles.
		if (this.getNumberOfWheels() > v.getNumberOfWheels())
			result = 1;
		else 
			result = -1;
		return result;
	}
}
