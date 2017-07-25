/*********************************************************
 * Evan Tellep                                           *
 * assn.08                                               *
 * Due Date:10/27/2015                                   *
 * IT1090C (Computer Programming 1)                      *
 * Writing a program that solves quadratic equations     *
 * Ref:                                                  *
 * M04424011                                             *
 *********************************************************/

package tellepet_assignment08;

public class Quadratics {

	public static void main(String[] args) {
		
		//Array eqn holds variable a, b, and c for a quadratic equation
		double[] eqn = new double[3];
		eqn [0] = 1;//a
		eqn [1] = 3;//b
		eqn [2] = 1;//c

		//Array roots holds the roots that are the result of putting the quadratic equation through the quadratic formula
		double[] roots = new double [2];
		
		//Calls solveQuadratic to solve the quadratic equation formulated by using array eqn
		int realRoots = solveQuadratic(eqn, roots);
		System.out.println("There are " + realRoots + " real roots");
		
	}

	/**
	 * This function takes the values placed in eqn[] and uses them as the a, b, and c in a quadratic equation
	 * and then the function solves the equation telling you the real roots and how many there are
	 * @param eqn This holds the values for a, b, and c
	 * @param roots This holds the answers to the equation
	 * @return Returns the number of real roots
	 */
	public static int solveQuadratic(double eqn[], double roots[]) {
		//Discriminant holds the value of the discriminant using the eqn[] values
		double discriminant = (Math.pow(eqn[1], 2)) - (4 * eqn[0] * eqn[2]);
		
		//negativeFormula is the quadratic formula subtracting the square root
		double negativeFormula = (-eqn[1]) - (Math.pow(discriminant, 0.5)) / (2 * eqn[0]);
		
		//positiveFormula is the quadratic formula adding the square root
		double positiveFormula = (-eqn[1]) + (Math.pow(discriminant, 0.5)) / (2 * eqn[0]);
		
		//Variable to hold the number of real roots
		int realRoots = 0;
		
		//Determines how many roots there are using the discriminant
		if (discriminant > 0) {
			realRoots = 2;
		} else if (discriminant < 0) {
			realRoots = 0;
		} else if (discriminant == 0) {
			realRoots = 1;
		}
		
		//Using the discriminant this determines the number of real roots
		if (discriminant < 0) { //If negative there are no real roots
		} else if (discriminant == 0) { //If 0 there is one real root
			roots[0] = positiveFormula;
			System.out.println("Your root is");
			System.out.println(roots[0]);
		} else if (discriminant > 0) { //If positive there are two real roots
			roots[0] = positiveFormula;
			roots[1] = negativeFormula;
			System.out.println("Your roots are");
			System.out.println(roots[0]);
			System.out.println(roots[1]);
		}
		
		//Returns the variable realRoots
		return realRoots;
		
	}

}
