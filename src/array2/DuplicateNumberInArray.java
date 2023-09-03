package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 *  find all the elements occurring more than once in the given array.
 * Expected Time Complexity: O(n).
 * Expected Auxiliary Space: O(n).
 */

public class DuplicateNumberInArray {
	
	 public static ArrayList<Integer> duplicates(int[] a, int n) {
		 
		 ArrayList<Integer> res = new ArrayList<Integer> ();
		 
		 for(int i =0; i<a.length; i++)
		 {
			 int index = a[i]%n;
			 a[index]+=n;
		 }
		 
		 for(int i =0; i<a.length; i++)
		 {
			if(a[i] - 2*n >=0) {
				res.add(i);
			}
		 }
		 
		 if(res.isEmpty())
		 {
			 res.add(-1);
		 }
		 
		return res;
		 
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {2,3,1,2,4,3,4,5};
	
		System.out.println(DuplicateNumberInArray.duplicates(arr, arr.length));
		
	

	}

}
