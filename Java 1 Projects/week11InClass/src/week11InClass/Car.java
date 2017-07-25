/******************************************************
 * Evan Tellep                                        *
 *                                                    *
 * 11/3/2015                                          *
 * IT1090C (Computer Programming 1)                   *
 *                                                    *
 * Ref:                                               *
 ******************************************************/

package week11InClass;

/**
 * This class models a car being crash tested by NHTSA.
 * @author tellepet
 *
 */
public class Car {
	
	//properties. ALways declare them as private,for now.
	private float currentSpeed;
	private String make;
	private String model;
	private double weight;
	
	public void crashIntoWall() {
		
	}
	
	public void deployAirbag() {
		
	}
	
	public void putOutFire() {
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	//Make set and get for each method
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public float getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(float currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
