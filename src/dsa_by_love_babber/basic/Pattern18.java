package dsa_by_love_babber.basic;

public class Pattern18 {
	
	static void printPattern(int n)
	{
		//* * * * 
		//* * *
		//* *
 		//*
         int i = 1;
         while(i<=n)
         {
        	 int j=1;
        	 
        	 while(j<=n-i+1)
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
