package sharma;

import java.util.Scanner;

public class Practice14 {
	public static void main(String[] args) {
		
		
		
		//Q. Program To print a Fibbonaci Series 
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0,  b = 1; 
		
		System.out.println("Enter The Number(For Fibbonacci As you want): ");
		int user = sc.nextInt();
		
		System.out.print("Fibonacci Series Till(" + user + "):  " + a + " " + b);
		int c;
		for(int i=0; i<user; i++)
		{
			c = a+b;
			System.out.print(" " + c);
			a = b;
			b=c;
		}
	}

}
