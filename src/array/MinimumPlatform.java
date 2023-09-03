package array;

import java.util.Arrays;


/**
 * 
 *Find the minimum number of platforms required for the railway station so that no train is kept waiting.
 *Expected Time Complexity: O(nLogn)
 *Expected Auxiliary Space: O(1)
 *using sorting both departure and arival time
 */

public class MinimumPlatform {
	
	 static int findPlatform(int arr[], int dep[], int n)
	    {
	        // add your code here
	        Arrays.sort(arr);
	        Arrays.sort(dep);
	        int platformNeeded=1;
	        int minPlatformNeeded=1;
	        
	        int i=1;
	        int j =0;
	        
	        while(i<n && j<n)
	        {
	            if(arr[i]<=dep[j])
	            {
	               platformNeeded++;
	               i++;
	            }
	            
	            else {
	               platformNeeded--;
	               j++;
	            }
	            
	            minPlatformNeeded=Math.max(platformNeeded,minPlatformNeeded);
	        }
	        
	        
	        
	     return  minPlatformNeeded;  
	    }
	  
	public static void main(String[] args) {
		
		int n = 6;
		
		int  arr[] = {Integer.parseInt("0900"),
				      Integer.parseInt("0940"),
				      Integer.parseInt("0950"),1100,1500,1800};
		int  dep[] = {Integer.parseInt("0910"), 1200, 1120, 1130, 1900, 2000};
		System.out.println(MinimumPlatform.findPlatform(arr, dep, n));
		
	

	}

}
