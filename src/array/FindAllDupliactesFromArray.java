package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDupliactesFromArray {
	
	
	public static ArrayList<Integer> findDuplicates(int [] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i =0;i<arr.length;i++)
//		{	
//			int index = Math.abs(arr[i]) -1;
//			
//			if(index<0)
//			{
//			    index=0;
//			   // continue;
//			}
//			
//			if(arr[index]>=0) {
//			arr[index] = -1*arr[index];
//			}
//			else {
//				list.add(Math.abs(arr[i]));
//			}
//		}
//		
//		if(list.isEmpty())
//		{
//			list.add(-1);
//		}
		
		int n = arr.length;
		   
        for (int i = 0; i < n; i++) 
      {
        	int val = arr[i];
          int index = val % n;
          arr[index] += n;
          //   System.out.println("index="+index +" val="+arr[index]);
      }
  
       for (int i = 0; i < n; i++) 
      {
          if ((arr[i] - (2*n)) >= 0){
        	  list.add(i);
          }
          //    System.out.print(i + " ");
      }
   
       if(list.isEmpty())
       {
    	   list.add(-1);
       }
		return list;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,3,2,7,8,2,3,1};
		int arr2[]  = {0,3,1,2};
		int arr3 [] = {2, 3, 1, 2, 3};
		
		
		
		System.out.println(FindAllDupliactesFromArray.findDuplicates(arr));
		System.out.println(FindAllDupliactesFromArray.findDuplicates(arr2));
		System.out.println(FindAllDupliactesFromArray.findDuplicates(arr3));

	}

}
