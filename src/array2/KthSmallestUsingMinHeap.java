package array;

/**
 * 
 * @author psharma
 * 
 */
//Kth smallest element using MinHeap 
//Complexity
//Time complexity: O(N + K Log N).
//Auxiliary Space: O(N)
public class KthSmallestUsingMinHeap {
	
	  public static int kthSmallest(int[] arr, int k) 
	    { 
	       int temp [] = new int[arr.length];
	       int size = arr.length;
	        
	         temp=arr; 
	         buildMinHeap(temp);
	         
	         for(int i = 0 ;i<k-1;i++)
	          {
	        	 extractMin(temp,size );
	        	 size--;
	          }
	       
	      
	       
	       return temp[0]; 
	    } 
	    
	   static void  buildMinHeap(int[] arr)
	    {
	        for(int i=(arr.length-1)/2;i>=0;i--)
	        {
	            heapify(arr,i);
	        }
	       
	    }
	   
	    
		   static int  extractMin(int[] arr, int size)
		    {  
			   if (size == 0) {
	                return Integer.MAX_VALUE;
		         }
			   if (size > 1) {
                arr[0] = arr[size - 1];
                heapify(arr,0);
              }
            return arr[0];
		    }
	    
	  static  void  heapify(int [] arr, int index)
	    {
	        
	            int smallest = index;
	            int leftChildIndex = (index*2)+1;
	            int rightChildIndex = (index*2)+2;
	            
	           if(leftChildIndex<arr.length&&arr[leftChildIndex]<arr[index]) {
	        	   smallest= leftChildIndex;
	           }
	           
	           if(rightChildIndex<arr.length&&arr[rightChildIndex]<arr[smallest])
	           {
	        	   smallest=rightChildIndex;
	           }
	           if(smallest!=index){
	               swap(arr,smallest, index);
	               heapify(arr,smallest); 
	           }
	       
	    }
	    
	     static  void swap(int a [], int i , int j){
				
				int temp = a[i];
				 a[i]= a[j];
				 a[j] = temp;

			}
				
	public static void main(String[] args) {
	
		int a [] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		System.out.println(KthSmallestUsingMinHeap.kthSmallest(a, k));
		
		
		
		int b [] = {7, 10, 4, 20, 15};
		int k1=4;
		System.out.println(KthSmallestUsingMinHeap.kthSmallest(b, k1));
	 
	}

}
