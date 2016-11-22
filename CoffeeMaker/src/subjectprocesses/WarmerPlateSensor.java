package subjectprocesses;

import java.util.ArrayList;
import java.util.List;

import components.IndicatorLight;
import components.PressureReliefValveSwitch;
import components.WarmerPlate;
import observerevents.Observer;

public class WarmerPlateSensor extends Subject  {
	
	 private List<Observer> observerslist;
	 
	 private Boolean coffeeInPot;
	 private Boolean potOnWarmerPlate;
	 private Boolean cycleIsOver;
	 
	 
	 public WarmerPlate warmerPlate;
	 public IndicatorLight light;
	 public PressureReliefValveSwitch valve;
	 
	public WarmerPlateSensor() {
		observerslist = new ArrayList<Observer>();
		this.warmerPlate = WarmerPlate.potEmpty;
		this.light = IndicatorLight.lightOff;


	}

	@Override
	public void registerObserver(Observer obj) {
		observerslist.add(obj);
	}

	@Override
	public void unregisterObserver(Observer obj) {
		observerslist.remove(obj);
	}

	@Override
	public void notify(Object obj) {
		for (Observer observer: observerslist ){
			observer.update(obj);
			
		}
	}

	public Boolean checkIfCoffeeInPot() {
		return coffeeInPot;
	}

	public void setIFCoffeeInPot(Boolean coffeeInPot) {
		this.coffeeInPot = coffeeInPot;
		if(coffeeInPot){
			warmerPlate = WarmerPlate.potNotEmpty;
			notify(warmerPlate);
		}
	}

	public Boolean checkIfPotOnWarmerPlate() {
		return potOnWarmerPlate;
	}

	public void setIfPotOnWarmerPlate(Boolean potOnWarmerPlate) {
		this.potOnWarmerPlate = potOnWarmerPlate;
		if(!potOnWarmerPlate){
			warmerPlate = WarmerPlate.warmerEmpty;
			notify(warmerPlate);
		}
	}

	public Boolean checkIfCycleIsOver() {
		return cycleIsOver;
	}

	public void setIFCycleIsOver(Boolean cycleIsOver) {
		this.cycleIsOver = cycleIsOver;
		if(coffeeInPot){
			light = IndicatorLight.lightOn;
			notify(light);
		}
	}

}
