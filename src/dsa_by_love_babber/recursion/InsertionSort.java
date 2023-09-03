package dsa_by_love_babber.recursion;

public class InsertionSort {
	
	static void insertionSort(int arr [],int n, int index)
	{
		//base condition
		if(index>=n) {
			return;
		}
		
		
		int currentElement = arr[index];
		int j = index-1;
		while(j>=0)
		{
			if(currentElement<arr[j])
			{
				//shit to right
				arr[j+1]=arr[j];
				arr[j]=currentElement;
			}
						
			j--;
		}
		
	
		insertionSort(arr,n,index+1);

		
	
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
		
		int arr[] = {5,1,10,8,2,7};
		print(arr);
		 insertionSort(arr,arr.length,0);
		 print(arr);
				

	}

}
