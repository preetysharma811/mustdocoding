package array;

public class FibonacciRecurion {
	
	static int fibSer(int n )
	{
	if (n==1)
	return 1;
	else 
	return fibSer(n-1)+n;
	}
	

	public static void main(String[] args) {
		
	int a = 4;
	System.out.println(fibSer(a));

	}

}
