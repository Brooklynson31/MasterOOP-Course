package observerevents;

import components.IndicatorLight;

public class IndicaterEvent implements Observer {

	
	private IndicatorLight light = null;
	
	public IndicaterEvent(){
		this.light = IndicatorLight.lightOff;
	}
	
	@Override
	public void update(Object obj) {
		if(obj.equals(light)){
			System.out.println("The Indicator Light is now off");

		}
		else if(obj.equals(IndicatorLight.lightOn)){
			System.out.println("Finished brewing, turning indicator light On");
		}
		
	}

}
