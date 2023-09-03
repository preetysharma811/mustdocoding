package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RelativeSortingTwoArrays {
	
	static void printArr(int arr[]){
		  for (int i =0;i<=arr.length-1 ;i++ )
		  {
			  System.out.print(arr[i]+",");
		  }
		}


	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	


	public static void main(String[] args) {
		  int   a1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
	      int   a2[] =  {2, 1, 8, 3};
	      LinkedHashMap<Integer, Integer> map  = new LinkedHashMap<Integer, Integer>();
	      Arrays.sort(a1);
	      int frequency =0;
	      int index=0;
	      printArr(a1);
	      for (int i=0;i<a2.length;i++)
	      {
	    	 
	    	  frequency =0;
	    	  for(int j=0;j<a1.length;j++)
	    	  {
	    		  if(a2[i]==a1[j])
	    		  {
	    			 
	    			  frequency=frequency+1;
	    						
	    		  }
	    		
	    	  }
	    	  int value = a2[i];
	    	   while (frequency<0)
	    	   {
	    		   swap(a2,index,index+1);
	    		   index=index+1;
	    	   }
	    	 map.put(a2[i], frequency);
	    		    	  
	      }
	      
	      System.out.println("\n" + map.entrySet());
	
	      Iterator  itr = map.entrySet().iterator();
	      while(itr.hasNext()) {
	    	 
	    	  Object element = itr.next();
	    	  System.out.println(element);
	    	  
	    	  
	      }
	 

	   
}
}