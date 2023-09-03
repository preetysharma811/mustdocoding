package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Reverse every sub-array group of size K.
 * if no more subarrays of size greater than or equal to K, then reverse the last subarray
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 * 
 * 
 */
public class ReverseArrayInGroups {
	
    static void reverseInGroups(int arr[], int n, int k) {
    
    	for(int i =0; i<n; i=i+k)
    	{
    	  int start= i;
    	  int end = Math.min(i+k-1, n-1);
    	  
    	  while(start<=end)
    	  {
    		  swap(start, end,arr);
    		  start++;
    		  end--;
    	  }
    	 }
	   	
		}
    
    
    static void swap(int i , int j , int [] a)
    {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {2, 3, 4, 5, -1, 0};
		 
		 int k = 3;
		// int [] arr1 = {3,4};
		 
		 ReverseArrayInGroups.reverseInGroups(arr, arr.length, k);
         System.out.format("\nreversed in group for k=%s:\n",k );
         for(int i =0;i<arr.length;i++)
         {
        	 System.out.print(" "+arr[i]);
         }

    
  	
  	

	

	}

}
