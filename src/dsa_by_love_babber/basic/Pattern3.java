package dsa_by_love_babber.basic;

public class Pattern3 {
	
	static void printPattern(int n)
	{
		//1234
		//1234
		//1234
		//1234
		
         int i = 1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print(j);
        		 j++;
        	 }
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
		

	}

}
