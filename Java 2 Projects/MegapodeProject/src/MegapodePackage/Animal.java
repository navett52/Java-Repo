/*
 *                                                                Animal.java
 * Animal class
 * @author Bill Nicholson
 */

package MegapodePackage;

/**
 * This is our base class for the inheritance example.
 * @author Nicholson.Bill
 */
public class Animal {
    /**
     * weight
     */
    private int weight;
// Create a method that will be inherited.
    public void Hello() {
        System.out.print("I am an animal");
    }
    /**
     * Constructor
     * @param weight The weight, in kilograms, of the Animal
     */
    public Animal(int weight){
        this.weight = weight;
        //System.out.println("\nHello from the Animal constructor");
    }
    public int getWeight() {return weight;}
    /**
     * Set weight
     * @param weight The weight, in kilograms, of the Animal.
     */
    public void setWeight(int weight){ this.weight = weight;}
}
