package vehiclefactory;

import vehicletypes.Car;
import vehicletypes.ElectricCar;
import vehicletypes.Truck;
import vehicletypes.Vehicle;

public enum VehicleType {
	CAR{
		public Vehicle getVehicle(){
			return new Car();
		}
	},
	ELECTRICCAR{
		public Vehicle getVehicle(){
			return new ElectricCar();
		}
	},
	TRUCK{
		public Vehicle getVehicle(){
			return new Truck();
		}
	};
	
	abstract Vehicle getVehicle();
	
	}


