package dsa_by_love_babber.recursion;

public class BubbleSort {
	
	
	//complexity o(n2)
	static void bubbleSort(int arr [],int n)
	{
		//base condition
		if(n==0||n==1) {
			//print(arr);
			return ;
		}
		
		for(int i =0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				swap(arr,i,i+1);
			}
		}
		
			bubbleSort(arr,n-1);
		
	}
	
	static void swap(int [] arr, int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	
	static void print(int [] arr)
	{
		System.out.println();
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {3,9,7,1,8,10,2};
		 print(arr);
		 bubbleSort(arr,arr.length);
		 print(arr);
			
		
		

	}

}
