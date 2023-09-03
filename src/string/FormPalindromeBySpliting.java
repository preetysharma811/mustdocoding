package string;

public class FormPalindromeBySpliting {

	
	static int[][] populatePalindromeTable(String s) {
		
		int dp[][]= new int[s.length()][s.length()];
		
		
		//single char palindrome itself
	   for(int i=0;i<s.length();i++)
	   {
		
		   dp[i][i]=1;
		   
	   }
	   
	   //two char 
	   for(int i=0;i<s.length()-1;i++)
	   {
		   if(s.charAt(i)==s.charAt(i+1))
		
		    dp[i][i+1]=1;
		   
	   }
		
	   //for more than 3 char
	   for(int k=3;k<s.length();k++)
	   {
		 for(int i =0;i<s.length()-k+1;i++)
		 {
			 int j =i+k-1;
			 
			 if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1)
			 {
				 dp[i][j]=1;
			 }
		 }
		   
	   }
	return dp;
	   
		
	}
	
	static void minPartition(String s){
		int [][] dp =populatePalindromeTable(s);
		int cutArray[] = new int[s.length()];
		
		for(int i =0;i<s.length();i++)
		{
			int temp=Integer.MAX_VALUE;
			//if palindrome then set zero
			if(dp[0][i]==1)
			{
				cutArray[i]=0;
			}
			
			else {
				for(int j =0;j<i;j++)
				{
					if(dp[j+1][i]==1&&temp>cutArray[j]+1)
					{
						temp=cutArray[j]+1;
					}
				}
				
				cutArray[i]=temp;
			}
		}
		
		System.out.println(cutArray[s.length()-1]);
	}
	
	

	public static void main(String[] args) {
		String s1 = "banana";

		
		minPartition(s1);
		

		

	}

}
