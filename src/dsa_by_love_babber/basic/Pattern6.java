package dsa_by_love_babber.basic;

public class Pattern6 {
	
	static void printPattern(int n)
	{
		//1
		//22
		//333
		//4444
		
         int i = 1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=i)
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
