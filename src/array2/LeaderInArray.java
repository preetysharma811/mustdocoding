package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * all right side element is smaller than the element
 * T.C - o(n)
 * S.C - o(n)
 */

public class LeaderInArray {
	 static ArrayList<Integer> leaders(int arr[], int n){
	        // Your code here
	    
	       	 Stack<Integer> list = new Stack<Integer>();
	       	 	 list.push(arr[n-1]);
				 int maxRight=arr[n-1];
			 for(int i =n-2;i>=0;i--)
			 {
				 
				 if(maxRight<=arr[i])
				 {
					 list.push(arr[i]);
					 maxRight=arr[i];
				 }
				 
			 }
		 ArrayList<Integer> resList = new  ArrayList<Integer>();
			 while(!list.isEmpty())
			 {
				 resList.add(list.pop());
			 }
			 
		return resList;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {16,17,4,3,5,2};
	
		System.out.println(LeaderInArray.leaders(arr, arr.length));
		
	

	}

}
