package dsa_by_love_babber.basic;

public class Pattern4 {
	
	static void printPattern(int n)
	{
		//4321
		//4321
		//4321
		//4321
		
         int i = 1;
      //   int count=1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=n)
        	 {
        		 System.out.print(n-j+1);
        		 j++;
        	//	 count++;
        	 }
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
		

	}

}
