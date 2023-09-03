package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * all right side sum and all left side sum is equal on that index point
 * T.C - o(n)
 * S.C - o(1)
 */

public class EquilbriumPoint {
	
	 public static int equilibriumPoint(int[] arr, int n) {
		 
		 int leftSum=0;
		 int totalSum =0;
		 for(int i = 0; i<arr.length; i++)
		 {
			 totalSum+=arr[i];
		 }
			
		 for(int i = 0; i<arr.length; i++)
		 {
			 totalSum-=arr[i];
			 if(leftSum==totalSum)
			 {
				 return i+1;
			 }
			 leftSum+=arr[i];
		 }
		 
		return -1;
	        // Your code here
	    
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {1,3,5,2,2};
	
		System.out.println(EquilbriumPoint.equilibriumPoint(arr, arr.length));
		
	

	}

}
