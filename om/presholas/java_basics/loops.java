package om.presholas.java_basics;
import java.util.Scanner;
import java.util.Random;

public class loops {

	public static void main(String[] args) {
		
		//slide 22
		//Scanner user input
	/*	Scanner input = new Scanner(System.in);
		//Generating random numbers:
		Random r = new Random();
		//Generate 2 values
		int a = r.nextInt(101)+1;
		int b = r.nextInt(101)+ 1;
		int result = 0;
		boolean flip = true;
		//Output message
		
		while(flip) {
		System.out.print("What is "+ a + " + " + b + " = ");
		result = input.nextInt();
		if((a+b) == result) {
			System.out.println("Corret!!");
			flip = false;
		}else {
			System.out.println("Incorrect please try again");
		}
		} 
		//number 23 
		Scanner in = new Scanner(System.in);
		Random x = new Random();
	    
		int y = x.nextInt(100);
		
		boolean tryMe = true;
		while(tryMe) {
		System.out.println("Guess the random number selected: ");
		int guess = in.nextInt();
			
		if(guess == y) {
			System.out.println("You got it right Yay!!");
			tryMe = false;
		}else {
			System.out.println("Try again");
		}
	
		}
		
		//number 50
	    int n, c;
	    System.out.println("Enter an integer to print it's multiplication table : ");
	    Scanner out = new Scanner(System.in);
	    n = out.nextInt();
	    System.out.println("Multiplication table of " + n);

	    for (c = 1; c <= 10; c++)
	      System.out.println(n + "*" + c + " = " + (n*c));
		
	    int a, b, e, d;

	    System.out.println("Enter range of numbers to print their multiplication tables");
	    Scanner in = new Scanner(System.in);

	    a = in.nextInt();
	    b = in.nextInt();

	    for (e = a; e <= b; e++) {
	      System.out.println("Multiplication table of "+e);

	      for (d = 1; d <= 10; d++) {
	        System.out.println(e+"*"+d+" = "+(e*d));
	      }
	    }
		
		
		//loop 1-10
		for(int number=1; number<=10; number++){
			System.out.println(number);
		}
		
		//print increments of 10
		for( int i = 0; i <= 100; i++) {
			if(i % 10 ==0) {
				System.out.println(i);
			}
		}
		
		//1-10 with do while loop
		int i = 1;
		
		do	
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
		
		for(int i = 1; i <= 100; i++) {
			if(i >= 25 && i <= 75) {
				continue;
			}else if (i % 5==0){
				System.out.println(i);
			}
		}
		
		for(int i = 1; i <= 100; i++) {
			if(i >=50) {
				break;
			}else if (i % 5==0){
				System.out.println(i);
			}
		}
        
		for(int i=1; i<=2; i++)
		{
			System.out.println("\tWeek "+i+":");
			for(int j=1; j<=5; j++)
			{
				System.out.println("\tDay "+j);
			}
			System.out.println();
		}
		
		
		boolean flag=true;
		for (int i=10; i<=200; i++)
		{
			String converted=String.valueOf(i);
			int j=converted.length();
			for (int k=0;k<j/2;k++)
			{
				if (converted.charAt(k)!=converted.charAt(converted.length()-1-k))
				{
					flag=false;
					break;
				}
				flag=true;
			}
			if (flag)
			{
				System.out.println("\t"+i);
			}
		}
		
		
		int i=0;
		int j=1;
		System.out.print("\t");
		System.out.print(i+", "+j);
		do{
			int temp=i+j;
			i=j;
			j=temp;
			System.out.print(", "+temp);
		}while (i+j<=50);
		System.out.println();
		*/
		for (int i =0; i<10; i++)
		{
			for (int j=0; j<10; j++)
			{
				System.out.println("\toutter: " + i + ", inner: " + j);				
			}
		}
	}
}
