package observerevents;

import components.Boiler;

public class WaterInBoiler implements Observer, HeatingElement {

	private Boiler boiler = null;
	
	public WaterInBoiler(){
		this.boiler = Boiler.BoilerNotEmpty;
	}
	
	@Override
	public void update(Object obj) {
		if(boiler.equals(obj)){
			System.out.println("sensor detects boiler is not empty");
			turnHeatOn();
		}
	}


	@Override
	public void turnHeatOn() {
		System.out.println("Turning boiler heater on");
	}


	@Override
	public void turnHeatOff() {
		System.out.println("Turning boiler heater off");
	}

}
