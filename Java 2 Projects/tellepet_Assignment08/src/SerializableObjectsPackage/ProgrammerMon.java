/******************************************************
 * Evan Tellep                                        *
 * Assignment 08                                      *
 * 03/10/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Class used to define a programmer monster          *
 * Ref: Friendship bread from Bill(what was posted)   *
 ******************************************************/

package SerializableObjectsPackage;

import java.io.Serializable;
import java.util.ArrayList;

public class ProgrammerMon implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3054587322009948232L;

    // the list of languages the monster knows
    private ArrayList<String> Languages = new ArrayList<String>();
    //The monster's given name
    private String name;
    //The monster's height in inches
    private int heightInches;
    //The monster's weight in pounds
    private int weightPounds;
    //How much the monster makes every hour
    private double hourlyRate;
    //The highest degree the monster has earned
    private String highestDegreeEarned;
    //Whether or not the monster wears glasses
    private Boolean wearsGlasses;
    
    /**
     * Constructs a monster based on parameters entered
     * @param name Name of the monster
     * @param heightInches Height of the monster in inches
     * @param weightPounds Weight of the monster in pounds
     * @param hourlyRate How much the monster makes every hour
     * @param highestDegreeEarned The highest degree the monster has earned
     * @param wearsGlasses Whether the monster wears glasses or not
     */
    public ProgrammerMon(String name, int heightInches, int weightPounds, double hourlyRate, String highestDegreeEarned, Boolean wearsGlasses ) {
    	this.name = name;
    	this.heightInches = heightInches;
    	this.weightPounds = weightPounds;
    	this.hourlyRate = hourlyRate;
    	this.highestDegreeEarned = highestDegreeEarned;
    	this.wearsGlasses = wearsGlasses;
    }
    
    /**
     * Logic that compares the attributes of the monsters and determines if one is better than the other
     * @param opponent The monster to fight the current monster
     * @return True if the current object wins, false if the opponent wins
     */
    public boolean Fight(ProgrammerMon opponent) {
    	
    	//Default battleForce for each programmer starts at 100
    	int thisBattleForce = 100;
    	int opponentBattleForce = 100;
    	
    	//If the current object's name contains any of these "cool letters" making their name cool the current object gets +1 battle force for each "cool letter"
    	for (int i = 0; i < this.name.length(); i++) {
    		if (this.name.charAt(i) == 'x' || this.name.charAt(i) == 'z' || this.name.charAt(i) == 'v' || this.name.charAt(i) == 'q' || 
    			this.name.charAt(i) == 'n' || this.name.charAt(i) == 'j' || this.name.charAt(i) == 'e' || this.name.charAt(i) == 'X' || 
    			this.name.charAt(i) == 'Z' || this.name.charAt(i) == 'V' || this.name.charAt(i) == 'Q' || this.name.charAt(i) == 'N' || 
    			this.name.charAt(i) == 'J' || this.name.charAt(i) == 'E')
    		{
    			thisBattleForce ++;
    		}
    		thisBattleForce ++;
    	}
    	
    	//If the opponent's name contains any of these "cool letters" making their name cool the opponent gets +1 battle force for each "cool letter"
    	for (int i = 0; i < opponent.name.length(); i++) {
    		if (opponent.name.charAt(i) == 'x' || opponent.name.charAt(i) == 'z' || opponent.name.charAt(i) == 'v' || opponent.name.charAt(i) == 'q' || 
    			opponent.name.charAt(i) == 'n' || opponent.name.charAt(i) == 'j' || opponent.name.charAt(i) == 'e' || opponent.name.charAt(i) == 'X' || 
    			opponent.name.charAt(i) == 'Z' || opponent.name.charAt(i) == 'V' || opponent.name.charAt(i) == 'Q' || opponent.name.charAt(i) == 'N' || 
    			opponent.name.charAt(i) == 'J' || opponent.name.charAt(i) == 'E') 
    		{
    			opponentBattleForce ++;
    		}
    		opponentBattleForce ++;
    	}
    	
    	//Whichever object is taller receives +5 to their battleForce
    	if (this.heightInches > opponent.heightInches) {
    		thisBattleForce += 5;
    	} else {
    		opponentBattleForce += 5;
    	}
    	
    	//Whichever object weighs more receives +5 to their battleForce
    	if (this.weightPounds > opponent.weightPounds) {
    		thisBattleForce += 5;
    	} else {
    		opponentBattleForce += 5;
    	}
    	
    	//Takes whichever object's hourly rate is higher and adds the difference in hourlyRates to that object's battleForce
    	if (this.hourlyRate > opponent.hourlyRate) {
    		thisBattleForce = thisBattleForce + ((int)this.hourlyRate - (int)opponent.hourlyRate);
    	} else {
    		opponentBattleForce = opponentBattleForce + ((int)opponent.hourlyRate - (int)this.hourlyRate);
    	}
    	
    	//Adds more to this object's battleForce depending on what that highest degree earned is
    	if (this.highestDegreeEarned == "High School Diploma") {
    		thisBattleForce += 1;
    	} else if (this.highestDegreeEarned == "Associates Degree") {
    		thisBattleForce += 3;
    	} else if (this.highestDegreeEarned == "Bachelor's Degree") {
    		thisBattleForce += 5;
    	} else if (this.highestDegreeEarned == "Master's Degree") {
    		thisBattleForce += 8;
    	} else if (this.highestDegreeEarned == "Doctorate" || this.highestDegreeEarned == "PhD") {
    		thisBattleForce += 10;
    	}
    	
    	//Adds more to the opponent's battleForce depending on what that highest degree earned is
    	if (opponent.highestDegreeEarned == "High School Diploma") {
    		opponentBattleForce += 1;
    	} else if (opponent.highestDegreeEarned == "Associates Degree") {
    		opponentBattleForce += 3;
    	} else if (opponent.highestDegreeEarned == "Bachelor's Degree") {
    		opponentBattleForce += 5;
    	} else if (opponent.highestDegreeEarned == "Master's Degree") {
    		opponentBattleForce += 8;
    	} else if (opponent.highestDegreeEarned == "Doctorate" || this.highestDegreeEarned == "PhD") {
    		opponentBattleForce += 10;
    	}
    	
    	//If either object wears glasses they get +5 to their battleForce
    	if (this.wearsGlasses == true) {
    		thisBattleForce += 5;
    	} else if (opponent.wearsGlasses == true) {
    		opponentBattleForce += 5;
    	}
    	
    	if (this.getLanguages() != null) {
    		
        	//Adds one to this object's battleForce for every language known, and adds +3 to it's battleForce for every popular* language it knows
        	//* http://www.codingdojo.com/blog/9-most-in-demand-programming-languages-of-2016/
        	for (int i = 0; i < this.Languages.size(); i++) {
        		if (this.Languages.get(i) == "Java" || this.Languages.get(i) == "SQL" || this.Languages.get(i) == "Javascript" ||
        			this.Languages.get(i) == "C#" || this.Languages.get(i) == "Python" || this.Languages.get(i) == "C++" ||
        			this.Languages.get(i) == "PHP" || this.Languages.get(i) == "IOS" || this.Languages.get(i) == "Ruby")
        		{
        			thisBattleForce += 3;
        		}
        		thisBattleForce ++;
        	}
        	
    	}
    	
    	if (opponent.getLanguages() != null) {

        	//Adds one to the opponent's battleForce for every language known, and adds +3 to the opponent's battleForce for every popular* language it knows
        	//* http://www.codingdojo.com/blog/9-most-in-demand-programming-languages-of-2016/
        	for (int i = 0; i < opponent.Languages.size(); i++) {
        		if (opponent.Languages.get(i) == "Java" || opponent.Languages.get(i) == "SQL" || opponent.Languages.get(i) == "Javascript" ||
        			opponent.Languages.get(i) == "C#" || opponent.Languages.get(i) == "Python" || opponent.Languages.get(i) == "C++" ||
        			opponent.Languages.get(i) == "PHP" || opponent.Languages.get(i) == "IOS" || opponent.Languages.get(i) == "Ruby")
        		{
        			opponentBattleForce += 3;
        		}
        		opponentBattleForce ++;
        	}
    		
    	}
 
    	System.out.println(this.name + "'s Battle Force is " + thisBattleForce);
    	System.out.println(opponent.name + "'s Battle Force is " + opponentBattleForce);
    	//Determines the winner by comparing battleForces
    	if (thisBattleForce < opponentBattleForce) {
    		return false;
    	}
        return true;
    }
    
    // Todo write gets and sets for private members of the class.
    /**
     * Get languages list
     * @return list of languages
     */
	public ArrayList<String> getLanguages() {
		return Languages;
	}
	
	/**
	 * Get the amount of money the monster makes hourly
	 * @return The amount of money the monster makes hourly
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	/**
	 * Get the highest degree the monster has earned
	 * @return The highest degree earned
	 */
	public String getHighestDegreeEarned() {
		return highestDegreeEarned;
	}
	
	/**
	 * Get whether or not the monster wears glasses
	 * @return true if the monster wears glasses, false otherwise
	 */
	public Boolean getWearsGlasses() {
		return wearsGlasses;
	}

	/**
	 * Get the name of the monster
	 * @return The name of the monster
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the height of the monster in inches
	 * @return The height of the monster
	 */
	public int getHeightInches() {
		return heightInches;
	}
	
	/**
	 * Get the weight of the monster in pounds
	 * @return The weight of the monster
	 */
	public int getWeightPounds() {
		return weightPounds;
	}
}
