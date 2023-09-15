import java.util.Scanner;

interface Ayush{
  
   public abstract void Cal();
   




}

interface Monu extends Ayush{
   public static final int h = 21404;
     

}

class MyClass implements Monu
{
int rev ;
   @Override
    public void Cal()

    { 
       System.out.println("Enter a Number : ");
       Scanner sc = new Scanner(System.in); 
       
         int num = sc.nextInt();

         StringBuffer sb = new StringBuffer(String.valueOf(num));
          StringBuffer rev = sb.reverse();
           
          
          System.out.println("Reverse Number is : " + rev);
     }
     
    

    public static void main(String []args)
          {
                MyClass mc = new MyClass();
                mc.Cal();
                
              System.out.println(args[3]);
           }
}

