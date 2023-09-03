package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * One number 'X' from set {1, 2, N} is missing and
 * 2nd number 'Y' occurs twice in array. Find these two numbers.
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * p= sum of square of all natural number - sum of square of array element  
 * s= sum of n natual number - sum of array element
 *  
 *  Mathematica solution formula (X + Y) = P/S
 *   sum of sqaure of natual number = N*(N+1)(2N+1)/6 
     sum of natual number = N*(N+1)/2

 */
public class FindMissingAndRepeatingUsingMathFormula {
	
    static int[] findTwoElement(int arr[], int n) {
        // code here
        int[] res = new int[2];
        
        //repeating number
        for(int i =0;i<n-1;i++)
        {
            if(arr[i+1]==arr[i])
            {
              res[0]=arr[i];
              break;
            }
        }
        
        //missing number
         for(int i =0;i<n-1;i++)
        {
            if(arr[i]+1!=arr[i+1])
            {
              if(arr[i]==arr[i+1]){
                res[1]=arr[i]-1; 
                break;
              }
              else {
                  res[1]=arr[i+1]+1;  
                  break;
              }

              
            }
        }
        
        
        return res;
   
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {2, 2};
		// int [] arr1 = {3,4};
		 
		 int [] res =FindMissingAndRepeatingUsingMathFormula.findTwoElement(arr, arr.length);
      System.out.println("\nAnswer repeating:" + res[0] + " & missing:  "+ res[1] );

    //  System.out.println("\nAnswer:"+FindMissingAndRepeating.findTwoElement(arr1, arr1.length));

  	
  	

	

	}

}
