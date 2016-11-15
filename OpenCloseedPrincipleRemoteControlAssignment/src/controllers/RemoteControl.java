package controllers;

public abstract class RemoteControl {
	

	public  static void connectToDevice(Object object){
		System.out.println("Connecting to " + object + ".." );

	}
	
	public  static void disconnectFromDevice(Object object){
		System.out.println("disconnecting from " + object + ".." );

	}
	
	public abstract void turnDeviceOn();
	
	public abstract void turnDeviceOff();
}
