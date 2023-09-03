package dsa_by_love_babber.basic;

public class ConvertBinaryToDecimal {
	
	
	//binary  = 100
	// decimal = 100
	//steps
	//1. modulos 
	//Note - number greater than 32 bits range, gives same MAX_Integer like 100000 or 991000 will give same 2147483647
	// int range [-2 pow 31 to ,2 pow 31 -1]
	
	static int convertBinaryToDecimalForPositive(int n) {
		
		int i =0;
		int ans=0;
		while(n>0)
		{
			int digit=n%10;
			
			if(digit==1)
			{
				ans+=Math.pow(2, i);
			}
		
			n=n/10;
			i++;
			
		}
		return ans;

	}
	
	public static void main(String[] args) {
		
		System.out.println(convertBinaryToDecimalForPositive(100));
		System.out.println(convertBinaryToDecimalForPositive(101));
		
	
				

	}

}
