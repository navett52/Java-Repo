/******************************************************
 * Evan Tellep                                        *
 *                                                    *
 * 11/3/2015                                          *
 * IT1090C (Computer Programming 1)                   *
 *                                                    *
 * Ref:                                               *
 ******************************************************/

package week11ExcersisePackage;

public class Clicker {
	
	//Declaring property
	private int count;
	
	public void click() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
