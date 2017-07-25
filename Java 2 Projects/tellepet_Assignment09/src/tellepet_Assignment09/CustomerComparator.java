/******************************************************
 * Evan Tellep                                        *
 * Assignment 09                                      *
 * 03/29/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The comparator for customer objects                *                                                    
 * Ref: Java docs                                     *
 ******************************************************/

package tellepet_Assignment09;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
	
	@Override
	/**
	 * compare method to compare 2 Customer objects
	 */
	public int compare(Customer o1, Customer o2) {
		//If the first object's annual income is less than the second object's annual income returns -1
		if (o1.getAnnualIncome() > o2.getAnnualIncome()) {
			return -1;
		}
		//If the first object's annual income is greater than the second object's annual income returns 1
		if (o1.getAnnualIncome() < o2.getAnnualIncome()) {
			return 1;
		}
		//If neither object's annual income is larger returns 0
		return 0;
	}

}
