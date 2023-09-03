package dsa_by_love_babber.basic;

public class checkPrimeNumber {
	
	static void isPrime(int n)
	{
		//all number before the given number check
		// mode is o then not prime
		//mode is != 0 then prime
		
		int i =2;
	    boolean flag = true;
		
		while(i<n)
		{
			if(n%i==0) {
				System.out.println(n+" is not prime");
				flag=false;
				break;
			}				
		
			i++;
		}
		
		if(flag==true)
		{
			System.out.println(n+" is  prime");
		}

	}

	public static void main(String[] args) {
		
		
		isPrime(11);
		isPrime(4);
		isPrime(2);
		

	}

}
