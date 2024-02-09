package sharma;
// Approach: Bubble Sort
// Time Complexity: O(n^2)
// Space Complexity: O(1)
import java.lang.reflect.Array;

public class BubbleSort {


          public static void bubbleSort(int[] arr)
          {
          //          System.out.println("Sorted Array Elements: ");
                   for(int i=0; i<arr.length; i++)
                   {
                      for(int j=i+1; j<arr.length; j++)
                        {
                               if(arr[i]>arr[j])
                               {
                                        int temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp; 
                               }      
                        }
                   }

                   for(int data:arr)
                   {
                        System.out.print(data + " ");
                   }

          }

                public static void main(String[] args) {
                    
                      java.util.Scanner sc = new java.util.Scanner(System.in);

                      System.out.println("Enter the Size of Array: ");

                      int size = sc.nextInt();

                      int[] arr = new int[size];


                      System.out.println("Enter Array Elements: ");
                      for(int i=0; i<arr.length; i++)
                      {
                              arr[i] = sc.nextInt();

                      } 
                      System.out.println("Sorted Array:" );

                     bubbleSort(arr);

        
               





                }
          
}
