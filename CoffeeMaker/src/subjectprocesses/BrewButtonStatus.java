package subjectprocesses;

import java.util.ArrayList;
import java.util.List;

import components.BrewButton;
import components.IndicatorLight;

import observerevents.Observer;

public class BrewButtonStatus extends Subject {
	
	 private List<Observer> observerslist;
	 private BrewButton brewbutton;
	 private IndicatorLight light;
	 private Boolean isPushed;
	 private Boolean lightIsOff;
	 
	public BrewButtonStatus(){
		this.light = IndicatorLight.lightOn;
		this.brewbutton = BrewButton.notPushed;
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

	public Boolean getIfIsPushed() {
		return isPushed;
	}

	public void setIfIsPushed(Boolean isPushed) {
		this.isPushed = isPushed;
		if(isPushed){
		brewbutton = BrewButton.isPushed;
		notify(brewbutton);
		}
		
	}

	public Boolean getIfLightIsOn() {
		return lightIsOff;
	}

	public void turnLightOff(Boolean lightIsOff) {
		this.lightIsOff = lightIsOff;
		if(lightIsOff){
		light = IndicatorLight.lightOff;
		notify(light);
		}
	}



}
