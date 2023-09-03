package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * find the minimum step to reach the end of array, arr[i] gives the maximum moves 
 * iterates thru all the steps in the maximum and check if it reaches to end with minimum jumps
 * T.C - o(n)
 * S.C - o(1)
 */

public class MinimumNumberJump {
	
	 public static int minJumps(int[] a) {
		 
		int maxSteps=a[0];
		int steps =a[0];
		int jump=1;
		
		int i=1;
		//edge cases
		
		if(a.length==1)
		{
			return 1;
		}
		
		if(a[0]==0)
		{
			return -1;
		}
		
		while(i<a.length)
		{
			 if(i==a.length-1){
                 return jump;
             }
			 
			int maxstepsAtIndex = a[i]+i;
			maxSteps = Math.max(maxSteps, maxstepsAtIndex);
			steps--;
			
			if(steps==0)
			{
				    jump++;     // increament jump when steps is zero
				   if(i>=maxSteps){
                       return -1;    // edge case can't reach if i crossed the maxStep
                   }
				   steps = maxSteps-i;
			}
					
		i++;
		}   
		
	    return jump;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
	
		System.out.println(MinimumNumberJump.minJumps(arr));
		
	

	}

}
