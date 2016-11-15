package devices;

import controllers.HomeEntertainmentSystem;

public class Xbox implements HomeEntertainmentSystem  {



	@Override
	public String toString() {
		return "Xbox";
	}

	public void startNetflix(){
		System.out.println("Turning  on netflix");

	}

	@Override
	public void turnDeviceOn() {
		System.out.println("Turning Xbox on...");
		
	}

	@Override
	public void turnDeviceOff() {
		System.out.println("Turning Xbox off...");
		
	}

	

}
