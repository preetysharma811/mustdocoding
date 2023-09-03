package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * using two pointer to track maximum at left side and maximum at right side
 * Time Complexity =o(N)
 * Space complexity = O(1)
 */

public class TrappingOfWater {
	
	 static long trappingWater(int arr[], int n) { 
	        // Your code here
	        
	        // area = l*b
	        int leftMax = 0;
	        int rightMax = 0;
	        int l =0;
	        int r=n-1;
	         int totalWaterArea=0;
	        
	        while(l<=r)
	        {
	          if(arr[l]<=arr[r])
	          {
	              if(arr[l]>=leftMax)
	              {
	                  
	               leftMax=arr[l];
	             
	              }
	              else {
	                totalWaterArea += leftMax - arr[l];
	              }
	              l++;
	          }
	          else {
	                if(arr[r]>=rightMax)
	              {
	                  
	               rightMax=arr[r];
	              
	              }
	              else {
	                totalWaterArea += rightMax - arr[r];
	              }
	                r--;
	          }
	        }
	    
	        
	        return totalWaterArea;
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {7, 4, 0, 9};
	
		System.out.println(TrappingOfWater.trappingWater(arr, arr.length));
		
	

	}

}
