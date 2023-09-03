package array;

public class KthSmallestPositionArray {
	
	static int partition(int [] a,int start , int end) {
				int value = a[end];
				int i=start-1;
				for (int j=start ;j<end;j++)
				{
					if(a[j]<=value) {
						i++;
					swap(a,j,i);
				}
			  }
				swap(a,i+1,end);
				return i+1;
			}
		 
	static void swap(int arr[], int a, int b) {
		int temp ;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

	
	public static int  getSmallestElementFromUnsortedArray(int [] a, int start, int end , int k) {
		
		
		if(start<end &&  k > 0 && k <= end)
		{
			int pivot = partition(a,start,end);
			
			if(pivot-1==k-1)
			{
				return pivot;
			}
			
			else if(k-1>pivot-1)
			{
				return getSmallestElementFromUnsortedArray(a,pivot+1,end,k);
			}
			
			
			else if(k-1<pivot-1)	
			{
				return getSmallestElementFromUnsortedArray(a,start,pivot-1,k);
			}
		}
		
		return Integer.MAX_VALUE;
		
	}
	
	
	public static void main(String[] args) {
		 int [] a = {13,19,9,5,12,8,2,11,17,1} ;		 
		 int k = 4;	        
		int value =getSmallestElementFromUnsortedArray(a,0,a.length-1,k-1);
		System.out.println(value);
		System.out.println(a[value]);

	}

}
