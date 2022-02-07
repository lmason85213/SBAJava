	package com.pnc.models;

	public abstract class Chassis {
		
		
		protected String vin;
		protected String chassisType;
		
		public Chassis() {
			System.out.println("a chassis constructor was called ");
		}
		// Ladder Frame Chassis 
		// Backbone Chassis
		// Monocoque Chassis
		public abstract void chassis();
		
		public String getVin() {
			return vin;
		}
		public void setVin(String vin) {
			this.vin = vin;
		}
		public String getChassisType() {
			return chassisType;
		}
		public void setChassisType(String chassisType) {
			this.chassisType = chassisType;
		} 
		
		
		
		
		
		
		
	}

