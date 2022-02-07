package SBAJAva;

public class Ford extends Car {

	public Ford(int speed, double regularPrice, String color,int year,int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
		// TODO Auto-generated constructor stub
	}

	int year;
	int manufacturerDiscount;
	public double getSalePrice() {
		return super.getSalePrice() - manufacturerDiscount;
	}
}
