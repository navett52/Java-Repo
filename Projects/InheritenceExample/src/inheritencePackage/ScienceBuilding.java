/******************************************************
 * Evan Tellep                                        *
 * In class 11/17/2015                                *
 * No Due Date                                        *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package inheritencePackage;

public class ScienceBuilding extends SchoolBuilding {
	
	private int numberOfLabs;
	
	public ScienceBuilding() {}
	
	public ScienceBuilding(String streetAddress, int numberOfFloors, String name, int numberOfClassrooms, int numberOfLabs) {
		super(streetAddress, numberOfFloors, name, numberOfClassrooms);
		setNumberOfLabs(numberOfLabs);
	}
	
	/**
	 * Method returns the numberOfLabs
	 * @return
	 */
	public int getNumberOfLabs() {
		return numberOfLabs;
	}
	/**
	 * Method sets a value for numberOfLabs
	 * @param numberOfLabs : is the variable being set
	 */
	public void setNumberOfLabs(int numberOfLabs) {
		this.numberOfLabs = numberOfLabs;
	}

}
