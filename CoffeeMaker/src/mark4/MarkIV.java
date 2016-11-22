package mark4;


import brewingcycle.CoffeeBrewingCycle;


public class MarkIV {
	
	 private static MarkIV INSTANCE = null;

	 private static CoffeeBrewingCycle coffeebrew = new CoffeeBrewingCycle();

	private MarkIV(){

	
	}
	
	public static MarkIV getInstance(){
	if (INSTANCE == null){
		INSTANCE = new MarkIV();
		}
	return INSTANCE;
	}
	
	public void makeCoffee(){
		coffeebrew.startCycle();
	}
	
	public void removeCoffeePot(){
		coffeebrew.turnEverythingOff();
	}

}
