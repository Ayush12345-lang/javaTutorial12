package sharma;

class AutomaticPromote{
	
//	      public void met(int a)
//	      {
//	    	  System.out.println("integer method");
//	      }
//	      
//	      public void met(String b)
//	      {
//	    	  System.out.println("String Method");
//	      }
	      
//	      public void met(float f)
//	      {
//	    	  System.out.println("Float Method");
//	      }
	      
	      
	      
	      
	      public void met(double d)
	      {
	    	  System.out.println("Double Method");
	      }
	      
	/*    Primitive Type Automatic Promote
	 * 
	 *      byte
	 *        |
	 *        |          char
	 *        |            |
	 *        V            V
	 *       short -----> int  
	 *                     |
	 *                     |
	 *                     |
	 *                     |
	 *                     V
	 *             float,Double,long
	 *             ^  |    ^  ^  |  | 
	 *             |  |    |  |  |  |
	 *             |  -----   ----  |
	 *             ------------------                  
	 *                    
	 *                    
	 */            
//	      public void met(short s)
//	      {
//	    	  System.out.println("Short Method");
//	      }
	      
//	      public void met(long l)
//	      {
//	    	  System.out.println("Long method");
//	      }
	      
	      public void Arg(int... arg)
	      {
	    	  
	      }
}





class Emp extends AutomaticPromote
 {
	      public  void Employee(int Age, String name)
	      {
	    	  
	    	  System.out.println("Name: " + name + "\n" + "Age: " + Age);
	      }
	      //@overload
	      public  void Employee(int Age, String name, String Address) 
	      {
	    	  
	    	  System.out.println("Name: " + name + "\n" + "Age: " + Age);
	      }
}

public class Practice18 {
	
	    public static void main(String[] args) {
			
	    	
                  Emp p = new Emp();   
               p.Employee(18, "Ayush");  
               p.met('c');
	    	 Practice18.main(" Overloaded MainMethod");  // We can OverLoad MAin Method
	    	 
	    	 
		}
	    
	    //@ overload 
	    public static void main(String name)
	    {
	    	System.out.println(name);
	    }

}
