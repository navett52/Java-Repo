package areaOfARectangularRoom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCalculator {
	
	public void calculateArea() {
		
		DecimalFormat df = new DecimalFormat("#.000");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the length of the room in feet?");
		double length = scanner.nextDouble();
		
		System.out.println("What is the width of the room in feet?");
		double width = scanner.nextDouble();
		
		double feetSquared = length * width;
		
		final double metersSquared = feetSquared * .09290304;
		
		System.out.println("The area is:");
		System.out.println(feetSquared + " feet squared");
		System.out.println(df.format(metersSquared) + " meters squared");
		
	}
	
}
