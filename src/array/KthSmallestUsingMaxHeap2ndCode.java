package array;

/**
 * 
 * @author psharma
 * 
 */
//Kth smallest element using MaxHeap 
//Time Complexity: O(K + (N-K) * Log K) 
//Auxiliary Space: O(K)

class MaxHeap{
	int arr [] ;
	 int capacity;
     int size; 
     
     MaxHeap(int arr[], int size)
     {
    	 this.arr=arr;
    	 this.size=size;
    	 int nonIndex = (size-1)/2;
    	 for(int i =nonIndex;i>=0;i--)
    	 {
    		 maxHeapify(i);
    	 }
     }
     
     void replaceMax(int x)
     {
         this.arr[0] = x;
         maxHeapify(0);
     }
     
    void maxHeapify(int i) {
    	
     int left = 2 * i + 1;
     int right = 2 * i + 2;
     int largest = i;
     
     
     if (left < size && arr[left] > arr[i])
         largest = left;
     if (right < size && arr[right] > arr[largest])
         largest = right;
     if (largest != i) {	 
    	 //swap
    	 swap(arr,i,largest);
         maxHeapify(largest);
     }
 }
    
    void swap(int a[], int i, int j)
    {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
}

public class KthSmallestUsingMaxHeap2ndCode {
	
	   public static int kthSmallest(int[] arr, int k) 
	    {
		   int n = arr.length;
		   // Build a heap of first k elements: O(k) time
		   MaxHeap heap = new MaxHeap(arr,k);
		   
		   for (int i = k; i < n; i++) {
	            if (arr[i] < heap.arr[0])  {  //check for root is max
	            	heap.replaceMax(arr[i]);
	            }
		   }
	 
	        // Return root
	        return heap.arr[0];
	        
	    }
			
			public static void main(String[] args) {
				
				int a [] = {7, 10, 4, 3, 20, 15};
				int k = 3;
				
				int a1 [] = {73, 188, 894, 915, 940, 616, 900, 548};
			System.out.println("\nkth element = "+
						KthSmallestUsingMaxHeap2ndCode.kthSmallest(a1, 7));
						
			 
			System.out.println("\nkth element = "+
					KthSmallestUsingMaxHeap2ndCode.kthSmallest(a, k));
					
			}


}
