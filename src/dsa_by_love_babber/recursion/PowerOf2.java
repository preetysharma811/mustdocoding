package dsa_by_love_babber.recursion;

public class PowerOf2 {
	
	//complexity o(n)
	static int powerOf(int n)
	{
		if(n==0) {
			return 1;
		}
		
		return 2*powerOf(n-1);	
	}

	public static void main(String[] args) {
		
		//2Pow(3)
		System.out.println("powerOf using recursion:" + powerOf(3));
		

	}

}
