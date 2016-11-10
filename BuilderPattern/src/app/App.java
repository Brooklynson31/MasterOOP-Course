package app;

import vehicle.Vehicle;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated  stub
		Vehicle newCar = new Vehicle.Builder()
				.price(2500.00)
				.type("car")
				.make("Toyota")
				.horsepower(150)
				.model("Corolla")
				.color("tan")
				.door(4)
				.build();
		System.out.println(newCar.toString());
				
	}
	


}
