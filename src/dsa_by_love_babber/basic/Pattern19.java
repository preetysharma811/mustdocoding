package dsa_by_love_babber.basic;

public class Pattern19 {
	
	static void printPattern(int n)
	{
		//* * * *
		//  * * *
		//    * *
 		//      *
         int i = 1;
         while(i<=n)
         {
        	 int space=1;
        	 int star = n-i+1;
        	 
        	 while(i-space>0)
        	 {	
        		 System.out.print(" ");
        		 space++; 
        	 }
        	 
        	 while(star>0)
        	 {	
        		 System.out.print("*");
        		 star--; 
        	 }
        	 
        	 
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
		

	}

}
