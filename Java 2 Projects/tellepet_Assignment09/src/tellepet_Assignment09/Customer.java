/******************************************************
 * Evan Tellep                                        *
 * Assignment 09                                      *
 * 03/29/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method of the project                     *                                                    
 * Ref: Attributes from blackboard                    *
 ******************************************************/

package tellepet_Assignment09;

import java.util.PriorityQueue;
import java.util.Queue;

public class Customer {
	
	StringLengthComparator compareItems = new StringLengthComparator();

	private String loyaltyID;
	
	private double annualIncome;
	
	private PriorityQueue<String> itemsToPurchase = new PriorityQueue<String>(10, compareItems);
	
	/**
	 * Constructor for customer
	 * @param loyaltyID The customer's loyalty ID
	 * @param annualIncome The customer's annual income
	 */
	public Customer(String loyaltyID, double annualIncome) {
		this.loyaltyID = loyaltyID;
		this.annualIncome = annualIncome;
	}
	
	/**
	 * Prints a string representation of a Customer Object
	 */
	public String toString() {
		return annualIncome + " : " + loyaltyID;
	}

	public String getLoyaltyID() {
		return loyaltyID;
	}

	public void setLoyaltyID(String loyaltyID) {
		this.loyaltyID = loyaltyID;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(float annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Queue<String> getItemsToPurchase() {
		return itemsToPurchase;
	}

	public void setItemsToPurchase(PriorityQueue<String> itemsToPurchase) {
		this.itemsToPurchase = itemsToPurchase;
	}
	
}
