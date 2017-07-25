/******************************************************
 * Evan Tellep                                        *
 * In class 11/17/2015                                *
 * No Due Date                                        *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package inheritencePackage;

import java.util.*;

/**
 * Class models a school building 
 * @author tellepet
 *
 */
public class SchoolBuilding extends Building {
	//Hold the numberOfClassrooms for the school building
	private int numberOfClassrooms;
	//Holds the name for the school building
	private String name;
	
	//A school building has a teacher
	//private Teacher hannah = new Teacher();
	//private Teacher donna = new Teacher();
	//private Teacher bryan = new Teacher();
	//what is a better data structure to handle all these teachers?
	//we could use an array
	//private Teacher[] teachers = new Teachers[5]();
	
	//an array list is even better
	//really cool because ... they are dynamic -- they can grow and shrink in size
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	
	
	public SchoolBuilding() {}
	
	public SchoolBuilding(String streetAddress, int numberOfFloors, String name, int numberOfClassrooms) {
		//super allows for 
		super(streetAddress, numberOfFloors);//Invoking the building constructor
		setName(name);
		setNumberOfClassrooms(numberOfClassrooms);
	}

	/**
	 * Method returns numberOfClassrooms
	 * @return
	 */
	public int getNumberOfClassrooms() {
		return numberOfClassrooms;
	}
	/**
	 * Method sets the value of numberOfClassrooms
	 * @param numberOfClassrooms : is variable being set
	 */
	public void setNumberOfClassrooms(int numberOfClassrooms) {
		this.numberOfClassrooms = numberOfClassrooms;
	}
	
	/**
	 *Method returns name 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Method sets the value of name
	 * @param name : is variable being set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

}
