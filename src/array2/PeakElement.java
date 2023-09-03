package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  peak element if its value is not smaller than the value of its adjacent elements(if they exists)
  Time Complexity: O(log(n) )
  Auxiliary Space: O(1)
 * 
 * using binary search
 * @author psharma
 *
 */
public class PeakElement {
	
	
       static int checkPeakElement(int[] arr, int n)
       {	   
		  
		   int start =0;
		   int end = n-1;
		   int mid =0;
		   while (start <= end)
	        {
			    mid = start+(end-start)/2;
	           
	            if ((mid ==0||arr[mid-1]<=arr[mid] ) && (mid==n-1|| arr[mid+1]<=arr[mid]))
	            {
	               break;
	            }
	            //move left
	              if (mid > 0&&arr[mid-1] > arr[mid])
	            {
	               end=mid-1;
	            }
	              //move right
	              else {
	              
	                start= mid+1;
	                
	              }
	            
	        }
		   
		  return arr[mid];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {1,2,3};
		 int [] arr1 = {3,4};
		 
	
      System.out.println("\nAnswer:"+PeakElement.checkPeakElement(arr, arr.length));

      System.out.println("\nAnswer:"+PeakElement.checkPeakElement(arr1, arr1.length));

  	
  	

	

	}

}
