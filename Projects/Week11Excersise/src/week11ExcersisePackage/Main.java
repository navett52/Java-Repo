/******************************************************
 * Evan Tellep                                        *
 *                                                    *
 * 11/3/2015                                          *
 * IT1090C (Computer Programming 1)                   *
 *                                                    *
 * Ref:                                               *
 ******************************************************/

package week11ExcersisePackage;

public class Main {

	public static void main(String[] args) {
		
		Clicker mouse = new Clicker();
		
		mouse.setCount(0);
		
		mouse.click();
		mouse.click();
		mouse.click();
		mouse.click();
		mouse.click();

		System.out.println(mouse.getCount());
		
	}

}
