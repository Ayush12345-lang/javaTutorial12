package sharma;

import java.util.Scanner;

public class ArrPractice14 {
	
	 public static void main(String[] args) {
		
		  	int[][] arr = new int[4][4];
	    	System.out.println("4X4 Matrix -:");
	    	System.out.println("Enter Array Elements:  ");
	    	
	    	Scanner sc= new Scanner(System.in);
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
	    	int sum1 = 0,sum2=0, sum3=0, sum4=0;
	    	System.out.println("Array Elements: ");
	    	for( i=0; i<arr.length; i++)
	    	{
	    		for( j=0; j<arr[i].length; j++)
	    		{
	    			
	    			
	    		 System.out.print(arr[i][j] + " ");
	    		 
	    		 if(i==0&&j<arr[i].length)
	    		 {
	    			 sum1 = sum1 + arr[i][j];
	    		 }
	    			
	    		 else if(i==1&&j<arr[i].length)
	    		 {
	    			 sum2= sum2 + arr[i][j];
	    		 }
	    		 
	    		 else if(i==2&&j<arr[i].length)
	    		 {
	    			 sum3= sum3 + arr[i][j];
	    		 }
	    		
	    		 else if(i==3&&j<arr[i].length)
	    		 {
	    			 sum4= sum4 + arr[i][j];
	    		 }
	    		 
	    		}
	    		System.out.println();
	    	}
	    	
		 
		 System.out.println("1. First Row Sum: " + sum1
				 + "\n" + "2. Second Row Sum: " + sum2 + "\n" + "3. Third Row Sum: " + sum3 + 
				 "\n" + "4. Fourth Row Sum: " + sum4);
		 
	}

}
