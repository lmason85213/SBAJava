package com.pnc.models;

public class Car extends Vehicle{
	
	// fields
		private String color;
		private String model;
		private String brand;
		
	// constructors
		public Car() {} //default constructor
		public Car(String engineType,int horsePower,int doors, String color,String model,String brand, String chassisType, String vin) {
			super(engineType,horsePower,doors, chassisType, vin);
			this.color = color;
			this.model = model;
			this.brand = brand;
			
		}

	// methods
		@Override
		public void accelerate() {
			super.accelerate();
			System.out.printf("The car model is %s and it's super fast\n", this.model);
		}
		
	// getters and setters
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		@Override
		public String toString() {
			return "Car [color=" + color + ", model=" + model + ", brand=" + brand + ", horsePower=" + horsePower
					+ ", vin=" + vin + ", chassisType=" + chassisType + ", getEngineType()=" + getEngineType()
					+ ", getHorsePower()=" + getHorsePower() + ", getDoors()=" + getDoors() + ", getVin()=" + getVin()
					+ ", getChassisType()=" + getChassisType() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		

}
