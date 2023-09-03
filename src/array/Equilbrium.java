package array;

public class Equilbrium {
	
	public static int getEquilibrium(int array [])
	{
		int leftSum,rightSum;
		int index=0;
		for (int i = 0 ;i < array.length ;i++)
		{
			leftSum=0;
			for (int j = 0 ;j <i ;j++)
			{
				leftSum+=array[j];
			
			}
		

			rightSum=0;
			for (int j = i+1 ;j <array.length ;j++)
			{
				rightSum+= array[j];
				
			}
			
			if (leftSum==rightSum)
			{
				System.out.println("left -------------"+leftSum);
				System.out.println("right -------------"+rightSum);
				System.out.println("index--------------"+i);
				index=i;
			}
		}
		
		
		return index;
		
	
	
	}
	
	public static int equlibriumInOneLoop(int array [])
	{
		int index= 0;
		int leftSum=0;
		int sum =0;
		
		for(int i =0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		//System.out.println(sum);
		
		for(int i =0;i<array.length;i++)
		{
			sum=sum-array[i];
			if(sum>leftSum) {
				leftSum=leftSum+array[i];
			}
			if(leftSum==sum)
			{
				index=i;
				System.out.println("right: "+sum);
				System.out.println("left: "+leftSum);
				System.out.println("index: "+i);
			}
		}
		
		return index;
	
	}

	public static void main(String[] args) {
		int [] arr = {1,2,1,1,4};
		getEquilibrium(arr);
		equlibriumInOneLoop(arr);
	}

}
