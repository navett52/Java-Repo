/******************************************************
 * Connor Tellep & Evan Tellep                        *
 * Assignment 01                                      *
 * 01/19/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * 2 person project testing quadratic equation class  *
 * QuadraticEquation written by Evan Tellep           *
 * Ref: Programs from last semester                   *
 ******************************************************/

package edu.uc.IT2045C.Spring2016.Assignment01.tellepet;

public class QuadraticEquation {
	
	//Declaring the properties to be used in the quadratic formula
	private static int a;
	private static int b;
	private static int c;
	
	//Blank constructor class
	public QuadraticEquation() {}
	
	/**
	 * This is the constructor class for QuadraticEquation
	 * @param a The first coefficient in a quadratic function.
	 * @param b The second coefficient in a quadratic function.
	 * @param c The third coefficient in a quadratic function.
	 */
	public QuadraticEquation (int a, int b, int c) {
		QuadraticEquation.a = a;
		QuadraticEquation.b = b;
		QuadraticEquation.c = c;
	}
	
	/**
	 * This function get's the discriminant of a quadratic equation
	 * @return the discriminant
	 */
	public double getDiscriminant() {
		//Runs the properties specified through the discriminant portion of the quadratic equation.
		double discriminant = ((Math.pow(b, 2)) - (4 * a * c));
		return discriminant;
	}
	
	/**
	 * This function get's one of the roots for the equation
	 * @return 0 if discriminant is negative, otherwise returns Positive root of the equation
	 */
	public double getRoot1() {
		//Runs the properties specified through the discriminant portion of the quadratic equation.
		double discriminant = ((Math.pow(b, 2)) - (4 * a * c));
		//checking if discriminant is negative
		if (discriminant < 0) {
			return 0;
		}
		//Runs the properties specified through the quadratic formula to get the positive root.
		double root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
		return root1;
	}
	
	/**
	 * This function get's the other root for the equation
	 * @return 0 if discriminant is negative, otherwise returns Negative root of the equation
	 */
	public double getRoot2() {
		//Runs the properties specified through the discriminant portion of the quadratic equation.
		double discriminant = ((Math.pow(b, 2)) - (4 * a * c));
		//checking if discriminant is negative
		if (discriminant < 0) {
			return 0;
		}
		//Runs the properties specified through the quadratic formula to get the negative root.
		double root2 = ((-b) - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
		return root2;
	}
	
	/**
	 * This is the getter for property a
	 * @return property a
	 */
	public int getA() {
		return a;
	}
	
	/**
	 * This is the getter for property b
	 * @return property b
	 */
	public int getB() {
		return b;
	}
	
	/**
	 * This is the getter for property c
	 * @return property c
	 */
	public int getC() {
		return c;
	}
	
}
