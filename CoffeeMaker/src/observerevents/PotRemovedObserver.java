package observerevents;

import components.WarmerPlate;

public class PotRemovedObserver implements Observer, HeatingElement{

	private WarmerPlate warmerPlate = null;
	
	public PotRemovedObserver(){
		this.warmerPlate = WarmerPlate.warmerEmpty;
	}
	
	@Override
	public void update(Object obj) {
		if(obj.equals(warmerPlate)){
		System.out.println("Pot has been removed from warmer plate");
		turnHeatOff();
		}
		}

	@Override
	public void turnHeatOn() {
		System.out.println("Turning warmer plate heater on");
		
	
	}

	@Override
	public void turnHeatOff() {
		System.out.println("Turning warmer plate heater off");
		
	}

}
