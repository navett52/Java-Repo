/***************************************************
 * Serializable Objects in Java                    *
 * Bill Nicholson                                  *
 * nicholdw@ucmail.uc.edu                          *
 ***************************************************/
package SerializableObjectsPackage;

import java.io.Serializable;

/**
 * Fish Class
 * @author nicholdw
 *
 */
public class Fish implements Serializable {
	/**
	 * This class is serializable and pretty much unique because of the UID
	 */
	private static final long serialVersionUID = -1814208718512627406L;
	private String species;
	private double weight;
	private double length;

	/**
	 * Constructor
	 * @param species Species of the fish 
	 * @param weight Weight of the fish, pounds.
	 * @param length Length of the fish, inches.
	 */
	public Fish(String species, double weight, double length) {
		this.setSpecies(species);
		this.weight = weight;
		this.length = length;
	}

	/**
	 * Get the weight
	 * @return Weight in pounds
	 */
	public double getWeight() {return weight;}
	/**
	 * Get the Length
	 * @return Length in inches
	 */
	public double getLength() {return length;}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
}
