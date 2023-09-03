package array;

public class LeadersInArray {
	
	static void findLeader(int arr [], int n)
	{
	
		
		int maxNum = arr[n-1];
		System.out.print(maxNum + ",");
		
		for(int i =arr.length-2; i >=0; i--)
		{
			if(arr[i]>maxNum)
			{
				maxNum=arr[i];
				System.out.print(maxNum + ",");
			}
		}
		
		
	}

	public static void main(String[] args) {
	int a [] = {16,17,4, 3, 5, 2};
	
	findLeader(a, a.length);
	}

}
