package observerevents;

import components.WarmerPlate;

public class CoffeeInWarmerPlate implements Observer, HeatingElement {

	private WarmerPlate warmerplate = null;
	
	public CoffeeInWarmerPlate(){
		this.warmerplate = WarmerPlate.potNotEmpty;
	}
	
	@Override
	public void update(Object obj) {

		if(obj.equals(warmerplate)){
			System.out.println("Coffee detected in pot");
			turnHeatOn();
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
