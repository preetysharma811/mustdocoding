package array;

public class ReverseNumber {
	
	public int  reverseNumber(int num)
	{
		int reverseNum=0;
		while (num!=0)
		{
			int digit = num%10;
			reverseNum = reverseNum*10+digit;
			
		num/=10;
		}
		return reverseNum;
	}

	
	public static void main(String[] args) {
		int num = 1234556;
		System.out.println("original num -------------"+num);
		ReverseNumber obj = new ReverseNumber();
		System.out.println("reversed num -------------"+obj.reverseNumber(num));
		
		
	}
	
  

}
