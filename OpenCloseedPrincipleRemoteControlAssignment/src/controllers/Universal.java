package controllers;

public  class Universal  {
	private static Universal instance = null;
	HomeEntertainmentSystem hes = null;
	
	
	
	private Universal(){}
	
	public static Universal getInstance(){
		if(instance == null){
			instance = new Universal();
		}
		return instance;
		
	}
	
	public  void connectToDevice(HomeEntertainmentSystem hes){
	this.hes = hes;
		System.out.println("Connecting to " + hes + ".." );

	}
	
	public void turnDeviceOn(){
		hes.turnDeviceOn();
}
	
	public  void turnDeviceOff(){
		hes.turnDeviceOff();

		
	}

}
