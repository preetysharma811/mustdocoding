package array;

public class MaxOfSubArrayKsize {
	
	static void findMaxSequence(int [] array, int subArraySize)
	{
		for (int i=0;i<array.length-subArraySize+1;i++) {
			int max=array[i];
			for (int j=i+1;j<=i+subArraySize-1;j++)
			{
				if (max<array[j])
				{
					max=array[j];
				}
				
			}
			System.out.println(max);
		}
		
	}

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		findMaxSequence(a,4);

	}

}
