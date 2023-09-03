package dsa_by_love_babber.basic;

public class Pattern5 {
	
	static void printPattern(int n)
	{
		//1  2  3  4  5
		//6  7  8  9  10
		//11 12 13 14 15
		//16 17 18 19 20
		//21 22 23 24 25
		
         int i = 1;
         int count=1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print(count + "  ");
        		 j++;
        		 count++;
        	 }
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
		

	}

}
