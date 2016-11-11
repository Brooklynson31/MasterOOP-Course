package client;

import vehiclefactory.VehicleFactory;
import vehiclefactory.VehicleType;
import vehicletypes.Vehicle;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle.startEngine();
	}

}
