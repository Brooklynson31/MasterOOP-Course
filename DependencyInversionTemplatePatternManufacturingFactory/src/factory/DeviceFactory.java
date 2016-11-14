package factory;

import manufacturingfacotry.GeneralManufacturingProcess;
import manufacturingfacotry.MobileDeviceManufacturingProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		GeneralManufacturingProcess manufacturer = new MobileDeviceManufacturingProcess();
		manufacturer.goThroughProductionLine();
	}

}
