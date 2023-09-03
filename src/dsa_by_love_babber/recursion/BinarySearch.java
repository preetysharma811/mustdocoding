package dsa_by_love_babber.recursion;

public class BinarySearch {
	
	static boolean binarySearch(int arr [],int n, int start, int end)
	{
		int mid = start+(end-start)/2;
		//base condition
		if(arr[mid]==n)
		{
			return true;
		}
		else if(n<arr[mid])
		{
			binarySearch(arr,n,start, mid-1);
		}
		else if(n>arr[mid])
		{
			binarySearch(arr,n,mid+1,end);
		}
		
	    mid = start+(end-start)/2;
		
		return false;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2,5,7,9,10,23};
		int n=9;
		
		System.out.println("found the element:" + binarySearch(arr,10, 0, arr.length));
		

	}

}
