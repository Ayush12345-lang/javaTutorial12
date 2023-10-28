package sharma;

public class PatternProgramming13 {
	
	     public static void main(String[] args) {
			
	    	 System.out.println("\n  I LOVE YOU pattern \n \n");
			  
		     int l=11;
		     
		    
		     for(int i=0; i<l; i++)
		     {
		    	 
		       for(int j=0; j<l; j++ )
		       {
		    	   
		    	   System.out.print(" ");
		       }
		       
		       
		    	 for(int j=0; j<l; j++)
		    	 {
		    		 
		    		 if(i==0 || j==(l-1)/2 || i==l-1)
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    		 
		    	 }
		    	 
		    	 System.out.print("                    ")
		    	 ;
		    	 
		    	 for(int j=0; j<l; j++)
		    	 {
		    		 if(i==(l-1) || j==0 )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
		    	 System.out.print("     ");
		    	 
		    	 for(int j=0; j<l; j++)
		    	 {
		    		 if(i==0&&j>=(l-1)-7&& j<=(l-1)-3 || j==0&&i>=(l-1)-7&&i<=(l-1)-3 
		    				 || i==l-1&&j>=(l-1)-7&& j<=(l-1)-3 
		    				 || j==l-1&&i>=(l-1)-7&&i<=(l-1)-3 || i+j==((l-1)/2)-2 || j-i==((l-1)/2)+2 
		    				 || i-j==((l-1)/2)+2 ||  i+j==(l-1)+ ((l-1)-2)  )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
            System.out.print("     ");
		    	 
		    	 for(int j=0; j<l; j++)
		    	 {
		    		 if( i==j  )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
		    	 System.out.print("");
		    	 
		    	 for(int j=0; j<l; j++)
		    	 {
		    		 if( i+j==l-1  )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
		    	 System.out.print("          ");
		    	 
		    	 for(int j=0; j<l; j++)
		    	 {
		    		 if( i==0|| j==0 || i==l-1 || i==(l-1)/2  )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
		    //	you 
 	               
		    	 System.out.println();
		     }
		  
		  System.out.println("\n\n\n");

		  System.out.println();

		  
//		  System.out.println("                                You: ");

	     int l2=11;
	         for(int i=0; i<l2; i++)
	         {
	        	 
	        	 for(int j=0; j<l2; j ++)
	        	 {
	        		 
	        		 System.out.print("  ");
	        	 }
	        	 
               System.out.print("            ");
		    	 
		    	 for(int j=0; j<l2; j++)
		    	 {
		    		 if(  i==j&&j<=(l2-1)/2 || i+j==l2-1 && j>=(l2-1)/2 
		    				 || j==(l2-1)/2 && i>=(l2-1)/2 )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
		    	 
              System.out.print("     ");
		    	 
		    	 for(int j=0; j<l2; j++)
		    	 {
		    		 if(i==0&&j>=(l2-1)-7&& j<=(l2-1)-3 || j==0&&i>=(l2-1)-7&&i<=(l2-1)-3 
		    				 || i==l2-1&&j>=(l2-1)-7&& j<=(l2-1)-3 
		    				 || j==l2-1&&i>=(l2-1)-7&&i<=(l2-1)-3 || i+j==((l2-1)/2)-2 
		    				 || j-i==((l2-1)/2)+2 
		    				 || i-j==((l2-1)/2)+2 ||  i+j==(l2-1)+ ((l2-1)-2)  )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
		    	 
		    	 
                System.out.print("     ");
		    	 
		    	 for(int j=0; j<l2; j++)
		    	 {
		    		 if( j==0 && i<=(l2-1)/2 || j==(l2-1) && i<=(l2-1)/2 
		    				 || i==l2-1&&j==(l2-1)/2 || i-j==(l2-1)/2 || i+j==(l2-1) + ((l2-1)/2 ) )
		    		 {
		    			 System.out.print("*");
		    		 }
		    		 
		    		 else
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 }
		    	 
	        	 System.out.println();
	         }
	     
	     }

}
