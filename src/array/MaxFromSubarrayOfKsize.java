package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Find the maximum for each and every contiguous subarray of size K.
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(k)
 * 
 * 
 */
public class MaxFromSubarrayOfKsize {
	
	
	 static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
	    {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
		 Deque<Integer> dequeue = new LinkedList<Integer>();
		 
		  // Your code here
	        int i =0;
	        int j=0;
	        
	       
	        while(j<n)
	        {
	        	
	        	while(dequeue.size()>0&&dequeue.getLast()<arr[j])
	        	{
	        		dequeue.removeLast();	
	        	}
	        
	        	dequeue.addFirst(arr[j]);
	            if(j-i+1<k)
	            {
	                
	            }
	            
	            else if(j-i+1==k)
	            {
	            	if(dequeue.getFirst()==arr[i])
	            
	            	list.add(dequeue.getFirst());
	                i++;
	                j++;
	            }
	        
	        
	        
			return list;
	        
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n = 234;
		 
		System.out.format("reverse of number=%s, is %s", n,MaxFromSubarrayOfKsize.reverseDigit(n));
     

	}

}
