package dsa_by_love_babber.basic;

public class Pattern16 {
	
	static void printPattern(int n)
	{
		//        * 
		//     *  *
		//   * *  *
		// * * *  *
         int i = 1;
         while(i<=n)
         {
        	 int space =n-i;
        	 int star=1;
        	 
        	 while(space>=1)
        	 {	
        		 System.out.print(" ");
        		 space--; 
        	 }
        	 while(star<=i)
        	 {	
        		 System.out.print("*");
        		 star++; 
        	 }
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
		

	}

}
