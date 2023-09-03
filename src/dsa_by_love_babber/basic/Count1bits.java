package dsa_by_love_babber.basic;

public class Count1bits {
	
	static void count(int n)
	{
		// n=11
 		//  binary = 000000....1011
		// 1 bit count =3
		
		int count = 0;
       
		for(int i = 0;i<32;i++)
		{
		// and with 1 & 1 =1
			if((n&1)==1)
			{
				count++;
			}
			n=n>>1;
		}
        
		System.out.println("1 bit count="+count);
        
	}

	public static void main(String[] args) {
		
		count(11);
		

	}

}
