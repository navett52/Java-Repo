/**************************************************************
* Demonstrate how easy it is to use the database utilities    *
*  Bill Nicholson                                             *
*  nicholdw@ucmail.uc.edu                                     *
***************************************************************/
package databaseUtilities;

import employee.Employee;	// Kinda important!

public class Main {


	public static void main(String[] args) {
		DatabaseInterface d = new DatabaseInterface();
		
		//d.AddCatBreed("Maine Coon");
		d.AddEmployee(new Employee("tellepet", "Cheaney", "Calbert"));

	}

}
