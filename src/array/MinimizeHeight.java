package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * increase array element by 'k' and decrease array element by 'k' and get the minimum difference between smallest and largest 
 * first short the array
 * a[o] is smallest and a[n-1] is largest
 * formula = a[n-1]-k - a[0]+k and find consecutive element
 * T.C - o(n log n)
 * S.C - o(1)
 */

public class MinimizeHeight {
	
	 static int getMinDiff(int[] a, int n,int k) {
	        
         if(n==1){
           return 0;
       }
      Arrays.sort(a);
      
      int max_ = a[n-1];
      int min_ = a[0];
      
     int diff = max_ - min_;
     
     for(int i =1;i<n;i++)
     {
    	 max_ = Math.max(a[i-1]+k, a[n-1]-k);
    	 min_ = Math.min(a[i]-k, a[0]+k);
    	 diff= Math.min(diff, max_-min_);
     }
      
      return diff;
      
 
	 }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  { 1, 5, 8, 10};
		int k = 2;
		
		System.out.println(MinimizeHeight.getMinDiff(arr,arr.length, k));
		
	

	}

}
