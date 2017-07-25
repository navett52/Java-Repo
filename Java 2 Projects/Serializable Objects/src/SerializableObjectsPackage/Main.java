/***************************************************
 * Serializable Objects in Java                    *
 * Bill Nicholson                                  *
 * nicholdw@ucmail.uc.edu                          *
 ***************************************************/
package SerializableObjectsPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		Write();
		Read();
	}

	/**
	 * Write the fish object to the serialized file.
	 */
	private static void Write() {
		// Instantiate a fish object
		
		Fish bass = new Fish("Bass", 10, 18);
		
		// Save it to a disk file in one glorious line of code. At least try.
		try {
			(new ObjectOutputStream(new FileOutputStream("Fish.dat", true))).writeObject(bass);
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}	
	}

	/**
	 * Read from serialized object file
	 */
	private static void Read() {
		Fish myFish = null;
		// Read the object from the binary file.
		try {
			myFish = (Fish) (new ObjectInputStream(new FileInputStream("Fish.dat"))).readObject();
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
		System.out.println("Species = " + myFish.getSpecies());
		System.out.println("Weight = " + myFish.getWeight());
		System.out.println("Length = " + myFish.getLength());
		
	}
}