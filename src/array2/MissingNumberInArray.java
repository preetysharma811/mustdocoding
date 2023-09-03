package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * in natural number array , find missing number , using xor or binary operation
 * T.C - o(n)
 * S.C - o(1)
 * xor properties
 * a^a=1
 * a^a^b=b
 */

public class MissingNumberInArray {
	
	 static int MissingNumber(int array[], int n) {
	        // Your Code Here
	   
	       int temp = 0;
	       for (int i = 0; i < array.length; i++) {
	        temp = temp ^ array[i];
	       }
	       
	      for (int i = 1; i <= n; i++) {
	        temp = temp ^ i;
	      }
	 
	        return temp;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =   {1,2,3,5};
	
		int n = 5;
		System.out.println(MissingNumberInArray.MissingNumber(arr, n));
		
	

	}

}
