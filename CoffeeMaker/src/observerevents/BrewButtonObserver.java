package observerevents;

import components.BrewButton;

public class BrewButtonObserver implements Observer {
	
	private BrewButton brewbutton = null;
	
	public BrewButtonObserver(){
		this.brewbutton = BrewButton.isPushed;
	}
	
//	public BrewButtonObserver(BrewButton brewbutton ){
//		this.brewbutton = BrewButton.isPushed;
//	}
	

	@Override
	public void update(Object obj) {
		if(obj.equals(brewbutton)){
			System.out.println("The brew button button has been pushed and the cycle is starting");
		}
		
		
	}

}
