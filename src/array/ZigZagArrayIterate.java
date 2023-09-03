package array;

public class ZigZagArrayIterate {

	
	
	static void printZigZag(int a [])
	{
	
	for (int i = 0;i<a.length-1;i++)
	{
		if (a[i]>a[i+1])
		{
			
		
			System.out.println(a[i+1]);
			swap(a, i,i+1);
		}
		
		if(a[i+1]<a[i+1+1])
		{
			
			System.out.println(a[i+1+1]);
			System.out.println( a[i+1]);
			swap(a, i+1,i+1+1);
							
		}
	
		i=i+3;
	  }
	
	}
	public static void printArr(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
	
		int a [] = { 4, 3, 7, 8, 6, 2, 1};
		
		printArr(a);
		printZigZag(a);
		
		printArr(a);
	}

}
