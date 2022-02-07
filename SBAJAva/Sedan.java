package SBAJAva;

public class Sedan extends Car{

	public Sedan(int speed, double regularPrice, String color,int length) {
		super(speed, regularPrice, color);
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	
	int length; 
	public double getSalePrice() {
		if (length > 20) {
		   return super.regularPrice *= 0.95;
		}else {
			return super.regularPrice *= 0.9;
		}
	}

}
