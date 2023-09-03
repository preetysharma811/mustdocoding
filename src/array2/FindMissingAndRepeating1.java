package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * One number 'X' from set {1, 2, N} is missing and
 * 2nd number 'Y' occurs twice in array. Find these two numbers.
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * 
 * Using elements as index and marking visited places
 * using index visited (mark negative) and not visited (leave as positive) 
 */
public class FindMissingAndRepeating1 {
	
    static int[] findTwoElement(int arr[], int n) {
    	
    	int res [] = new int[2];
        
       for(int i = 0; i<arr.length; i++)
       {
    	   int index = Math.abs(arr[i]);
    	   if(arr[index-1]<0) {
    		   res[0]=index;
    		   
    	   }
    	   else {
    		   arr[index -1] =  -arr[index-1];
    	   }
  
       }
       
       for(int i = 0; i<arr.length; i++)
       {
    	   if(arr[i]>0)
    	   {
    		   res[1]=i+1; 
    	   }
       }
       
        return res;
   
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {2, 2};
		// int [] arr1 = {3,4};
		 
		 int [] res =FindMissingAndRepeating1.findTwoElement(arr, arr.length);
      System.out.println("\nAnswer repeating:" + res[0] + " & missing:  "+ res[1] );

    //  System.out.println("\nAnswer:"+FindMissingAndRepeating.findTwoElement(arr1, arr1.length));

  	
  	

	

	}

}
