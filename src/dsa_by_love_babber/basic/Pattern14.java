package dsa_by_love_babber.basic;

public class Pattern14 {
	
	static void printPattern(int n)
	{
		//A 
		//B B
		//C C C
		
         int i = 1;
         int val='A';
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=i)
        	 {
        		 System.out.print((char) (val+i-1));
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
