package sharma;

import java.util.Scanner;

public class ArrPractice13 {
	
	 public static void main(String[] args) {
		
		  	int[][] arr = new int[3][3];
	    	System.out.println("3X3 Matrix -:");
	    	System.out.println("Enter Array Elements:  ");
	    	Scanner sc  = new Scanner(System.in);
//	    	for(int i[]: arr)
//	    	{
//	    		for(int j:i)
//	    		{
//	    			arr[i][j] = sc.nextInt();
//	    		}
//	    	}
	    	
	    	int count = 1;
	    	System.out.print(count + ". Row:\n");
	    	for(int i=0; i<=arr.length-1; i++)
	    	{
	    		
	    		for(int j=0; j<=arr[i].length-1; j++)
	    		{
	    			arr[i][j] = sc.nextInt();
	    		     
	    		if(j==arr[i].length-1)
	    		{
    				count++;

                }
	    		
	    		}
	    		
	    		if(i<arr.length&&count<=arr.length)
	    		{
	    			 System.out.print(count + ". Row:\n");
	    		}
	    		
	    	}
	    	
	    	
	    	int i, j;
	    	int sum = 0;
	    	System.out.println("Array Elements in Secondory Diagonal: ");
	    	for( i=0; i<arr.length; i++)
	    	{
	    		for( j=0; j<arr[i].length; j++)
	    		{
	    			
	    			
	    			System.out.print(" ");
	    			if(i==0&&j==2 || i==1&&j==1 ||i==2&&j==0 )
	    			{
	    				System.out.print(arr[i][j] );
	    				sum = sum + arr[i][j];

	    			}
	    			
	    		}
	    		System.out.println();
	    	}
	    	
		 System.out.println("sum of Elements Present in Secondory Diagonal: " + sum);
	}

}
