package config;

public class Config {
	
	static {
		System.out.println("You made it");
	}

	private static int maxSpeed = 42;

	public static int getMaxSpeed() {
		return maxSpeed;
	}
	
}
