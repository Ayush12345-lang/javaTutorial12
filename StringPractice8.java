package sharma;

import java.util.Scanner;

public class StringPractice8 {
	 public static void main(String[] args) {
		
//		 int no = 76423532;
//		 int Cpy = no;
//		 
//		 int count = 0; 
//		 
//		 while(no>0) {
//			 
//			 no = no/10;
//			 count++;
//			 
//		 }
//		System.out.println("Total Number Of Digits Present in " + Cpy + " is: " + count);
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String: ");
		 String str = sc.nextLine();
		 
		 
		 String findLowerCase = "";
		 String findUpperCase = "";
		 String findDigit = "";
//		 for(int i=0; i<str.length(); i++)
//		 {
//			 if(str.equals(str.ch))
//		 }
		
		for(int i=0; i<str.length(); i++)
		{
			
			if(Character.isLowerCase(str.charAt(i)) == true) // it returns Boolean Value
			{
				findLowerCase = findLowerCase + str.charAt(i);
			}
			
			else if(Character.isUpperCase(str.charAt(i)) == true)
			{
				
				
				findUpperCase = findUpperCase + str.charAt(i);
			}
				
			else if(Character.isDigit(str.charAt(i)) == true)
			{
				findDigit = findDigit + str.charAt(i);
			}
		}
		 
		
		System.out.println("Upper Case Char: " + findUpperCase);
		
		 System.out.println("Lower Case Char: " + findLowerCase);
		 System.out.println("Digits: " + findDigit);
		 
		 
		 
	}

}
