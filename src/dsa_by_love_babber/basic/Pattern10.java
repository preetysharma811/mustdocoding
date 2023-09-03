package dsa_by_love_babber.basic;

public class Pattern10 {
	
	static void printPattern(int n)
	{
		//A A A
		//B B B
		//C C C
		//D D D
		
         int i = 1;
         int val='A';
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print((char) (val +i-1));
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
