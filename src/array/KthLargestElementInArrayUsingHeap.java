package array;

/**
 * 
 * @author psharma
 * 
 */

public class KthLargestElementInArrayUsingHeap {
	
	static int getKthLargestElement( int a [], int k){
		
	 int minheapArr [] = new int [k];
	 
	 
	 for(int i = 0; i < k; i++)
	 {
	 
		 minheapArr[i]=a[i];
	 
	 }
	 
	 buildMinHeap(minheapArr);
	 
	 for(int i =0; i < a.length-k; i++)
	 {
		 if(minheapArr[0]<a[k+i]) {
			 minheapArr[0]=a[k+i];
			 buildMinHeap(minheapArr);
		 }
			 
	 }
	 System.out.println(minheapArr[0]);
	 
		return  minheapArr[0];
	}

	
	static void buildMinHeap(int [] a)
	{
		for(int i = 0; i<(a.length/2); i++)
			
		{ 	 
			heapify(a,i);
		}
	}
	
	
	  static void heapify(int [] a, int i) {
		   
		   int parent = i;
		   int leftChild = 2*i+1;
		   int rightChild = 2*i+2;
		
		   
		   if(leftChild<a.length && a[leftChild]<a[parent])
		   {
			   parent=leftChild;
		   }
		   
		   if(rightChild<a.length  && a[rightChild]<a[parent])
		   {
			   parent=rightChild;
		   }
		   
	    	if(parent!=i)
	    	{
	    		swap(a,parent,i);
	    		  heapify(a, parent);
	    	}
	    	
	    }
	  
	  static void swap(int a [], int i , int j){
			
			int temp = a[i];
			 a[i]= a[j];
			 a[j] = temp;

		}
		
	
	public static void main(String[] args) {
	
		int a [] = {1, 23, 12, 9, 30, 2, 50};
		int k = 3;
		
		getKthLargestElement(a, k);
	 
	}

}
