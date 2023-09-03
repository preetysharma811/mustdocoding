package array;

import java.util.Arrays;

public class MinimumNumberOfJump {
	
	
	static void minNumberOfJump(int a [])
	{
	
		
		int currentStep = 0;
		int maxJump = 0;
		int count = 0;
		if(a[0]==0)
		{
			System.out.println(-1);
		}
		if(a.length==1)
		{
			System.out.println(1);
		}
		
		
		for(int i =0;i<a.length-1;i++)
		{
			maxJump = Math.max(maxJump, a[i]+i);
			
			if(i==currentStep)
			{
				currentStep =maxJump;
				count++;
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int jumpsArray[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
		int  jumpsArray2[] = {1, 4, 3, 2, 6, 7};
		
		
		minNumberOfJump(jumpsArray);
		minNumberOfJump(jumpsArray2);
		
		
	
	}

}
