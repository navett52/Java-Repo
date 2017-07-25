/******************************************************
 * Evan Tellep                                        *
 * In class 11/17/2015                                *
 * No Due Date                                        *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package inheritencePackage;

public class Main {

	public static void main(String[] args) {
		
		SchoolBuilding snyder = new SchoolBuilding();
		
		snyder.setName("Snyder");
		snyder.setNumberOfFloors(2);
		snyder.setStreetAddress("4200 College Drive");
		snyder.setNumberOfClassrooms(30);
		
		//Declare and instantiate a teacher called Tyson
		Teacher Tyson = new Teacher("PhD");
		
		//Add the teacher to the school building
		snyder.getTeachers().add(Tyson);

	}

}
