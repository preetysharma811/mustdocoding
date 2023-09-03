package dsa_by_love_babber.basic;

public class Pattern8 {
	
	static void printPattern(int n)
	{
		//1
		//2 1
		//3 2 1
		//4 3 2 1
		
         int i = 1;
        // int count=1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=i)
        	 {
        		 System.out.print(i-j+1 + " ");
        		 j++;
        		// count++;
        
        	 }
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
	}
	
}