/***************************************************
 * Serializable Objects in Java                    *
 * Bill Nicholson                                  *
 * nicholdw@ucmail.uc.edu                          *
 ***************************************************/
/******************************************************
 * Evan Tellep                                        *
 * Assignment 08                                      *
 * 03/10/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method of the project                     *                                                    
 * Ref: Main from Serializable Objects project        *
 ******************************************************/
package SerializableObjectsPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		//Test cases I used to see if the program worked
		/*ProgrammerMon guy = new ProgrammerMon("XvXE-Jacob", 64, 250, 45.76, "PhD", true);
		guy.getLanguages().add("Java");
		guy.getLanguages().add("Javascript");
		guy.getLanguages().add("C#");
		guy.getLanguages().add("C++");
		guy.getLanguages().add("PHP");
		guy.getLanguages().add("IOS");
		guy.getLanguages().add("Ruby");
		guy.getLanguages().add("Python");
		guy.getLanguages().add("SQL");
		
		ProgrammerMon dude = new ProgrammerMon("Bob", 54, 210, 20.50, "Associates", true);
		dude.getLanguages().add("Pascal");
		dude.getLanguages().add("C#");
		dude.getLanguages().add("C++");
		dude.getLanguages().add("HTML");
		dude.getLanguages().add("IOS");
		dude.getLanguages().add("BASIC");
		
		Write(guy);
		
		Write(dude);
		
		ProgrammerMon something = Read();
		
		boolean result = guy.Fight(something);
		
		System.out.println("It is " + result + " that your monster was the victor this day!");*/
		
		ProgrammerMon C_Loud = new ProgrammerMon("XxXVulquenXxX", 70, 300, 60.75, "PhD", true);
		C_Loud.getLanguages().add("Java");
		C_Loud.getLanguages().add("Javascript");
		C_Loud.getLanguages().add("C#");
		C_Loud.getLanguages().add("C++");
		C_Loud.getLanguages().add("PHP");
		C_Loud.getLanguages().add("IOS");
		C_Loud.getLanguages().add("Ruby");
		C_Loud.getLanguages().add("Python");
		C_Loud.getLanguages().add("SQL");
		
		//Write(C_Loud);
		
		ProgrammerMon opponent = Read();
		
		boolean result = C_Loud.Fight(opponent);
		System.out.println("It is " + result + " that your monster was the victor this day!");
	}

	/**
	 * Write the Programmer object to the serialized file.
	 * Method written by Bill Nicholson
	 * Adapted by Evan Tellep
	 */
	private static void Write(ProgrammerMon programmer) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a file name you wish to save your ProgrammerMon as:");
		String fileName = scanner.nextLine();
		// Save it to a disk file in one glorious line of code. At least try.
		try {
			(new ObjectOutputStream(new FileOutputStream(fileName, true))).writeObject(programmer);
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}

	/**
	 * Read from serialized object file
	 * Method Written by Bill Nicholson
	 * Adapted by Evan Tellep
	 */
	private static ProgrammerMon Read() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the file you want to import:");
		String fileName = scanner.nextLine();
		// Read the object from the binary file.
		try {
			return (ProgrammerMon) (new ObjectInputStream(new FileInputStream(fileName))).readObject();
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
		return null;	
	}
}