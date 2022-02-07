package om.presholas.java_basics;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ControlFlow {
	public static void main(String[] args) {

		/*
		Scanner io = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double num = io.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("Your number is divsible by 2");
		}else if (num % 3 == 0) {
			System.out.println("Your number is dividible by 3");
		}else if (num % 2 == 0 || num %3 == 0 ) {
			System.out.println("Your number is divisible by 2 or 3");
		}else if (num % 2 ==0 && num %3 ==0){
		System.out.println("Your number is divisible by 2 and 3);
		}
		
		System.out.print("Please enter a year to see if it is a leap year or not: ");
		double year = io.nextDouble();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println(isLeapYear);
		
		
		double z = 10 + (Math.random()* 99);
		Scanner io = new Scanner(System.in);
		double num = io.nextDouble();
		Pattern cycle = Pattern.compile("(\\d+)+(\\d*)");
		Matcher matcher = 
		
		if(z == num) {
			System.out.println("Your number matched exactly you won $5,000");
		}else if () {
			System.out.println("You have the right numbers just not in the right order your won $1,000");
		}else if () {
			System.out.println("One of your number match the winning number you won $250");
		}else 
			System.out.println("Your number did not match");
		
		
		 Scanner sc = new Scanner(System.in);
	      System.out.print("Input weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.print("\nInput height in meters: ");
	      double height = sc.nextDouble();
	      double BMI = weight / (height * height);
	      System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
		*/
		
	      double tax=0,it;
	  	Scanner sc=new Scanner(System.in);
	  	System.out.println("Enter income ");
	  	it=sc.nextDouble();
	  	System.out.print("Enter your filling status: ");
	  	String status = sc.nextLine();
	  	
	  	if(it<=8350)
	  		tax=0.10 * 100;
	  	else if(it<=33950)
	  		tax=0.15 * 100;
	  	else if(it<=82250)
	  		tax=0.25 * 100;
	  	else if(it<=171550)
	  		tax=0.28 * 100;
	  	else if(it<=372950)
	  		tax=0.33 * 100;
	  	else if(it >= 372951)
	  		tax=0.35* 100;
	  	System.out.println("Income tax amount is "+tax+"%");
	}

}
