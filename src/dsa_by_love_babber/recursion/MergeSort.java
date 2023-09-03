package dsa_by_love_babber.recursion;

public class MergeSort {
	
	//fast sorting
	static void mergeSort(int arr [], int start, int end)
	{
		//base condition
		if(start>=end)
		{
			return;
		}
		
		int mid = start+(end-start)/2;
		
		//left
		mergeSort(arr,start,mid);
		//right
		mergeSort(arr,mid+1,end);
		
		merge(arr,start, end);
		
	}
	
	static void merge(int arr [], int start, int end)
	{
		//create two array and copy the value and do further sorting
		int mid = start+(end-start)/2;
		int len1 = mid - start + 1; //length of first half
	    int len2 = end - mid; //length of second half
	       
		
		int first[] = new int[len1];
		
		int second[] = new int[len2];
		
		
		int mainArrayIndex=start;
		
	     for(int i =0;i<len1;i++)
				{
	    	    first[i]  =	arr[mainArrayIndex];
	    	      mainArrayIndex++;
				}
		
	     for(int i =0;i<len2;i++)
			{
 	         second[i]  = arr[mainArrayIndex];
 	         mainArrayIndex++;
			}
	
	     mainArrayIndex=start;
	     
	     int i =0;
	     int j =0;
	     
	     while(i<len1&&j<len2)
	     {
	    	 if(first[i]<second[j])
	    	 {
	    		arr[mainArrayIndex] =first[i];
	    		i++;
	    	 }
	    	 else {
	    		 arr[mainArrayIndex] =second[j]; 
	    		 j++;
	    	 }
	    	 
	    	 mainArrayIndex++;
	     }
	     
	     
	       //if in arr1 elements are remaining
	        while(i < len1){
	            arr[mainArrayIndex++] = first[i];
	        }
	        
	        //if in arr2 elements are remaining
	        while(j < len2){
	            arr[mainArrayIndex++] = second[j];
	        }
	     	
	}

	static void print(int [] arr)
	{
		System.out.println();
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,5,1,23,2,7};
		
		print(arr);
		
		mergeSort(arr,0,arr.length-1);
		
		print(arr);
		

	}

}
