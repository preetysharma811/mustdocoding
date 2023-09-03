package dsa_by_love_babber.basic;

public class DiffernceOfDigitProductAndSum {
	
	static void diff(int n)
	{
		// n=234
 		// product = 2*3*4
		//sum = 2+3+4
		//diff= product-sum
		
		int product = 1;
		int sum=0;
       
		while(n!=0)
		{
			int rem = n%10;
			product*=rem;
			sum+=rem;
			n=n/10;
		}
        
		System.out.println("diff="+(product-sum));
        
	}

	public static void main(String[] args) {
		
		diff(234);
		

	}

}
