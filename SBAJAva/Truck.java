package SBAJAva;

public class Truck extends Car{
	
	int weight;
	
	public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}
	
	public double getSalePrice() {
			if (weight > 2000) {
				return super.regularPrice *= 0.9;
			}else {
				return super.regularPrice *= 0.8;
			}
			
			
	}
			

}
