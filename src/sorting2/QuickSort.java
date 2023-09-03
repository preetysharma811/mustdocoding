package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	
	
	  public static void sort012(int a[], int n)
	    {
	    int i = 0, twoIndex = n- 1, zeroIndex = 0;

	        while(i <= twoIndex){

	            if(a[i] == 0){

	                swap(a,i,zeroIndex);
	                ++i;
	                ++zeroIndex;

	            }
	            if(a[i] == 1){
                  ++i;
	              

	            }

	            if(a[i] == 2){

	                swap(a,i, twoIndex);

	                --twoIndex;

	            }

	         

	        }

	    }
	     static void swap(int ar[], int a, int b)
	     {
	         int temp = ar[a];
	          ar[a]= ar[b];
	         ar[b] = temp;
	     }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0, 2, 1, 2, 0};
	
		QuickSort.sort012(arr,arr.length);
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
	
	

	}

}
