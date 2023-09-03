package array;

public class LeftMinAndRightMax {
	
	static int getElementInsortedOrder(int [] ar){
		
		int left = 0;
		int right= ar.length-1;
		int no=0;
		for (int i = 1 ;i< ar.length;i++)	
		{
			while (i<=right&&left<=i)
			{
			if(ar[i]<ar[right]&&ar[i]>ar[left])
			  {	
				no = ar[i];
				left ++; 
				right--;
				
			  }
		 
			 else {
				
				break;
				 
			}
				
		  }
		}		
		return no;
		
	}

	public static void main(String[] args) {
	
     int a [] = {4, 3, 2, 7, 8, 9};
     int b [] = {11, 9, 12};
     int c [] = {4, 2, 5, 7};
     
     
     System.out.println(getElementInsortedOrder(a));
     System.out.println(getElementInsortedOrder(b));
     System.out.println(getElementInsortedOrder(c));
	}

}
