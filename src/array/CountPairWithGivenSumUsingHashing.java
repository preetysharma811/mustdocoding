package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * find the number of pairs of integers in the array whose sum is equal to sum
 Time Complexity: O(n)
 Auxiliary Space: O(n),
 * 
 *use hashmap to store and check if sum-arr[i] value already present in hashmap , if not add an entry
 *
 */
public class CountPairWithGivenSumUsingHashing {
	
	

	  static int getPairsCount(int[] arr, int n, int sum)
	    {
		   ArrayList<String> resList = new   ArrayList<String> ();
		   int count=0;
		   
		   Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		   
		   for(int i = 0 ; i<arr.length;i++)
		   {
			   if(map.containsKey(sum-arr[i]))
			   {
				   resList.add(String.valueOf("("+arr[i])+","+ String.valueOf(sum-arr[i])+")");
				   count = count+ map.get(sum-arr[i]);
			    }
			    if(map.containsKey(arr[i]))
			   {
				   map.put(arr[i], map.get(arr[i])+1);
			   }
			   else {
				   map.put(arr[i], 1);
			   }
		   }
		   
		   System.out.println(resList);
			return count;
		   	   
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr[] = { 1, 5, 7, -1, 5 };
	        int sum = 6;
	        

			  int arr1[] = {  1, 5, 7, 1 };
		        int sum1 = 6;
	        
	        
	       
	
      System.out.println(CountPairWithGivenSumUsingHashing.getPairsCount(arr1,arr1.length, sum1));

	
	

	}

}
