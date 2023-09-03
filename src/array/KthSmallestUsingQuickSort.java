package array;

/**
 * 
 * @author psharma
 * 
 */

//Kth smallest element using MaxHeap 
//Complexity
//T.C = o(n)
//S.C = o(log n) average

public class KthSmallestUsingQuickSort {
	
	   public static int kthSmallest(int[] arr, int k) 
	    { 
	        
	        return quickSortMethod(k , arr);
	         
	    } 
	   static  int quickSortMethod(int k, int a [])
	    {
	         quickSort(a,0,a.length-1);
	         for(int i =0;i<a.length;i++)
	         {
	        	    System.out.print(a[i] + ",");
	         }
	     
	         return a[k-1];
	    }
	    
	    
	     static void quickSort(int a[] , int start , int end ){
			
			if(start>=end)
			{
				return;
			}
			
				int pivot = partition(a,start, end);
				quickSort(a,start,pivot-1);
				quickSort(a,pivot+1,end);
	
		}
	    

		  static int partition(int [] a,int start , int end) {
			int pivot = a[end];  //fixed point
			int i = start-1;
			
			
			 for (int j = start; j <= end - 1; j++) {
				  
		            // If current element is smaller
		            // than the pivot
		            if (a[j] < pivot) {
		  
		                // Increment index of
		                // smaller element
		                i++;
		                swap(a, i, j);
		            }
		        }
		        swap(a, i + 1, end);
		        return (i + 1);
		}
		
		  static  void swap(int a [], int i , int j){
				
				int temp = a[i];
				 a[i]= a[j];
				 a[j] = temp;

			}
			
			public static void main(String[] args) {
				
				int a [] = {7, 10, 4, 3, 20, 15};
				int k = 3;
				
				int a1 [] = {73, 188, 894, 915, 940, 616, 900, 548};
			System.out.println("\nkth element = "+
						KthSmallestUsingQuickSort.kthSmallest(a1, 7));
						
			 
			}


}
