package sharma;

import java.util.Scanner;

public class StringPractice7 {
	 public static void main(String[] args) {
		
		 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a String: ");
	String accept = sc.nextLine();
	 accept = accept.replace(" ", "");
//	System.out.println(accept);
	String empty = "";
	
	
	for(char c = 'A'; c<='z'; c++)
	{
		
		for(int i=0; i<accept.length(); i++)
		{
			char compare = accept.charAt(i);
			
			if(compare==c )
			{
				empty = empty + compare;
			}
		}
		
	}
	System.out.println(empty);
 
		 
	}

}
