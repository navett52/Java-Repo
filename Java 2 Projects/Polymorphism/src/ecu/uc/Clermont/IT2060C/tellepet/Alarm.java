package ecu.uc.Clermont.IT2060C.tellepet;

public class Alarm extends Device {

	@Override
	void shutDown() {
		System.out.println("Shutting down alarm.");
	}

}
