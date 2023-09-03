package bitmanipulation;

public class SingleNumber2 {
	
	static int solve(int num, int i ,int j)
	{
		i--;
		j--;
		int res = num;
		
		//first get the bits at ith and jth position
		
		int bit1 = (num>>i)&1;
		int bit2 = (num>>j)&1;
		
		//xor the bits
		 int temp = bit1^bit2;
		 
		 res ^=temp<<i;
		 res^=temp<<j;
			
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input =9   binary = 1001 after swap between 1st and 2nd position
		//output =10 binary = 1010 
		System.out.println(solve(9,1,2));

	}

}
