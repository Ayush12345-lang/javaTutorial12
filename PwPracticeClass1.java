package sharma;

import java.util.Scanner;

public class PwPracticeClass1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number Of Row: ");
         
		
		double row = sc.nextDouble() ;
		
		System.out.println("Enter Number Of Col in each Row: ");
		double Col = sc.nextDouble();
		
		double[][] arr = new double[ (int )row][(int) Col];
//		System.out.println("Length:  "+ arr.length);
		
		System.out.println("Enter Number of Elements:- \n ");
		int count = 1;
		System.out.print(count + " Row:- \n");
		for(int i=0; i<arr.length; i++)
		{
			for
			(int j=0; j<arr[i].length; j++)
			{
				System.out.print("Enter [" + i +", " + j + "] Position: " );
				arr[i][j] = sc.nextDouble();
				
			}
			count++;
			System.out.println();
			if(count<=arr.length)
			{
			System.out.print((count) + " Row:- \n");
			continue;
			}
			else
			{
				break;
			}
		}
		System.out.println();
		
		System.out.println("Printing Elements:- \n ");
		
		for(int i=0; i<arr.length; i++)
		{
			for
			(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
			
			}
		
		System.out.println();
		
		System.out.println("In Reverse Order:-\n ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			for(int j=arr[i].length-1; j>=0; j--)
			{
				System.out.print(arr[i][j] + " "); 
			}
			
			System.out.println();
			
			}
		
//		System.out.println("Enter Number: ");
//		int num = sc.nextInt();
//		
//		System.out.println("Enter Second Number: ");
//		int num2 = sc.nextInt();
//		
//		String res = (num==num2)?"Both are Equal": "Not Equal"; 
//		System.out.println(res);
		
		
		
		
		
		
	}

}
