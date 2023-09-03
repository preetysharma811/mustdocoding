package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * find the number of pairs of integers in the array whose sum is equal to sum
  Time Complexity: O(n * log(n) )
  Auxiliary Space: O(1)
 * 
 * first sort the array then do binary search
 * @author psharma
 *
 */
public class CountPairWithGivenSumUsingUsingSortingAndSearch {
	
	
       static int getPairsCount(int[] arr, int n, int sum)
       {	   
		   //sorting
		   //0(n log n )
		   Arrays.sort(arr);
		   int start =0;
		   int end = n-1;
		   int count = 0;
		   while (start < end)
	        {
	            // sum found
	            if (arr[start] + arr[end] == sum)
	            {
	                System.out.printf("\nPair found (%d, %d)", arr[start], arr[end]);
	                count++;
	            }
	 
	            // increment `low` index if the total is less than the desired sum;
	            // decrement `high` index if the total is more than the desired sum
	            if ( arr[start] + arr[end] < sum) {
	                start++;
	            }
	            else {
	                end--;
	            }
	            
	        }
			return count;
		   
		   
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 1, 5, 7, -1, 5 };
		    int sum = 6;
		  
	
      System.out.println("\nAnswer:"+CountPairWithGivenSumUsingUsingSortingAndSearch.getPairsCount(arr, arr.length, sum));

	
	

	}

}
