/******************************************************
 * Evan Tellep                                        *
 * Assignment 02                                      *
 * 01/26/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Topcoder AB problem                                *                                                       
 * Ref: Bill's posted solution and notes              *
 ******************************************************/

package assignment02_tellepet;

public class Main {

	public static void main(String[] args) {
		
		AB string = new AB();
		
		String test1 = string.createString(5, 3);
		
		System.out.println("Pass " + test1);
		
		String test2 = string.createString(3, 2);
		
		System.out.println("Pass " + test2);
		
		String test3 = string.createString(2, 0);
		
		System.out.println("Pass " + test3);
		
		String test4 = string.createString(5, 8);
		
		System.out.println("Pass " + test4);
		
		String test5 = string.createString(10, 12);
		
		System.out.println("Pass " + test5);
		
		String test6 = string.createString(44, 320);
		
		System.out.println("Pass " + test6);
		
	}

}
