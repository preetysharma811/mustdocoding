package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {
	
	
	  static ArrayList<Integer> subarraySum(int[] arr, int s) 
	    {
	        // Your code here
	         ArrayList<Integer> list = new ArrayList<>();
	        
	        int startIndex =0;
	        int endIndex=0;
	        
	        int currSum=arr[0];
	        
	      for(int i =1;i<arr.length;i++)
	      {
	          
	       currSum+=arr[i];
	       
	      
	       if(currSum>s)
	       {
	           while(currSum>s && startIndex<i) {
	            currSum-=arr[startIndex];
	            startIndex++;  
	           }
	        }

	       if(currSum==s)
           {
            endIndex=i;
            list.add(startIndex+1);
            list.add(endIndex+1);
            break;
           }
	       
	      }
	      
	      return list; 
	        
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 7, 5};
	
		
		System.out.println(SubArrayWithGivenSum.subarraySum(arr,12));
	

	}

}
