package dsa_by_love_babber.basic;

public class Pattern17 {
	
	static void printPattern(int n)
	{
		//D 
		//C D
		//B C D 
		//A B C D
         int i = 1;
         int val='A';
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=i)
        	 {	
        		 System.out.print((char) (val+n-i+j-1));
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
