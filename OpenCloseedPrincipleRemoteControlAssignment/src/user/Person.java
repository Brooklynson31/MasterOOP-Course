package user;

import controllers.RemoteControl;
import controllers.Universal;

import devices.TV;
import devices.Xbox;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TV tv = new TV();
		RemoteControl.connectToDevice(tv);
		tv.turnDeviceOn();
		tv.turnDeviceOff();

		RemoteControl.disconnectFromDevice(tv);
		tv.changeChanngel();
		
		Universal uni = Universal.getInstance();
		Xbox xbox = new Xbox();
		uni.connectToDevice(xbox);
		uni.turnDeviceOn();
		
		

		
	
	

	}

}
