package string;

import java.util.Arrays;

public class LongestCommonSubsequence {
	//int count=0;
	
	//using recursion and top down approach , tree construct down and then result return at up 
	// has overlapping problem
	
	//o(2^n)
	static int lcs(int i, int j,String s1,String s2)
	{
		
		if(i==s1.length()||j==s2.length())
		{
			return 0;
		}
		
		if(s1.charAt(i)==s2.charAt(j))
		{
			return 1+lcs(i+1,j+1,s1,s2);
			
		}
		else {
			
			return Math.max(lcs(i+1,j,s1,s2),lcs(i,j+1,s1,s2));
		}
		
	}
	
	
	//using memorization table to store result of recursion , bottom up apparoach to fill table 
	//but recursion method call is top down 
	//o(m*N)
	
	static int lcsMemorization(int i , int j, String s1,String s2) {
	        int maxLen;
	        int  [][] table=new int[s1.length()][s2.length()];
	        
		if(i==s1.length()||j==s2.length())
		{
	
			return 0;
		}
		
		 if(table[i][j] != 0)
	        {
	            return table[i][j];
	        }
		
		 else if(s1.charAt(i)==s2.charAt(j))
		{
			 maxLen = 1+lcs(i+1,j+1,s1,s2);
			
		}
		else {
			maxLen = Math.max(lcs(i+1,j,s1,s2),lcs(i,j+1,s1,s2));;
           table[i][j] = maxLen; 
		}
		
		return maxLen; 
	}

	
	//dynamic programing follows bottom up approach
	//o(n*m) small str in as rows and big one as columns

	static void longestCommonSubsequenceUsingDP(String s1, String s2) {
		int n1=s1.length();
		int n2=s2.length();
		String res="";

		int table [][] = new int[n1+1][n2+1];
		
		for(int i =0;i<=n1;i++)
		{
			for(int j =0;j<=n2;j++) {
				
				if (i == 0 || j == 0) {

					table[i][i] = 0;

				}
				else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					

					table[i][j] = 1 + table[i - 1][j - 1];
					//res=res+s1.charAt(i-1)+s2.charAt(j-1);

				}

				else  {
					table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
				}
		   }
		
		}
		
		System.out.println("LCS using Dynamic programing: "+table[n1][n2]   );
		

	}
	

	


	public static void main(String[] args) {
	
		String s1 = "GXTXAYB"; //AAB
		String s2 = "AGGTAB";  //aabbaa
		
		String s3 = "bbacbcabbcba"; //
		String s4 = "abcbbacbca";  //AAB

		
		// o(n*m) time complexity with  dynamic progrming
		longestCommonSubsequenceUsingDP(s2,s1);
	  	System.out.println("LCS using recursion: "+lcs(0,0,s1,s2));
		System.out.println("LCS using memorization: "+lcsMemorization(0,0,s1,s2));
		System.out.println("LCS using recursion: "+lcs(0,0,s3,s4));
		System.out.println("LCS using memorization: "+lcsMemorization(0,0,s3,s4));
		longestCommonSubsequenceUsingDP(s4,s3);
		

	}

}
