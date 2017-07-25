/******************************************************
 * Evan Tellep                                        *
 * In class 11/17/2015                                *
 * No Due Date                                        *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package inheritencePackage;

/**
 * Class models a building
 * @author tellepet
 *
 */
public class Building {
	
	//Holds the street address for the building
	private String streetAddress;
	//Holds the number of floors each building has
	private int numberOfFloors;
	
	public Building() {}
	
	public Building(String streetAddress, int numberOfFloors) {
		setStreetAddress(streetAddress);
		setNumberOfFloors(numberOfFloors);
	}

	/**
	 * Method returns streetAddress
	 * @return
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * Method sets the value of streetAddress
	 * @param streetAddress : is the variable being set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	/**
	 * Method returns numberOfFloors
	 * @return
	 */
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	/**
	 * Method sets the value of numberOfFloors
	 * @param numberOfFloors : is the variable being set
	 */
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

}
