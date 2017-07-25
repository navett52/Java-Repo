/******************************************************
 * Evan Tellep                                        *
 * In class 11/17/2015                                *
 * No Due Date                                        *
 * IT1090C (Computer Programming 1)                   *
 * Creating an example for inheritance                *
 * Ref:                                               *
 ******************************************************/

package inheritencePackage;

public class Teacher {
	
	private String highestDegree;
	
	public Teacher() {}
	
	public Teacher(String highestDegree) {
		setHighestDegree(highestDegree);
	}

	public String getHighestDegree() {
		return highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

}
