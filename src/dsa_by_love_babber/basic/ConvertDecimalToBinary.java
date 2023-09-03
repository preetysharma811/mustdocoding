package dsa_by_love_babber.basic;

public class ConvertDecimalToBinary {
	
	
	// decimal = 4
	//binary  = 100
	//steps
	//1. binary AND with 1 returns bit 
	//2. right shift number by 1
	// then reverse the bits with ans=10 pow i * bit + ans
	//Note - number greater than 32 bits range, gives same MAX_Integer like 100000 or 991000 will give same 2147483647
	// int range [-2 pow 31 to ,2 pow 31 -1]
	static int convertDecimalToBinaaryForPositive(int n)
	{	
		int temp =n; 
		int ans=0;
		int i =0;
		
		//positive number		
		while(n!=0)
		{
			int bit = n&1;    //and with 1 will return bit 1 or 0  

			ans= (int) (ans+ Math.pow(10, i)*bit);   //reverse the bit 
		 
			n=n>>1;           // right shift to drop the last bit 
			i++;
		  }
		System.out.println("\nbinary rep of descimal: "+temp+" for positive is:" + ans);
		return ans;
		
		
	    }	
	
	static int convertDecimalToBinaaryForNegative(int n)
	{
		int ans=0;
		int i =0;
		 n = -n;
         while (n!=0)   
        {
        int bit = n & 1;
        ans = (int) ((bit*Math.pow(10,i)) + ans);
        n = n >> 1;
        i = i + 1;
    } 
         
         System.out.println(ans);
    
    ans = ~ans;
    ans = ans + 1;
    //ans = -ans;	
    System.out.println(ans);
    
    return ans;
	}
	
	

		
	
//	private static void convertDecimalToBinaryForNegative(int i) {
//		// TODO Auto-generated method stub
//		
//	  }
//
	
		static void printArray(int a[])
		{
			for(int i =0;i<a.length;i++)
			{
			System.out.print(a[i] + ",");
			}
			System.out.print("\n");
		}

	public static void main(String[] args) {
		
	//	convertDecimalToBinaaryForPositive(5);
	//	convertDecimalToBinaaryForPositive(9999999);   //max int type ranges 2147483647
		                                               //better to store in string and array

		// positive 12 = 01100
		//negative -12 = 11100
    //   convertDecimalToBinaaryForPositive(12);		
       convertDecimalToBinaaryForNegative(-6);
		
		

	}



}
