/*************************************************
 * Employee Class for database/JavaFX Practice   *
 * Bill Nicholson                                *
 * nicholdw@ucmail.uc.edu                        *
 *************************************************/
package employee;

public class Employee {

	private String lastName;
	private String firstName;
	private String EmployeeNumber;
	
	public Employee(String employeeNumber, String firstName, String lastName) {
		this.EmployeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmployeeNumber() {
		return EmployeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		EmployeeNumber = employeeNumber;
	}
	
	
	
	
}
