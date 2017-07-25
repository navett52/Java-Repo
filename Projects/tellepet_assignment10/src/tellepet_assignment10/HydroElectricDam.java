/******************************************************
 * Evan Tellep                                        *
 * Assignment 10                                      *
 * 11/9/2015                                          *
 * IT1090C (Computer Programming 1)                   *
 * Writing class for Hydro Electric Dam               *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment10;

public class HydroElectricDam {
	
	//Declaring the properties for HydroElectricDam
	private String name;
	private double currentPowerOutput;
	private String homeState;
	private double totalCostToBuild;
	
	/**
	 * Method sets the currentPowerOutput to 0
	 */
	public void shutDown() {
		//setting currentPowerOutput to 0
		currentPowerOutput = 0;
	}
	
	/**
	 * Method sets the value of currentPowerOutput and gets the value of currentPowerOutput by returning it
	 * @param currentPowerOutput : This is the currentPowerOutput of the dam
	 * @return
	 */
	public double startUp(double currentPowerOutput) {
			//This sets currentPowerOutput
			this.currentPowerOutput = currentPowerOutput;
			//This returns(gets) the currentPowerOutput
			return currentPowerOutput;
		
	}
	
	/**
	 * Method returns(gets) the property name
	 * @return
	 */
	public String getName() {
		//returns new value of property name
		return name;
	}
	
	/**
	 * Method sets the value of property name
	 * @param name : This is the name property for a HydroElectricDam
	 */
	public void setName(String name) {
		//This sets the value of property name
		this.name = name;
	}
	
	/**
	 * Method returns(gets) the value of property currentPowerOutput
	 * @return
	 */
	public double getCurrentPowerOutput() {
		//returns the value of currentPowerOutput
		return currentPowerOutput;
	}
	
	/**
	 * Method sets the value for property currentPowerOutput
	 * @param currentPowerOutput : This is the property currentPowerOutput
	 */
	public void setCurrentPowerOutput(double currentPowerOutput) {
		//sets the value of currentPowerOutput
		this.currentPowerOutput = currentPowerOutput;
	}
	
	/**
	 * Method returns(gets) the value of property homeState
	 * @return
	 */
	public String getHomeState() {
		//returns the value of homeState
		return homeState;
	}
	
	/**
	 * Method sets the value of property homeState
	 * @param homeState : This is the property homeState
	 */
	public void setHomeState(String homeState) {
		//sets the value of property homeState
		this.homeState = homeState;
	}
	
	/**
	 * Method returns(gets) value for property totalCostToBuild
	 * @return
	 */
	public double getTotalCostToBuild() {
		//returns the value of totalCostToBuild
		return totalCostToBuild;
	}
	
	/**
	 * Method sets the value of totalCostToBuild
	 * @param totalCostToBuild : This is the property totalCostToBuild
	 */
	public void setTotalCostToBuild(double totalCostToBuild) {
		//sets the value of property totalCostToBuild
		this.totalCostToBuild = totalCostToBuild;
	}

}
