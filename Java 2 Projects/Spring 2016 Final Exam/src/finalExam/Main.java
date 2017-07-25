/*************************************************
 * Final Exam Spring 2016                        *
 * Main class                                    *
 * Bill Nicholson                                *
 * nicholdw@ucmail..uc.edu                       *
 *************************************************/
/******************************************************
 * Evan Tellep                                        *
 * Final                                              *
 * 04/26/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 *The main of the project                             *                                                
 * Ref: Main provided by Bill                         *
 ******************************************************/
package finalExam;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		PriorityQueue<Customer> pq = new PriorityQueue<Customer>();
		//System.out.println("Adding customers to priority queue...");
		pq.add(new Customer("Smith",       1000.));
		pq.add(new Customer("Jones",       10000.));
		pq.add(new Customer("Miller",      2000.));
		pq.add(new Customer("Macconnell",  1000.5));
		pq.add(new Customer("Mack",        200.));
		pq.add(new Customer("Nicholson",   25.));
		pq.add(new Customer("Burlew",      99999.));
		pq.add(new Customer("Trump",       1.));
		
		//System.out.println("******* Removing customers from priority queue...*********");
		System.out.println("pq now has " + pq.size() + " elements");
		while (pq.isEmpty() == false) {
			Customer customer = pq.remove();
			System.out.println(customer.getName() + ": " + customer.getSquareFootage());
		}
		System.out.println("pq now has " + pq.size() + " elements");
	}

}
