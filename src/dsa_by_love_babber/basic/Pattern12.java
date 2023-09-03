package dsa_by_love_babber.basic;

public class Pattern12 {
	
	static void printPattern(int n)
	{
		//A B C
		//D E F
		//G H I
		
         int i = 1;
         int val='A';
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print((char) (val));
        		 j++;  
        		 val++;
        	 }
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
		

	}

}
