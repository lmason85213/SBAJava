package om.presholas.java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class arrays {

	public static void main( String[] args) {
		
	/*	String[] names= {"Something", null,"Lindsey"};
		System.out.println(names.length);
		
		for(String i: names) {
			System.out.println(i);
		}
		//2 dimensional arrays
		int[][]twoDimi = new int[2][3];
		//first bracket is the rows the second is the columns
		int[][] twoDimi2 = {
			{20,30,40},
			{50,60,70}
		};
		//method one
		for(int[] rows:twoDimi2) {
		System.out.println();
		for(int col:rows) {
			System.out.println(col + " ");
		}
		}
		//ethod 2 access to rows and columns
		for(int rows =0; rows< twoDimi2.length; rows++) {
			System.out.println();
			for(int col =0; col< twoDimi2[rows].length; col++) {
				System.out.println(twoDimi2[rows][col] + " ");
			}
		}
		//method 3
		System.out.println(Arrays.deepToString(twoDimi2));
	
	//3 dimensional arrays
		int[][][] threeDimi = {
				{{20,30,40},{50,60,70},{80,90,100}},
				{{102,201,302},{156,258,658},{154,6554,654}}
			};
	
		System.out.println(threeDimi[1][2][0]);
	
	int[][][] anotherArr = Arrays.copyOf(threeDimi,4);
	
		//32
		Scanner in = new Scanner(System.in);
		String [][] arr = new String [4][52];
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<52; j++)
            {
                
                int suit=j/13;
                int number = j%13;
                String sSuit="";
                switch (suit)
                {
                    case 0: sSuit="Spades"; break;
                    case 1: sSuit="Hearts"; break;
                    case 2: sSuit="Diamonds"; break;
                    case 3: sSuit="Clubs"; break;
                }
                switch (number)
                {
                    case 0: arr[i][j]="Ace of "+ sSuit; break;
                    case 10: arr[i][j]="Jack of "+ sSuit; break;
                    case 11: arr[i][j]="Queen of "+ sSuit; break;
                    case 12: arr[i][j]="King of "+ sSuit; break;
                    default: arr[i][j]=(number+1)+" of "+ sSuit;
                }

            }
        }
        System.out.println("\tpick a card");
        while(in.hasNextInt())
        {
            int card=in.nextInt();
            int suit=card/13;
            int number = card%13;
            try
            {
                System.out.println("\t"+arr[suit][number]);                
            }
            catch (Exception io)
            {
                System.out.println("\tEntry Out of Bounds. Try Again");
            }
            System.out.println("\tpick a card");
        }
    }
		
		 int [] nums= {1,2,3};
	        for(int i: nums)
	        {
	            System.out.println("\t"+i);
	        }
		
	        int []arr= {13, 5, 7, 68, 2};
	        System.out.println("\t"+arr[arr.length/2]);
	        
	        String [] colors= {"red", "green", "blue", "yellow"};
	        System.out.println("\t"+colors.length);
	        String [] arr2= colors.clone();
	        System.out.println("\t"+Arrays.toString(arr2));
	        
	        int []arr= {32,3,32,4,324};
	        System.out.println("\t"+arr[0]);
	        System.out.println("\t"+arr[arr.length-1]);
	        try
	        {
	            System.out.println("\t"+arr[arr.length]);
	        }
	        catch (Exception e)
	        {
	            System.out.println("\t"+ e.getMessage());
	        }
	        try
	        {
	            arr[5]=89;
	        }
	        catch(Exception e)
	        {
	            System.out.println("\t"+e.getMessage());
	        }
	        
	        int arr[]= new int[5];
	        for (int i=0; i< arr.length; i++)
	        {
	            arr[i]=i*2;
	        }
	        System.out.println("\t"+Arrays.toString(arr));
	        
	        int arr[]= {1,2,3,4,5};
	        System.out.print("\t");
	        for(int i=0; i<arr.length; i++)
	        {
	            if (i==arr.length/2)
	            {
	                continue;
	            }
	            System.out.print(arr[i]+" ");
	        }
	        
	        String arr[]= {"this", "is", "my", "array", "?"};
	        System.out.println("\t"+ Arrays.toString(arr));
	        String temp=arr[0];
	        arr[0]=arr[arr.length/2];
	        arr[arr.length/2]=temp;
	        System.out.println("\t"+Arrays.toString(arr));
	        
	        int [] arr = {4, 2, 9, 13, 1, 0};
	        System.out.println("\tOriginal order: "+ Arrays.toString(arr));
	        int temp=0;
	        for(int i=0; i<arr.length; i++)
	        {
	            temp=i;
	            for (int j=i+1; j<arr.length; j++)
	            {
	                if (arr[temp]>arr[j])
	                {
	                    temp=j;
	                }
	            }
	            int temp2=arr[i];
	            arr[i]=arr[temp];
	            arr[temp]=temp2;
	        }
	        System.out.println("\tArray in ascending order: "+ Arrays.toString(arr));
	        System.out.println("\tThe smallest number is: "+ arr[0]);
	        System.out.println("\tThe largest number is: "+ arr[arr.length-1]);
	        
	        Object arr[]= {1,"three","two","one",1.1};
	        System.out.println("\t"+Arrays.toString(arr));
	*/        
		
	
	
	
	}
}
