package dsa_by_love_babber.basic;

public class FibonacciSeries {
	
	static void fib(int n)
	{
		// 0,1,1,2,3,5,8,13...
 		//      
         int a = 0;
         int b=1;
         System.out.print(a+",");
         System.out.print(b+",");
         
            
         for(int i = 1; i<=n-2;i++)
           {
        	int sum=a+b;
        	 System.out.print(sum+",");
        
        	 a=b;
        	 b=sum;
        	 
        	 }
        	 
        
	}

	public static void main(String[] args) {
		
		
		fib(8);
		

	}

}
