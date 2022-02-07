package om.presholas.java_basics;
import java.util.Scanner;
import java.io.*;

public class JavaBasicClass {
	  static int ToBinary(int num)
	    {
	        // Function to print integer to binary using
	        // inbuilt toBinaryString method
	        System.out.println(Integer.toBinaryString(num));
			return num;
	    }
	  
	 static void printBinary(int[] binary, int id)
	    {
	        // Iteration over array
	        for (int i = id - 1; i >= 0; i--)
	            System.out.print(binary[i] + "");
	    }
	 
	    // Function converting decimal to binary
	    public static int decimalToBinary(int num)
	    {
	        // Creating and assigning binary array size
	        int[] binary = new int[35];
	        int id = 0;
	 
	        // Number should be positive
	        while (num > 0) {
	            binary[id++] = num % 2;
	            num = num / 2;
	        }
	 
	        // Print Binary
	        printBinary(binary, id);
	        return id;
	    }
	 
	
	public static void main (String[] args) {
/*
		Scanner io = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int num1 = io.nextInt();
		System.out.print("Enter yuor second number: ");
		int num2 = io.nextInt();
		
		
		int ans= num1 + num2;
		System.out.println("The sum of your numbers is: " + ans);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		double num3 = in.nextDouble();
		System.out.print("Enter yuor second number: ");
		double num4 = in.nextDouble();
		
		double ans2= num3 + num4;
		System.out.println("The sum of your numbers is: " + ans2);
		
		Scanner out = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int num5 = out.nextInt();
		System.out.print("Enter yuor second number: ");
		double num6 = out.nextDouble();
		
		double ans3= num5 + num6;
		System.out.println("The sum of your numbers is: " + ans3);
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int num7 = input.nextInt();
		System.out.print("Please enter your second number: ");
		int num8 = input.nextInt();
		
		if(num7 > num8) {
			System.out.println("Your total is: " + num7/num8);
		}else if (num8 > num7) {
			System.out.println("Your total is: " + num8/num7);
			
		}
		
		//get 2 #s and divide by the bigger one
		Scanner output = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		double num9 = output.nextDouble();
		System.out.print("Please enter your second number: ");
		double num10 = output.nextDouble();
		
		if(num9 > num10) {
			System.out.println("Your total is: " + num9/num10);
		}else if (num10 > num9) {
			System.out.println("Your total is: " + num10/num9);
			
		}
		
		//simple equation
		int x = 5; 
		int y = 6;
		int q = y/x;
		System.out.println(q);
		double y2 = y;
		q = y; 
		System.out.println(q);
		
		//add to a constant
		Scanner write = new Scanner(System.in);
		System.out.print("Please enter any number you want to add to 150: ");
		double num11 = write.nextDouble();
		final double num12 = 150;
		double answer = num11 + num12;
		
		System.out.printf("Your total is: %.2f", answer);
		
		//buying 3 different occasion at a store
		double coffee = 2.56;
		double greenTea = 3.57;
		double bagel = 1.55;
		double donut = 1.69;
		final double salesTax1 = 0.06;
		double totalSale = 0; 
		
		double subtotal = (coffee+bagel+donut);
		System.out.printf("Your subtotal before tax is: %.2f", subtotal);
		System.out.println("");
		
		double tax = subtotal * salesTax1;
		
		System.out.printf("This is the tax: %.2f", tax);
		System.out.println("");
		totalSale = subtotal + tax;
		System.out.printf("Your total is %.2f", totalSale);
		
		
		double subtotal2 = (coffee+bagel+donut+greenTea);
		System.out.printf("Your subtotal before tax is: %.2f", subtotal2);
		System.out.println("");
		
		double tax2 = subtotal2 * salesTax1;
		
		System.out.printf("This is the tax: %.2f", tax2);
		System.out.println("");
		totalSale = subtotal2 + tax2;
		System.out.printf("Your total is %.2f", totalSale);
		
		 subtotal = (coffee+bagel);
		System.out.printf("Your subtotal before tax is: %.2f", subtotal);
		System.out.println("");
		
		 tax = subtotal * salesTax1;
		
		System.out.printf("This is the tax: %.2f", tax);
		System.out.println("");
		totalSale = subtotal + tax;
		System.out.printf("Your total is %.2f", totalSale);
		
		//change int to binary
		Scanner io = new Scanner(System.in);
		System.out.print("Enter a number to be turned into Binary: ");
		int num = io.nextInt();
		System.out.println("Your Binary number is: "+ ToBinary(num));
		
		
		//Change binary to decimal
		Scanner io = new Scanner(System.in);
		System.out.print("Enter a number to be turned into decimal from binary: ");
		int num = io.nextInt();
		int decimal = decimalToBinary(num);
		System.out.println("");
		System.out.printf("Your Decimal number is: %d",decimal);
		
		
		int x =2;
		System.out.println("Your number in binary is: " +  Integer.toBinaryString(x));
		--x;
		//number will go down one
		System.out.println(x);
		
		int y =150;
		System.out.println("Your number in binary is: " +  Integer.toBinaryString(y));
		y++;
		//number will go up one
		System.out.println(y);
		*/
		
		
		
	}
	
	
	   
	

}
