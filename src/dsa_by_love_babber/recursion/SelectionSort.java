package dsa_by_love_babber.recursion;

public class SelectionSort {
	
	static void selectionSort(int arr [],int n,int index)
	{
		//base condition
		if(index>=n) {
			return;
		}
		
		
		int minIndex= index;
		int i=index+1;
				 
		while(i<=n)
		{
		if(arr[i]<arr[minIndex]) {
			minIndex=i;
		 }
		i++;

		}
		swap(arr,minIndex,index);
		//never use n-- , as it never reaches to the condtion
		selectionSort(arr,n,index+1);
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
		
		int arr[] = {10,5,2,4,9,1};
		 print(arr);

		selectionSort(arr,arr.length-1,0);
		 print(arr);


		

	}

}
