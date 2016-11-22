package subjectprocesses;

import java.util.ArrayList;
import java.util.List;

import components.PressureReliefValveSwitch;
import observerevents.Observer;

public class PressureReliefValve  extends Subject {
	 
	List<Observer> observerslist;

	
	private PressureReliefValveSwitch valveSwitch;
	
	private Boolean waterisBoiling;
	private Boolean coffeeInFilter;
	
	public PressureReliefValve(){
		this.valveSwitch = PressureReliefValveSwitch.vavleOpen;
		observerslist = new ArrayList<Observer>();

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

	public Boolean checkIfWaterisBoiling() {
		return waterisBoiling;
	}

	public void setIfWaterIsBoiling(Boolean waterisBoiling) {
		this.waterisBoiling = waterisBoiling;
		if(waterisBoiling){
			valveSwitch = PressureReliefValveSwitch.valveClosed;
			notify(valveSwitch);
		}
	}

	public Boolean checkIfCoffeeInFilter() {
		return coffeeInFilter;
	}

	public void setIfCoffeeInFilter(Boolean coffeeInFilter) {
		this.coffeeInFilter = coffeeInFilter;
		if(coffeeInFilter){
			notify(coffeeInFilter);
		}
	}

}
