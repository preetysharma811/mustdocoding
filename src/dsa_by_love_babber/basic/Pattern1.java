package dsa_by_love_babber.basic;

public class Pattern1 {
	
	static void printPattern(int n)
	{
		//***
		//***
		//***
		
         int i = 1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print("*");
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
