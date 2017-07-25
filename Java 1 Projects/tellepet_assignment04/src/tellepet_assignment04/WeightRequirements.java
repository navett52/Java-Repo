/******************************************************
 * Evan Tellep                                        *
 * assn. 4                                            *
 * Due: 9/22/15                                       *
 * IT1090C (Computer Programming 1)                   *
 * Reading weight and seeing if it falls within       *
 * requirements that are set by user                  *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment04;
//importing scanner to get input from keyboard
import java.util.Scanner;

public class WeightRequirements {
	//Main method takes in minimum and max weight values and determines if actual weight value is within the range specified
	public static void main(String[] args) {
		//importing scanner to get input from keyboard
		Scanner scanner = new Scanner(System.in);
		
		//Prompts user for variable values
		System.out.println("Enter 3 values. First for minimum weight. Second for max weight. Third for actual weight.");
		
		//defining variables for weight values: max weight, minimum weight, and actual weight
		float minimumWeight = scanner.nextFloat(); //weight in pounds
		float maxWeight = scanner.nextFloat(); //weight in pounds
		float actualWeight = scanner.nextFloat(); //weight in pounds
		
		//Determining if actual weight falls within set max weight and minimum weight
		//If the weight falls within variables it prints "Weight is within range" if not "Weight is outside of acceptable range"
		if (minimumWeight <= actualWeight) {
			if (actualWeight <= maxWeight)
			System.out.println("Weight is within range");
		}
		else
			System.out.println("Weight is outside of acceptable range");

	}

}
