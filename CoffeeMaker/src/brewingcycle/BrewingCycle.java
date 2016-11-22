package brewingcycle;

public abstract class BrewingCycle {
	
	public abstract void brewIsPushed();
	
	public abstract void waterInBoiler();
	
	public abstract void waterIsBoiling();
	
	public abstract void potOnWarmerPlate();
	
	public void brewCycle(){
		brewIsPushed();
		waterInBoiler();
		waterIsBoiling();
		potOnWarmerPlate();
		
	}

}
