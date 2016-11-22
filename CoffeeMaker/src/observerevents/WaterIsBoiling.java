package observerevents;

import components.PressureReliefValveSwitch;

public class WaterIsBoiling implements Observer {

	private PressureReliefValveSwitch valve = null;
	
	public WaterIsBoiling(){
	this.valve = PressureReliefValveSwitch.valveClosed;
	}
	
	@Override
	public void update(Object obj) {
		if(obj.equals(valve)){
			System.out.println("Water is boiling and the pressure relief valve has  closed");
		}
		
		else if (obj.equals(PressureReliefValveSwitch.vavleOpen)){
			System.out.println("Pot has been removed and the valve has closed");
		}
	}

}
