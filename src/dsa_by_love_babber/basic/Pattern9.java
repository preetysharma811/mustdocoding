package dsa_by_love_babber.basic;

public class Pattern9 {
	
	static void printPattern(int n)
	{
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		
         int i = 1;
        int count=1;
         while(i<=n)
         {
        	 int j =1;
        	 
        	 while(j<=i)
        	 {
        		 int temp =i+1;
        		 System.out.print(count + " ");
        		 j++;
        		 count++;
        
        	 }
        	 System.out.print("\n");
        	 i++;
         }
	}

	public static void main(String[] args) {
		
		
		printPattern(4);
		

	}

}
