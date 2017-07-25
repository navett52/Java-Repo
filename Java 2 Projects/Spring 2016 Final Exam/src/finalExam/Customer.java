/******************************************************
 * Evan Tellep                                        *
 * Final                                              *
 * 04/26/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The customer class that is being compared int he main*                                                 
 * Ref: Old projects                                  *
 ******************************************************/

package finalExam;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	private double squareFootage;
	private String name;
	
	public Customer(String name, double squareFootage) {
		this.setName(name);
		this.squareFootage = squareFootage;
	}
/*All of the above provided by Professor Nicholson***********************************************/
	/**
	 * compareTo method used to compare the square footage of customers to determine their place in the queue
	 */
	@Override
	public int compareTo(Customer customer) {
		//If the current object's square footage is greater than the object it is being compared to it returns a 1
		if (this.squareFootage < customer.squareFootage) {
			return 1;
		}
		//If the current object's square footage is less than the object it is being compared to it returns a 1
		else if (this.squareFootage > customer.squareFootage) {
			return -1;
		}
		//If the square footage is equal the method returns a 0
		return 0;
	}
	
	/**
	 * Getter for the name value of Customer
	 * @return The name of the customer
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for the name
	 * @param name The name you want the customer to have
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for the squareFootage value of Customer
	 * @return The customer's total square footage
	 */
	public double getSquareFootage() {
		return squareFootage;
	}
	
}
