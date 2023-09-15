package sharma;

import java.util.Scanner;

class Key{
	
	
	void R_T()
	{
		
		for(int i = 1; i<=7; ++i)
		{
			for(int j=1; j<=i; ++j)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");

		
	}
	
	void L_T()
	{
		
		for(int i=1; i<=7; ++i)
		{
			for(int s=6; s>=i; --s)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; ++j)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");

		
	}
	void O_R()
	{
		
		for(int i= 1; i<=7; i++)
		{
			for(int j=7; j>=i; --j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");

		
	}
	void O_L()
	{
		for(int i=1; i<=7; i++)
		{
			for(int s=2; s<=i; ++s )
			{
				System.out.print(" ");
			}
			for(int j=7; j>=i; --j)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		System.out.println("------------------------------------------------------------");

		
	}
	
	void H_D()
	{
		for(int i= 1; i<=7; ++i)
		{
			for(int s=6; s>=i; --s)
			{
				System.out.print(" ");
			}
			
			for(int j= 1; j<=i; ++j)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i= 1; i<=7; ++i)
		{
			for(int s= 1; s<=i; ++s)
			{
				System.out.print(" ");
			}
			
			for(int j=6; j>=i; --j )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");

	}
	
	void F_D()
	{
		for(int i= 1; i<=7; ++i)
		{
			for(int s=6; s>=i; --s)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
				
			{
				System.out.print("*");
			}
			
			for(int k=2; k<=i; ++k)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		for(int i= 1; i<=7; i++)
		{
			
			for(int s=1; s<=i; s++)
			{
				System.out.print(" ");
			}
			
			
			for(int j= 6; j>=i; --j)
			{
				System.out.print("*");
			}
			
			for(int k=5; k>=i; --k)          
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		System.out.println("------------------------------------------------------------");
	}
	
	void C_R()
	{
		for(int k = 0; k<5; k++)
		{
			for(int l = 0; l<5; l++)
			{
				if(k==l || k+l==5-1)

			{
                 System.out.print("*");					
			}
			}
			System.out.println();
		}
		
	}
	
}
public class AllPattern extends Key {
	static int User,h;
	public static void main(String[] args) {
		System.out.println("How many Times You Want To Run The Code : ");
		Scanner in = new Scanner(System.in);
		 h= in.nextInt();
		
		 for(int j = 1; j<=h; ++j)
		{
			
		
		System.out.println("Enter Your Choice -: ");
		 System.out.println("1. Right Angle Traingle Star pattern ");
	     System.out.println("2. Left Angle Traingle Star Pattern ");
	     System.out.println("3. opposite Right Angle Traingle");
	     System.out.println("4. opposite Left Angle Traingle");
	     
	     System.out.println("5. Half Diamond Pattern ");
	     System.out.println("6. Full Diamond Pattern");
	     System.out.println("7. Cross Pattern");
	     System.out.println("8. Exit");
		
	     System.out.println();
	     System.out.println();
	     System.out.println("Enter : ");
		Scanner sc= new Scanner(System.in);
		  User = sc.nextInt();
		
	    
	      AllPattern AP= new AllPattern();
	     
	     switch (User)
	     {
	     
	     case 1:
	    	 AP.R_T();
	      break;
	     case 2:
	    	 AP.L_T();
	    	 
	      break;
	     case 3:
	    	 AP.O_R();
	      break;
	     case 4:
	    	 AP.O_L();
	    	break;
	     case 5:
	    	 AP.H_D();
	    	break;
	     case 6:
	    	 AP.F_D();
	    	 break;
	     case 7:
	    	 AP.C_R();
	    	 break;
	     case 8:
	    	 System.out.println("Succesfully Exited");
	    	System.exit(0);
	    	
	     default:
	    	 System.out.println("UNDEFINED");
	    	 
	    	 System.out.println("-----------------------------------------");
	    	break;
	     }
	     
	     
	    
	}
	}

}
