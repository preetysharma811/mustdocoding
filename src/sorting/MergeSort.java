package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * time complexity O(nlogn)
 * space O(n)
 * split the array into two half until single element lefts 
 * then start merging two halft recurively,based on(if left >right) put right then check the left with next rigt
 */
public class MergeSort {

	
	  public static void mergeSort(int a[], int start,  int end)
	    {
		  if(start<end) {
	       int mid = start+(end-start)/2;
	       
	       mergeSort(a,start, mid);
	       mergeSort(a, mid+1, end);
	       
	       merge(a,start, mid, end);
	       
		  }

	    }
	  
	     static void merge(int originalArr[], int start, int mid, int end)
	     {
	       int firstArrLength = mid-start+1;
	       int secondArrLength = end- mid;
	       
	       int [] arr1 = new int[firstArrLength];
	       int [] arr2 = new int[secondArrLength];
	       
	       for (int i = 0; i < firstArrLength; ++i) {
	    	   arr1[i] = originalArr[start + i];
	        }
	        for (int j = 0; j < secondArrLength; ++j) {
	        	arr2[j] = originalArr[mid + 1 + j];
	        }
	        
	 
	       
	       int i =0; int j =0;
	       
	       int index = start;
	     while(i< firstArrLength &&j<secondArrLength)
	     {
	    	if(arr1[i]<=arr2[j])
	    	{
	    		originalArr[index] = arr1[i];
	    		i++;
	    	  }
	    	 else {
	    		 originalArr[index] = arr2[j];
	                j++;
	         }
	    	
	    	index++;
	     }
	     
//	     if(i<firstArrLength)
//	     {
	    	 while(i<firstArrLength) {
	    		 originalArr[index] = arr1[i];
		    		i++;
		    		index++;
	    	 }
	//     }
	    	 
	   //  else if(j<secondArrLength)
	 //    {
              while(j<secondArrLength) {
            	  originalArr[index] = arr2[j];
	                j++;
	                index++;
	    //	 }

	       }
	    		   
	     }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 6, 3, 8, 1};
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
		
		System.out.println("\nafter sorting...");
		MergeSort.mergeSort(arr,0,arr.length-1);
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
	
	

	}

}
