package dsa_by_love_babber.recursion;

public class Counting {
	
	//complexity o(n)
	static void printAscending(int n)
	{
		//base condition
		if(n==0) {
			return;
		}
		
		printAscending(n-1);
		System.out.print(n + " ");
		
	}
	
	static void printDescending(int n)
	{
		//base condition
		if(n==0) {
			return;
		}
		
		System.out.print(n + " ");
	
		printDescending(n-1);
		
	}

	public static void main(String[] args) {
		
		int n=7;
		

		 printAscending(n);
		 System.out.println();
		 printDescending(n);
			
		

	}

}
