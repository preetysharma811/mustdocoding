package dsa_by_love_babber.recursion;

public class SumOfArray {
	
	static boolean isSorted(int arr [],int n)
	{
		//base condition
		if(n==0||n==1) {
			return true;
		}
		
		if(arr[n-2]>arr[n-1])
		{
			return false;
			
		}
		
		else {
			
		return	isSorted(arr,n--);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2,5,7,9,10,23};
		
		System.out.println("array is sorted:" + isSorted(arr,arr.length));
		

	}

}
