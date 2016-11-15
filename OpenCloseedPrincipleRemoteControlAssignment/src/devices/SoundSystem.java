package devices;

import controllers.RemoteControl;

public class SoundSystem extends RemoteControl {

	@Override
	public void turnDeviceOn() {
		System.out.println("Turning SoundSystem on...");
		
	}

	@Override
	public void turnDeviceOff() {
		System.out.println("Turning SounSystem off...");
		
	}
	@Override
	public String toString() {
		return "Sounsystem";
	}


}
