/****************************************************************************************
 *	Matthew Frank																		*
 *	Assignment 04																		*
 *	Due: 02.09.16																		*
 *	IT2045C/003/16SS																	*
 *	Design and program a Java application to calculate the GCD as discussed in class.	*
 *	Euclid Class for calc - Main for exercise & test.									*
 *																						*
 *	EXTRA CREDIT - Also write BigInt gcd(Big a, Big b)									*
 ****************************************************************************************/
package greatestCommonDenominator;
public class Euclid
{	
	public int gcd(int a, int b)
	{ 	
		while(b != 0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
