package array;

public class TrappingRainWater {
	
	
	static int getTrappingWater(int a [] , int left, int right)
	
	{
	
		int leftMax=0;
		int rightMax=0;
		int riverWater=0;
		
		
		while(left<right)
		{
			if (a[left]<a[right])
					{
			         if(a[left]>leftMax)
			         {
			        	 leftMax=a[left];
			         }
			         else {
			        	 int towerWater=leftMax-a[left]; 
			        	 riverWater+=towerWater; 
			              }
					
					left++;
					}
			else 
			{
	         if(a[right]>rightMax)
	         {
	        	 rightMax=a[right];
	         }
	         else {
	        	 int towerWater=rightMax-a[right];
	        	 riverWater+=towerWater;
	          }
	         right--;
			}
	
		}
		return riverWater;
		
	}

	public static void main(String[] args) {
		int a[] = {7,1,4,0,2,8,6,3,5};
		
		System.out.println("tota water -------"+getTrappingWater(a,0,a.length-1));
	
	}

}
