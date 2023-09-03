package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * using two pointer to track maximum at left side and maximum at right side
 * Time Complexity =o(N)
 * Space complexity = O(1)
 */

public class ContainerWithMostWater {
	
	 static long containerWithMostWater(int arr[], int n) { 
	        // Your code here
	        
	        // area = l*b
	  
	        int l =0;
	        int r=n-1;
	         int maxAreaWater=0;
	        
	        while(l<=r)
	        {
	       int area = Math.min(arr[l], arr[r])*(r-l);
	       maxAreaWater= Math.max(area, maxAreaWater)  ;
	       
	       if(arr[l]<=arr[r])
	       {
	    	   l++;
	       }
	       else {
	    	   r--;
	       }
	        }
	    
	        
	        return maxAreaWater;
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {1,8,6,2,5,4,8,3,7};
	
		System.out.println(ContainerWithMostWater.containerWithMostWater(arr, arr.length));
		
	

	}

}
