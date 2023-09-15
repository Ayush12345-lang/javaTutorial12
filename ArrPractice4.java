package sharma;

import java.util.Scanner;

public class ArrPractice4 {

	public static void main(String[] args) {
		System.out.println("Enter Number of Rows : ");
		Scanner sc = new Scanner(System.in);
		
		 int no_of_row = sc.nextInt();
		 
//		 System.out.println("Enter Number of Jagged COlumns : ");
//		 int no_of_Colum = sc.nextInt();
		 int arr[][] = new int[no_of_row][];
	     for(int i=0; i<no_of_row; i++)
	     {
	    	 System.out.println("Enter Number Of Columns Present  in the Location : " + i);
	    	 arr[i] = new int[sc.nextInt()];
	     }
		 
		  System.out.println("Enter Number of Row And Column Elements : \n");
		  for(int i=0; i<arr.length; i++)
		  {
			  for(int j=0; j<arr[i].length; j++)
			  {
				 System.out.println("Enter " + i + ", "+ j + " Elements : ");
				  arr[i][j] = sc.nextInt();
			  }
			  System.out.println();
		  }
		  System.out.println("Elements are : ");
		 
		  for(int i=0; i<arr.length; i++)//For Rows
		  {
			  for(int j=0; j<arr[i].length; j++) // For Columns
			  {
				  System.out.print(arr[i][j] + " ");
			  }
			  System.out.println();
		  }
		 
	  System.out.println("........Jagged Array");
	}
	 
}
