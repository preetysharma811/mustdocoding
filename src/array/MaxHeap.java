package array;
import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * 
 * build Max heap from array
 * logic- start from last non-leaf index and heapfiy (swap if parent is small)
 * complexity o(nlogn)
 *
 */
public class MaxHeap {
	
	
	public static void main (String[] args) throws Exception {
	int arr1 [] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
		
		int arr []= {4, 10, 3, 5, 1};
	
	print(arr1);
	
	buildMaxHeap(arr1);
	
	print(arr1);
	
	
     print(arr);
	
	buildMaxHeap(arr);
	
	print(arr);
    
     
	}
	static void swap(int a [], int i , int j){
		
		int temp = a[i];
		 a[i]= a[j];
		 a[j] = temp;

	}
	
	
    static void print(int a []){
    	System.out.println();
		for(int i =0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+",");
		}
	}

   static void heapify(int [] a, int i) {
	   
	   int largest = i;
	   int leftChild = 2*i+1;
	   int rightChild = 2*i+2;
	 
	   
	   if(leftChild<a.length && a[leftChild]>a[largest])
	   {
		   largest=leftChild;
	   }
	   
	   if(rightChild<a.length  && a[rightChild]>a[largest])
	   {
		   largest=rightChild;
	   }
	   
    	if(largest!=i)
    	{
    		swap(a,largest,i);
    		  heapify(a, largest);
    	}
    	
    }
	
	
	public static void buildMaxHeap(int [] a)
	{
		int lastNode =  a.length;
		  int nonlastleafIndex = (lastNode / 2) - 1;
		 for (int i = nonlastleafIndex; i >= 0; i--) {
	            heapify(a, i);
	        }
	  
	}
}