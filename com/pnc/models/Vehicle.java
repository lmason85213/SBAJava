package com.pnc.models;

public class Vehicle extends Chassis implements CarActionsI{

		// fields
			
			private String engineType;
			protected int horsePower;
			private int doors;
		// constructors
			public Vehicle() {} // default constructor
			public Vehicle(String engineType,int horsePower,int doors, String chassisType, String vin) {
				this.engineType = engineType;
				this.horsePower =  horsePower;
				this.doors = doors;
				this.chassisType = chassisType;
				this.vin = vin;
			}

			
		// methods
			@Override
			public void sportMode() {
				
				if(this.horsePower >= 300) {
					System.out.println("Sport Mode is available");
				} else {
					System.out.println("Sport Mode not available!");
				}
			}
			
			
			@Override
			public void chassis() {
				System.out.println("the type of this chassis is: " + this.chassisType);
				
			}

			
			
			public void whoAmI() {
				System.out.println(this.getClass().getName());
			}
			
			public void accelerate() {
				System.out.println("accelerating");
			}
			public void breaking() {
				System.out.println("breaking");
			}
			
			
		// getters and setters
			public String getEngineType() {
				return engineType;
			}
			public void setEngineType(String engineType) {
				this.engineType = engineType;
			}
			public int getHorsePower() {
				return horsePower;
			}
			public void setHorsePower(int horsePower) {
				this.horsePower = horsePower;
			}
			public int getDoors() {
				return doors;
			}
			public void setDoors(int doors) {
				this.doors = doors;
			}
			
			
}