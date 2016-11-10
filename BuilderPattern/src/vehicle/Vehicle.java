package vehicle;

import java.util.Locale.Builder;

public class Vehicle {
	
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", make=" + make + ", model=" + model + ", color=" + color + ", price=" + price
				+ ", doors=" + doors + ", horsepower=" + horsepower + "]";
	}


	private String type;
	private String make;
	private String model;
	private String color;
	private Double price;

	private int doors;
	private int horsepower;
	
	private Vehicle(Builder builder){
		this.type = builder.type;
		this.make = builder.make;
		this.model = builder.model;
		this.color = builder.color;
		this.price = builder.price;
		this.doors = builder.doors;
		this.horsepower = builder.horsepower;
	}

	
	public static class Builder{
		private String type;
		private String make;
		private String model;
		private String color;
		private Double price;

		private int doors;
		private int horsepower;
		
		public Builder(){
			
		}
		
		public Builder(String model, String make){
			this.model = model;
			this.make = make;
			}
		public Builder make(String value){
			this.make = value;
			return this;
		}
		public Builder type(String value){
			this.type =  value;
			return this;
		}
		public Builder model(String value){
			this.model = value;
			return this;
		}
		public Builder color(String value){
			this.color = value;
			return this;
		}
		public Builder price(double value){
			this.price = value;
			return this;
		}
		public Builder door(int value){
			this.doors = value;
			return this;
		}
		public Builder horsepower(int value){
			this.horsepower = value;
			return this;
		}
		
		public Vehicle build(){
			return new Vehicle(this);
		}
	}
	

}
