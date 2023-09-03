package array;

public class ReverseArrayInGroup {
	static void reverSubArray(int a[], int subArraySize)
	{
		int leftOver= a.length%subArraySize;
		for (int i = 0; i < a.length;i=i+subArraySize)
		{
			int start = i;
			int end = i+subArraySize-1;
			reverseArray(a,start, end);
		}
		if(leftOver!=0)
		{
			int start = a.length-leftOver;
			int end = a.length-1;
			reverseArray(a,start,end);
		}
		printArr(a);
	}

	static int[] reverseArray(int[] array, int start, int end) {
		int temp;
		
		while (start<end&&end<array.length)
		{
			
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
			
		return array;
	}
	static void printArr(int arr[]){
		  for (int i =0;i<arr.length ;i++ )
		  {
			  System.out.print(arr[i]);
		  }
		}
	public static void main(String[] args) {
	int a1 [] = {1, 2, 3, 4, 5,6,7,8};
	int a2 [] = {1, 2, 3, 4, 5,6,7,8};
	System.out.println("orignal array ---------");
	printArr(a1);
	System.out.println("\nreversed array with 3 index sub group  ---------");
	reverSubArray(a1,3);
	System.out.println("\nreversed array 2 index sub group---------");
	reverSubArray(a2,2);
	}

}
