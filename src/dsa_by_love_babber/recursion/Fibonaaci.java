package dsa_by_love_babber.recursion;

public class Fibonaaci {
	//complexity:
	
	static int fibonaaci(int n)
	{
		//base condition
		//complexity o(n)
		if(n==0) {
			return 0;
		}
		
		if(n==1)
		{
			return 1;
		}
		
		return fibonaaci(n-1)+fibonaaci(n-2);
				
	}

	public static void main(String[] args) {
		
		int n=9;
		System.out.printf("fibonacci '%s' thru recursion is %s",n, fibonaaci(n));
		
	}

}
