package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * all right side sum and all left side sum is equal on that index point
 * T.C - o(n)
 * S.C - o(1)
 */

public class KadaneAlgorithm {
	
    
	static long maxSubarraySum(int arr[], int n){
    // Your code here
 
	int maxSum =Integer.MIN_VALUE;
    int totalSum=0;
    
    for(int i = 0 ;i<arr.length;i++)
    {  
      totalSum += arr[i];   
      totalSum= Math.max(totalSum, arr[i]);
	  maxSum = Math.max(totalSum, maxSum);
 	
    }
    
    return maxSum;
}

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =   {1,2,3,-2,5};
		int brr[] =   {-1,-2,-3,-4};
		System.out.println("max sum:- "+KadaneAlgorithm.maxSubarraySum(arr, arr.length));
		System.out.println("max sum:- "+KadaneAlgorithm.maxSubarraySum(brr, brr.length));
		
	

	}

}
