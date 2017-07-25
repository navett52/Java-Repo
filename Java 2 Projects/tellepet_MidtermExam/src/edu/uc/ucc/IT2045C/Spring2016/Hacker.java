/******************************************************
 * Evan Tellep                                        *
 * Midterm Exam                                       *
 * 03/01/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method of the project                     *                                                    
 * Ref:My old TheComparableInterface project          *
 * Note: I only modified this code to make it work.   *
 ******************************************************/
// Midterm Exam 
// IT2045C Spring 2016
// Bill Nicholson
// nicholdw@ucmail.uc.edu
//
package edu.uc.ucc.IT2045C.Spring2016;

import java.util.ArrayList;

/***
 * A Hacker class to model a Hacker person
 * @author nicomp
 */
 class Hacker implements Comparable<Hacker> {
	 private int yearsInJail;
	 private String name;
	 private String streetName;
	 ArrayList<String> languages;
	 
	 /***
	  * Constructor for a Hacker object
	  * @param yearsInJail Number of years spent in jail
	  * @param name Name of Hacker
	  * @param streeutName Street Name of Hacker
	  * @param languages Programming languages known by the hacker
	  */
	 public Hacker(int yearsInJail, String name, String streetName, ArrayList<String> languages) {
		 this.yearsInJail = yearsInJail;
		 this.name = name;
		 this.streetName = streetName;
		 this.languages = (ArrayList<String>) languages.clone();
	 }
	 
	 /***
	  * Get the number of years spent in jail by the hacker
	  * @return Number of years spent in jail by the hacker
	  */
	 public int getYearsInJail() {return yearsInJail;}
	 /***
	  * Get the name of the hacker
	  * @return Name of the hacker
	  */
	 public String getName() {return name;}
	 /***
	  * Get the Street Name of the hacker
	  * @return The Street Name of the hacker
	  */
	 public String getStreetName() {return streetName;}
	 /***
	  * Get the languages learned by the hacker
	  * @return The languages learned by the hacker
	  */
	 public ArrayList<String> getLanguages() {return languages;}

	/***
	 * Retrieve the list of languages in a concatenated string format
	 * @return the list of languages in a concatenated string
	 */
	public String getLanguageList() {
		String list = "";
		String comma = "";
		for (String l : languages) {
			list += comma + l;
			comma = ", ";
		}
		return list;
	}
	/**
	 * Print the contents of the current Hacker object
	 * @param hackers The Hacker object to be printed
	 */
	public static void Print(ArrayList<Hacker> hackers) {
		//Cycles through the hacker list and prints them starting from who spent the most time in jail.
		for (int i = 0; i < hackers.size(); i++) {
			Hacker tmp = hackers.get(i);
			System.out.println(tmp.getName() + " " + "(" + tmp.getStreetName() + ")" + " " + tmp.getYearsInJail() + " years in jail " + ", " + tmp.getLanguageList());
		}
	}
	/**
	 * Defining the compareTo method from the comparable interface
	 */
	@Override
	public int compareTo(Hacker o) {
		//Assuming equality
		int result = 0;
		//Compares the amount of time they spent in jail
		if (this.getYearsInJail() <= o.getYearsInJail())
			result = 1;
		else 
			result = -1;
		return result;
	}
}
