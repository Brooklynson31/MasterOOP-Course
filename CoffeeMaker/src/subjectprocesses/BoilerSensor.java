package subjectprocesses;

import java.util.List;
import java.util.ArrayList;
import components.Boiler;
import observerevents.Observer;


public class BoilerSensor extends Subject  {
	
	 private List<Observer> observerslist;
	 private Boiler boiler;
	 private Boolean waterInBoiler;
	 
	 
	public BoilerSensor() {
		this.boiler = Boiler.BoilerEmpty;
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

	public Boolean checkIfWaterInBoiler() {
		return waterInBoiler;
	}

	public void setIfWaterInBoiler(Boolean waterInBoiler) {
		this.waterInBoiler = waterInBoiler;
		if(waterInBoiler){
			boiler = Boiler.BoilerNotEmpty;
			notify(boiler);
		}
	}

}
