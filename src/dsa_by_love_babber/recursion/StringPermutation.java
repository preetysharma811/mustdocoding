package dsa_by_love_babber.recursion;

public class StringPermutation {
	
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
		//never use n-- , as it never reaches to the condtion
		return	isSorted(arr,n-1);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2,5,7,8,10,23};
		
		System.out.println("array is sorted:" + isSorted(arr,arr.length));
		
        int arr1[] = {2,5,7,8,10,1};
		
		System.out.println("array is sorted:" + isSorted(arr1,arr1.length));
		

		

	}

}
