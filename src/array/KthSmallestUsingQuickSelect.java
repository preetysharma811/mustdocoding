package array;

/**
 * 
 * @author psharma
 * 
 */
//QuickSelect
//Time Complexity: O(N2) in worst case and O(N) on average 
//Auxiliary Space: O(1)

public class KthSmallestUsingQuickSelect {
	
	   public static int kthSmallest(int[] arr, int k) 
	    { 
	        
	        return quickSelectMethod(k , arr);
	         
	    } 
	   static  int quickSelectMethod(int k, int a [])
	    {
	         quickSort(a,0,a.length-1,k);
	         for(int i =0;i<a.length;i++)
	         {
	        	    System.out.print(a[i] + ",");
	         }
	     
	         return a[k-1];
	    }
	    
	    
	     static int quickSort(int a[] , int start , int end , int k){
			
	    	 //if k is greater than 0 and lies between start and end
			if(k>0 &&k<=(end-start)+1) {
				int pivot = partition(a,start, end);
				
				if(k-1==pivot-start)
				{
					return a[pivot];
				}
				//move on left
				if(pivot-start>k-1) {
				return	quickSort(a,start,pivot-1,k);
				}
				//move on right
				else {
				return quickSort(a,pivot+1,k-pivot+1,k);
				}
			}
			
			 return Integer.MAX_VALUE;
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
				System.out.println("\nkth element = "+
						KthSmallestUsingQuickSelect.kthSmallest(a, k));
						
//				
//				int a1 [] = {73, 188, 894, 915, 940, 616, 900, 548};
//			System.out.println("\nkth element = "+
//						KthSmallestUsingQuickSelect.kthSmallest(a1, 7));
						
			 
			}


}
