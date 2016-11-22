package brewingcycle;

import observerevents.WaterInBoiler;
import observerevents.WaterIsBoiling;
import observerevents.BrewButtonObserver;
import observerevents.CoffeeFilterObserver;
import observerevents.IndicaterEvent;
import observerevents.PotRemovedObserver;
import observerevents.CoffeeInWarmerPlate;

import subjectprocesses.BoilerSensor;
import subjectprocesses.BrewButtonStatus;
import subjectprocesses.PressureReliefValve;
import subjectprocesses.WarmerPlateSensor;

public class CoffeeBrewingCycle extends BrewingCycle {
	BoilerSensor boilersensor;
	BrewButtonStatus brew;
	PressureReliefValve pressurereliefvalve;
	WarmerPlateSensor warmerplatesensor;
	
		
	
	@Override
	public void brewIsPushed() {
		brew = new BrewButtonStatus();	
		brew.registerObserver(new BrewButtonObserver());
		brew.registerObserver(new IndicaterEvent());
		brew.setIfIsPushed(true);
		brew.turnLightOff(true);
	}

	@Override
	public void waterInBoiler() {
		boilersensor = new BoilerSensor();	
		boilersensor.registerObserver(new WaterInBoiler());
		boilersensor.setIfWaterInBoiler(true);
		
	}

	@Override
	public void waterIsBoiling() {
		pressurereliefvalve = new PressureReliefValve();	
		pressurereliefvalve.registerObserver(new WaterIsBoiling());
		pressurereliefvalve.registerObserver(new CoffeeFilterObserver());
		pressurereliefvalve.setIfWaterIsBoiling(true);
		pressurereliefvalve.setIfCoffeeInFilter(true);
	}

	@Override
	public void potOnWarmerPlate() {
		warmerplatesensor = new WarmerPlateSensor();
		warmerplatesensor.registerObserver(new CoffeeInWarmerPlate());
		warmerplatesensor.registerObserver(new IndicaterEvent());
		warmerplatesensor.setIFCoffeeInPot(true);
		warmerplatesensor.setIFCycleIsOver(true);

		
		
	}

	public void startCycle() {
		brewIsPushed();
		waterInBoiler();
		waterIsBoiling();
		potOnWarmerPlate();
	}

	public void turnEverythingOff() {
		warmerplatesensor = new WarmerPlateSensor();
		pressurereliefvalve = new PressureReliefValve();	
		warmerplatesensor.registerObserver(new PotRemovedObserver());
		pressurereliefvalve.registerObserver(new WaterIsBoiling());
		
		warmerplatesensor.setIfPotOnWarmerPlate(false);
	}

}
