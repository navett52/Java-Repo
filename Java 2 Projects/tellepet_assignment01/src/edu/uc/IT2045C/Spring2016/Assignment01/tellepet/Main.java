/******************************************************
 * Evan Tellep & Connor Tellep                        *
 * Assignment 01                                      *
 * 01/19/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * 2 person project testing quadratic equation class  *
 * Main written by Connor Tellep                      *
 * Ref: Old Programs                                  *
 ******************************************************/

package edu.uc.IT2045C.Spring2016.Assignment01.tellepet;

import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		//Declares and instantiates an object in the QuadraticEquation class which will be used for testing
		QuadraticEquation Solution1 = new QuadraticEquation(3,5,2);
		
		//Declares variables that will hold the answers returned from the QuadraticEquation class
		//and calls the methods in the QuadraticEquation class to get the answers
		double Answer1_1 = Solution1.getRoot1();
		double Answer1_2 = Solution1.getRoot2();
		double Answer1_3 = Solution1.getDiscriminant();
		
		//Tests if the answers received from QuadraticEquation methods are correct and provides output
		if(Answer1_1 == -2.0/3.0 && Answer1_2 == -1 && Answer1_3 == 1)
		{
			System.out.println(Answer1_1 + "," + Answer1_2 + "," + Answer1_3);
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println(Answer1_1 + "," + Answer1_2 + "," + Answer1_3);
			System.out.println("Test Failed");
		}
		
		//Declares and instantiates an object in the QuadraticEquation class which will be used for testing
		QuadraticEquation Solution2 = new QuadraticEquation(3,-6,3);
		
		//Declares variables that will hold the answers returned from the QuadraticEquation class
		//and calls the methods in the QuadraticEquation class to get the answers
		double Answer2_1 = Solution2.getRoot1();
		double Answer2_2 = Solution2.getRoot2();
		double Answer2_3 = Solution2.getDiscriminant();
		
		//Tests if the answers received from QuadraticEquation methods are correct and provides output
		if(Answer2_1 == 1 && Answer2_2 == 1 && Answer2_3 == 0)
		{
			System.out.println(Answer2_1 + "," + Answer2_2 + "," + Answer2_3);
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println(Answer2_1 + "," + Answer2_2 + "," + Answer2_3);
			System.out.println("Test Failed");
		}
		
		//Declares and instantiates an object in the QuadraticEquation class which will be used for testing
		QuadraticEquation Solution3 = new QuadraticEquation(1,2,5);
		
		//Declares variables that will hold the answers returned from the QuadraticEquation class
		//and calls the methods in the QuadraticEquation class to get the answers
		double Answer3_1 = Solution3.getRoot1();
		double Answer3_2 = Solution3.getRoot2();
		double Answer3_3 = Solution3.getDiscriminant();
		
		//Tests if the answers received from QuadraticEquation methods are correct and provides output
		if(Answer3_1 == 0 && Answer3_2 == 0 && Answer3_3 == -16)
		{
			System.out.println(Answer3_1 + "," + Answer3_2 + "," + Answer3_3);
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println(Answer3_1 + "," + Answer3_2 + "," + Answer3_3);
			System.out.println("Test Failed");
		}
		
		//Declares and instantiates an object in the QuadraticEquation class which will be used for testing
		QuadraticEquation Solution4 = new QuadraticEquation(3,7,1);
				
		//Declares variables that will hold the answers returned from the QuadraticEquation class
		//and calls the methods in the QuadraticEquation class to get the answers
		double Answer4_1 = Solution4.getRoot1();
		double Answer4_2 = Solution4.getRoot2();
		double Answer4_3 = Solution4.getDiscriminant();
				
		//Tests if the answers received from QuadraticEquation methods are correct and provides output
		if(Answer4_1 == -0.15287291161696345 && Answer4_2 == -2.18046042171637 && Answer4_3 == 37)
		{
			System.out.println(Answer4_1 + "," + Answer4_2 + "," + Answer4_3);
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println(Answer4_1 + "," + Answer4_2 + "," + Answer4_3);
			System.out.println("Test Failed");
		}
				
		//Describes program to user
		System.out.println();
		System.out.println("Welcome to the quadradic equation solving program!");
		System.out.println("You will now be prompted to enter 3 number variables.");
		System.out.println();
		
		//Declares and instantiates a new object in the Scanner class
		Scanner scanner = new Scanner(System.in);
		
		//Prompts user for input of variables, and receives input from user
		System.out.println("Enter the first number variable");
		int Variable1_1 = scanner.nextInt();
		System.out.println("Enter the second number variable");
		int Variable1_2 = scanner.nextInt();
		System.out.println("Enter the last number variable");
		int Variable1_3 = scanner.nextInt();
		
		//Declares and instantiates an object in the QuadraticEquation class that uses the variables that were input by a user
		QuadraticEquation Solution5 = new QuadraticEquation(Variable1_1, Variable1_2, Variable1_3);
		
		//Declares variables that will hold the answers returned from the QuadraticEquation class
		//and calls the methods in the QuadraticEquation class to get the answers
		double Answer5_1 = Solution5.getRoot1();
		double Answer5_2 = Solution5.getRoot2();
		double Answer5_3 = Solution5.getDiscriminant();
		
		//Determines the number of solutions from the equation entered by the user
		//then provides output based on the number of solutions
		if(Answer5_3 > 0.0)
		{
			System.out.println("The first root to your equation is " + Answer5_1);
			System.out.println("The second root to your equation is " + Answer5_2);
		}
		else if(Answer5_3 == 0.0)
		{
			System.out.println("There is only one root to your equation.");
			System.out.println("The root is " + Answer5_1);
		}
		else
		{
			System.out.println("There are no real roots to your equation.");
		}
		
	}

}

