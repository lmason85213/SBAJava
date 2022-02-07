package SBAJAva;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Truck dodge = new Truck(500,5000,"black",1500);
		Truck dodge2 = new Truck(600,8000,"red",3000);
		Ford pickup = new Ford(350,5000,"red",2010, 8);
		Ford pickup2 = new Ford(350,5000,"red",2010, 15);
		Sedan wagon = new Sedan(400,4500,"orange", 15);
		Sedan wagon2 = new Sedan(400,4500,"orange", 30);
		Car nissan = new Car(400,6500,"purple");
		Car nissan2 = new Car(400,7000,"pink");
		
		System.out.println(dodge.getSalePrice());
		System.out.println(dodge2.getSalePrice());
		System.out.println(pickup.getSalePrice());
		System.out.println(pickup.getSalePrice());
		System.out.println(wagon.getSalePrice());
		System.out.println(wagon2.getSalePrice());
		System.out.println(nissan.getSalePrice());
		System.out.println(nissan2.getSalePrice());
		
		
	}
}
