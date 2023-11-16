package sharma;

import java.util.Scanner;

public class ArrPractice15 {
	
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("3X3 Matrix: ");
		 
		 int[][] arr2 = new int[3][3];
		 
		 
		 System.out.println("Enter Array Elements: ");
		 
		 
		 int count = 1;
		 System.out.print(count + ". Row:\n");
		 for(int i=0; i<arr2.length; i++)
		 {
			 for(int j=0; j<=arr2.length-1; j++)
			 {
				 
				 arr2[i][j] = sc.nextInt();
				 
				 if(j==arr2.length-1)
				 {
					 count++;
				 }
			 }
			 
			 if(count<=arr2.length)
			 {
				 System.out.print(count + ".Row:\n");
			 }
		 }
		 
		 
		 System.out.println("Array Elements are: ");
		 
		 int sum = 0;
		 for(int i=0; i<arr2.length; i++)
		 {
			 
			 for(int j=0; j<arr2[i].length; j++)
			 {
				 
				 System.out.print(arr2[i][j] + " ");
				 if(i==0&&j==1|| i==1&&j==1 || i==2&&j==1 )
				 {
					 
					 sum = sum + arr2[i][j];
				 }
				 
			 }
			 
			 System.out.println();
		 }
		 
		 
		 System.out.println("Sum of Second Columns is: " + sum);
	}

}
