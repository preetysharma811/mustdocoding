package array;

public class QuickSortAlgo {
	
	public static void quickSort(int a[] , int start , int end ){
		
		if(start<end)
		{
			int pivot = partition(a,start, end);
			quickSort(a,start,pivot-1);
			quickSort(a,pivot+1,end);
		}
	}
	
	static void swap(int arr[], int a, int b) {
		int temp ;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	  static int partition(int [] a,int start , int end) {
		int pivot = a[end];
		int i=start-1;
		for (int j=start ;j<end;j++)
		{
			if(a[j]<=pivot) {
				i++;
			swap(a,j,i);
		}
	  }
		swap(a,i+1,end);
		return i+1;
	}
	
		static void printArr(int arr[]){
			  for (int i =0;i<arr.length ;i++ )
			  {
				  System.out.print(arr[i]+"," );
			  }
			}
	public static void main(String[] args) {
        int [] a = {13,19,9,5,12,8,2,11} ;
        
        printArr(a);
        quickSort(a,0,a.length-1);
        System.out.print("\nsorted---------\n");
        printArr(a);
      
       
	}

}
