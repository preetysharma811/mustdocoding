package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * (may be positive, negative or zero). Find the product of the maximum product subarray.
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * use Kadane algo, with minProd and maxProd variable , to swap element whenever element is negative , 
 * -ve * -ve = max value
 * -ve * +ve = min value 
 * 
 */
public class MaximumProductSubArray {
	
    static int maxProduct(int arr[], int n) {
    	
    	int res = arr[0];
    	int minProduct= arr[0];
    	int maxProduct = arr[0];
    	
    	for(int i =1;i<arr.length;i++)
    	{
    		if(arr[i]<0)
    		{
    			//swap when element is negative , as multiplying into positive number will give min value
    			int temp =0;
    			temp=maxProduct;
    			maxProduct= minProduct;
    			minProduct= temp;
    		
    		}
    		maxProduct = Math.max(arr[i], maxProduct*arr[i]);
    	    minProduct = Math.min(arr[i], minProduct*arr[i]);
    		
    	    res= Math.max(res, maxProduct);
    	  }
    	    
    	return res;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {2, 3, 4, 5, -1, 0};
		// int [] arr1 = {3,4};
		 
		 int res =MaximumProductSubArray.maxProduct(arr, arr.length);
      System.out.println("\nAnswer max product subarray:" + res );

    //  System.out.println("\nAnswer:"+FindMissingAndRepeating.findTwoElement(arr1, arr1.length));

  	
  	

	

	}

}
