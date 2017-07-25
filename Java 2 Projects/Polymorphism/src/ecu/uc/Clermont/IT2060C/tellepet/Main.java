package ecu.uc.Clermont.IT2060C.tellepet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Device> devices = new ArrayList<Device>();
		
		//Add some devices
		devices.add(new Door());
		devices.add(new Door());
		devices.add(new Locks());
		devices.add(new Locks());
		devices.add(new Alarm());
		devices.add(new Alarm());
		
		devices.add(null);
		//step through the elements in the array list
		for (int i = 0; i < devices.size(); i++) {
			devices.get(i).shutDown(); //late binding!!!
		}
	}

}
