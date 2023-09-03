package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * find all the pair and total count which satisfy condition i<j and a[i]>a[j]
 * Time Complexity o(nlog n)
 * Space Complexity o(n)
 * 
 * efficent method Merge Sort using temp array(not modify the orignal array)
 * @author psharma
 *
 */
public class CountInversion {
	
	

	
	 static long inversionCount(long arr[], long n)
	    {
	        // Your Code Here
	           long count = 0;
	      //  int n = N;
	 
			   count = mergeSort (arr, 0 ,(int) n-1);

		        return count;
	    }
	    
	    
	     static long mergeSort(long a [], int left , int right)
		  {
			  int mid = left+(right-left)/2;
			  long inv_Count =0;
			  if(left<right) {
			      
			  // first divide 
			  inv_Count += mergeSort(a, left , mid);
			  inv_Count+= mergeSort(a, mid+1, right);
			  
			  //merge
			  inv_Count+= merge(a , left , mid, right);
			  }
			 return inv_Count;
			  
		  }
		  
		  
		  
		  private static long merge(long[] a, int start, int mid, int end) {
		        long count =0;
		        
		       long [] left = new long[mid-start+1];
		       long [] right = new long[end- mid];
		        
		        for (int i = 0; i < left.length; i++) {
		    	   left[i] = a[start + i];
		        }
		        for (int i = 0; i < right.length; i++) {
		        	right[i] = a[mid+1+i];
		        }
			      
			    int i = 0;
		        int j = 0;
		        int k = (int) start;
		        
			        while(i< left.length &&j<right.length && k<a.length)
			     {
			    	if(left[i]<=right[j])
			    	{
			    		a[k++] = left[i++];
			    		
			    	}
			    	 else {
			    		 a[k++] = right[j++];
			    		 count+= left.length-i;
			         }
			    	
			  
			     }
			     	  
			    	 while(i<left.length && k<a.length) {
			    		 a[k++] = left[i++];
				    	
			    	 }
		
			
		              while(j<right.length && k<a.length) {
		            	  a[k++] = right[j++];
			             
		               }
		        
		      
		        	return count;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long arr[] = {2, 4, 1, 3, 5};
		
		//has 3 inversions (2, 1), (4, 1), (4, 3).
	
      System.out.println(CountInversion.inversionCount(arr,arr.length));

	
	

	}

}
