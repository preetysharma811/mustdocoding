package dsa_by_love_babber.basic;

public class Pattern13 {
	
	static void printPattern(int n)
	{
		//A B C
		//B C D
		//C D E
		
         int i = 1;
         int val='A';
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print((char) (val+i+j-2));
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
