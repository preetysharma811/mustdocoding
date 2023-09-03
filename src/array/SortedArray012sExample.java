package array;

public class SortedArray012sExample {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sortedArray1way(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		while (mid <= end) {
			if (mid <= end) {
				if (arr[mid] == 1) {
					mid++;

				}

				if (arr[mid] == 2) {
					// swap

					swap(arr, end, mid);
					end--;

				}

				if (arr[mid] == 0) {

					swap(arr, start, mid);
					mid++;
				    start++;

				}
			}

		}
		printArr(arr);

	}
	
	public void sortedArray2way(int [] arr1)
	{
		int count0=0;
		int count1=0;
		int count2=0;
		for (int i = 0;i <arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				count0++ ;
			}
			
			if(arr1[i]==1)
			{
				count1++;
			}
			
			if(arr1[i]==2)
			{
				count2++;
			}
		}
		
		//System.out.println("\n0s,1s,2s------------"+ count0 + count1 + count2 );
		for (int j = 0;j<count0;j++)
		{
			arr1[j]=0;
		}
		
		for (int j = count0;j<count0+count1;j++)
		{
			arr1[j]=1;
		}
		
		for (int j = count0+count1;j<count0+count1+count2;j++)
		{
			arr1[j]=2;
		}
		
		printArr(arr1);
	}
	
	
	 //o(n)
	//o(1)
	static void segregateOnTime(int a [])
	{
		int i=0;
		int j= a.length-1;
		int k =0;
		
		while(i<j && i<a.length&&j>0 && k<j) {
			
			if(a[k]==0)
			{
				swap(a,i,k);
				i++;
				k++;
			}
			
			if(a[k]==2)
			{
				swap(a,k,j);
				j--;
				
			}
			if(a[k]==1)
			{
				k++;
			}
		}
		
		printArr(a);
	}
	
	
	public static void printArr(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}

	}
	public static void main(String[] args) {
	    //dutch national flag problem
		SortedArray012sExample sortAlgo = new SortedArray012sExample();
	    int [] n = {0,1,1,0,1,2,1,2,0,0,0,1};
		//sortAlgo.sortedArray1way(n);
		int [] a = {0,1,1,0,2,2,1,2,0,0,1,1,2,1,1,0};
		//sortAlgo.sortedArray2way(a);
		
		segregateOnTime(a);
	}

}
