package dsa_by_love_babber.basic;

public class Pattern11 {
	
	static void printPattern(int n)
	{
		//A B C
		//A B C
		//A B C
		
         int i = 1;
         int val='A';
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print((char) (val +j-1));
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
