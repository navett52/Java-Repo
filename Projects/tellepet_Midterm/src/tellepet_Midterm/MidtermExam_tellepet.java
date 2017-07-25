/*********************************************************
 * Evan Tellep                                           *
 * Midterm                                               *
 * Due Date:10/13/2015                                   *
 * IT1090C (Computer Programming 1)                      *
 * Checks if a number is a cube                          *
 * Ref:                                                  *
 * M04424011                                             *
 *********************************************************/

package tellepet_Midterm;
//importing scanner
import java.util.Scanner;

public class MidtermExam_tellepet {

	public static void main(String[] args) {
		//creating variables
		int input;
		int result;
		//creating a scanner
		Scanner scanner = new Scanner(System.in);
		//acquiring a value for input through the scanner
		System.out.println("Please enter a number you believe to be a cube.");
		input = scanner.nextInt();
		//calling the function isCube using variable input
		isCube(input);
		//setting the return of isCube to variable result
		result = isCube(input);
		//printing out variable result
		System.out.println(result);

	}
	/**
	 * This method determines whether or not the number entered
	 * is a cube.
	 * If a cube it returns a 1
	 * If not a cube it returns a 0
	 * @param num The number we want to see if it is a cube or not
	 * @return Returns a value
	 */
	public static int isCube(int num) {
		//creating variables
		int i = 1;
		int result = 0;
		//loop checks if i multiplied 3 times is not = to num
		while (i * i * i != num) {
			//i increments
			i++;
			//if checks if i greater then num
			if (i > num) {
				//sets result to 0
				result = 0;
				break;
				
			} else {
				//sets result to 1
				result = 1;
				
			}
			
		}
		
		return result;
	}

}
