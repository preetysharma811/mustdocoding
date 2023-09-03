package dsa_by_love_babber.recursion;

public class Factorial {
	//recursion tree
	//fact(5)->5*fact(4)-->4*fact(3)-->3*fact(2)-->2*fact(1)
	//            120  <---- 5*24    <---  4*6  <---  3*2 <-- 2*1
	//complexity:o(n)
	
	static int factorial(int n)
	{
		//base condition
		if(n==0)
		{
			return 1;
		}
		
		return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		
		int n=5;
		
		System.out.printf("Factorial '%s' thru recursion is %s",n, factorial(n));
		
	}

}
