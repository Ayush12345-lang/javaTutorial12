package sharma;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class CollectionPractice4 {
	
	
	 public static void main(String[] args) {
		
		 
		 LinkedList ll  = new LinkedList();
		 
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		 try {
			 
			 
			 System.out.println("Enter The size of your Collection: ");
			 int size = Integer.parseInt(br.readLine());
			 int count=0; 
			 for(int i=0; i<size; i++)
			 {
				 
				 System.out.println("Enter " + i + " Position: ");
				 String value = br.readLine();
				 
				 for(int j=0; j<value.length(); j++)
				 {
					 if(Character.isDigit(value.charAt(j)))
					 {
						 count++;
					 }
				 }
				 
				 if(count==value.length())
				 {
					 int store = Integer.parseInt(value);
					 ll.add(store);
				 }
				 
				 else {
					 ll.add(value);
				 }
			 }
			 
			 
			 System.out.println("\nFor Fetching Data Please Select From Front Side or From Rear Side-: \n\n1. For Front: Press-F\n2. For Rear: Press-R");
			 char choice = sc.next().charAt(0);
			 
			 if(choice=='f' || choice=='F')
			 {
//                System.out.println("Fetching Data From Side:\n");				 
 				 Iterator itr = ll.iterator();
				 System.out.print("\nFetching Data From Front Side: [ ");
				 while(itr.hasNext())
				 {
					System.out.print(itr.next() + " ");
					
				 }
				 System.out.print("]");
			 }
			 
			 else if(choice == 'r' || choice == 'R')
			 {
				ListIterator lit = ll.listIterator(ll.size());
				
				System.out.print("\nFetching Data From Rear Side:[ ");
				while(lit.hasPrevious())
				{
					System.out.print(lit.previous() + " ");
				}
				
				 System.out.print("]");
			 }
			 
			 
			 else {
				 System.out.println("Invalid Choice. ");
			 }
			 
			 
			 
			 
			 
		 }catch(Exception e)
		 {
			 
			 System.out.println("Exception Arrived:  " + e.getMessage());
			 
		 }
		 
		 finally{
			 
			 sc.close();
			 try {
			 br.close();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		 }
		 
		 
		 
	}

}
