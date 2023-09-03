package array;

public class AppearsDoubleArray {
	
	static void findElementNotDouble(int arr[])
	{
		
		
		for (int i =0;i <arr.length-1;i++)
		{
			
			if(arr[i]==arr[i+1])
			{
				i=i+1;
				
			}
			else {
				
				System.out.println("singled left--- " + arr[i] );
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
       int a [] = {1, 1, 2, 2, 3,3, 4,4,50, 65, 65};
 
        findElementNotDouble(a);
	}

}
