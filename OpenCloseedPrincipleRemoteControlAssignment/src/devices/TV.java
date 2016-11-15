package devices;

import controllers.RemoteControl;

public class TV extends RemoteControl{
	

	public void changeChanngel(){
		System.out.println("changingChannel...");
	}
	
	@Override
	public String toString() {
		return "TV";
	}

	@Override
	public void turnDeviceOn() {
		System.out.println("Turning TV on...");
		
	}

	@Override
	public void turnDeviceOff() {
		System.out.println("Turning TV off...");
		
	}

}
