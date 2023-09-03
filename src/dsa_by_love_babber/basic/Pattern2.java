package dsa_by_love_babber.basic;

public class Pattern2 {
	
	static void printPattern(int n)
	{
		//1111
		//2222
		//3333
		//4444
		
         int i = 1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print(i);
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
