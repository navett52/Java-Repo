/******************************************************
 * Evan Tellep                                        *
 * Assignment 10                                      *
 * 11/9/2015                                          *
 * IT1090C (Computer Programming 1)                   *
 * Calling methods from Hydro Electric Dam            *
 * Ref:                                               *
 ******************************************************/

package tellepet_assignment10;

public class Main {

	public static void main(String[] args) {
		
		//Creating new instance of HydroElectricDam called dam
		HydroElectricDam dam = new HydroElectricDam();
		
		//Setting all property values
		dam.setName("foo");
		dam.setCurrentPowerOutput(10.5);
		dam.setHomeState("OH");
		dam.setTotalCostToBuild(2000000.35);
		
		//Testing the methods shutDown and startUp
		//Printing out currentPowerOutput
		System.out.println(dam.getCurrentPowerOutput());
		
		//Using shutDown method to set currentPowerOutput to 0
		dam.shutDown();
		
		//Printing out currentPowerOutput to show shutDown method will set value to 0
		System.out.println(dam.getCurrentPowerOutput());
		
		//Using startUp method to set the currentPowerOutput to 5.5 and returning that value
		dam.startUp(5.5);
		
		//Printing currentPowerOutput to show startUp method will set and return the value entered
		System.out.println(dam.getCurrentPowerOutput());
		
	}

}
