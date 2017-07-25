package Week07Stuff;

import java.util.Scanner;

public class MethodStuff {

	public static void main(String[] args) {
		
		int answer = cube(3);
		
		System.out.println("anser = " + answer);
		
	}	
	
	public static int cube(int num) {
		
		int result;
		result = num * num * num;
		return result;
		
	}
	

}
