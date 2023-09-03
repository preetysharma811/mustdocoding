package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * all right side sum and all left side sum is equal on that index point 
 * using two prefix Sum array left-to-right and right-to-left
 * T.C - o(n)
 * S.C - o(n)
 */

public class EquilbriumPointUsingPrefixSum {
	
	 public static int equilibriumPoint(int[] arr, int n) {
		 
		  // Your code here
         if (n == 1)
            return (1);
 
        long[] front = new long[n];
        long[] back = new long[n];
        
        front[0] = arr[0];
        back[n - 1] = arr[n - 1];
    
 
        // Taking the prefixsum from front end array
        for (int i = 1; i < n; i++) {     
                front[i] = front[i - 1] + arr[i];
        }
 
        // Taking the prefixsum from back end of array
        for (int i = n - 2; i >= 0; i--) {
                back[i] = back[i + 1] + arr[i];
        
        }
 
        // Checking for equilibrium index by
        // comparing front and back sums
        
        for (int i = 0; i < n; i++) {
           System.out.format("front at [%s] = [%s]",i,front[i]);
           System.out.format(" & back at [%s] = [%s]",i,back[i]);
           System.out.println();
        }
        
        for (int i = 0; i < n; i++) {
            if (front[i] == back[i]) {
                return i+1;
            }
        }
 
        // If no equilibrium index found,then return -1
        return -1;
	        // Your code here
	    
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-7, 1, 5, 2, -4, 3, 0} ;
		int brr[] = {1,3,5,2,2}  ;
		
		System.out.println(EquilbriumPointUsingPrefixSum.equilibriumPoint(arr, arr.length));
		
		System.out.println(EquilbriumPointUsingPrefixSum.equilibriumPoint(brr, brr.length));

	}

}
