package dsa_by_love_babber.basic;

public class ReverseDigit {
	
	static void reverse(int n)
	{
		// n =123
		// ans = (10 pow i +digit i) + ans
		//ans = 1+ 10 pow 0 =0 = 1
		//ans = 2+10pow1 +1= 21
		// ans = 3*10 pow 2 +21 =  321
		
		int reverse = 0;
       
	     while(n!=0)
		{
		int rem=n%10;
		reverse= reverse*10 +rem;
		n=n/10;
		}
        
		System.out.println("reverse="+reverse);
        
	}

	public static void main(String[] args) {
		
		reverse(123);
		

	}

}
