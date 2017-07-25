/******************************************************
 * Evan Tellep                                        *
 * Assignment 09                                      *
 * 03/29/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method of the project                     *                                                    
 * Ref: Java docs                                     *
 ******************************************************/

package tellepet_Assignment09;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		//Creating and instantiating a customer comparator
		CustomerComparator comparator = new CustomerComparator();
		//Creating a priority queue that can be 10 large and implements the customer comparator "comparator"
		PriorityQueue<Customer> StoreLine = new PriorityQueue<Customer>(10, comparator);
		
		//Creating a customer "bob"
		Customer bob = new Customer("1", 45000.5);
		bob.getItemsToPurchase().add("Pop");
		bob.getItemsToPurchase().add("Soda");
		bob.getItemsToPurchase().add("Bubbly");
		
		//Creating a customer "joe"
		Customer joe = new Customer("2", 5000.6);
		joe.getItemsToPurchase().add("Chips");
		joe.getItemsToPurchase().add("Crisps");
		joe.getItemsToPurchase().add("Crunches");
		
		Customer steve = new Customer("3", 600000.7);
		steve.getItemsToPurchase().add("Cookies");
		steve.getItemsToPurchase().add("Biscuits");
		steve.getItemsToPurchase().add("Thins");
		
		Customer jill = new Customer("4", 70000.8);
		jill.getItemsToPurchase().add("Milk");
		jill.getItemsToPurchase().add("Bread");
		jill.getItemsToPurchase().add("Eggs");
		
		//Adding customers to the queue
		StoreLine.add(bob);
		StoreLine.add(joe);
		StoreLine.add(steve);
		StoreLine.add(jill);
		
		//Comparing bob vs joe based on annual income
		//System.out.println(comparator.compare(bob, joe));
		
		//Prints the Customer object as they are taken out of the queue and sorted
		for (int i = 0; i <= StoreLine.size(); i++) {
			System.out.println(StoreLine.poll().toString());
		}
	}

}
