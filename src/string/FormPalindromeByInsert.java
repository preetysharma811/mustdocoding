package string;

public class FormPalindromeByInsert {

	
	static int minimumInsertToFormPalindrome(String s, int start, int end) {
		
		if (start > end) return Integer.MAX_VALUE;
		
		if(start==end)
		{
			return 0;
		}
		
		//only two element left
		if(start==end-1)
		{
	
			return s.charAt(start)==s.charAt(end)?0:1;
		}
		
	 
	 return s.charAt(start)==s.charAt(end)? minimumInsertToFormPalindrome(s,start+1,end-1):
		 Math.min(minimumInsertToFormPalindrome(s,start+1,end),minimumInsertToFormPalindrome(s,start,end-1))+1;
		
	}
	
	
	static int usingDyanmicProgramingTopDown(String str)
	{
		int n = str.length();
		if( n == 0 ) {
			return 0;
		}
		int table [][] = new  int[n][n];
		int i,j;
		for( i = n-1; i >= 0; i-- )
		{
			for( j = i+1; j < n; j++ )
			{
				if( str.charAt(i) == str.charAt(j)) 
				{
					if( j-i > 1 )
						table[i][j] = table[i+1][j-1];
				}
				else
				{
					table[i][j] = 1;
					if( j-i > 1 ) 
						table[i][j] = Math.min(table[i][j-1], table[i+1][j])+1;
				}
			}
		}
		return table[0][n-1];
		
	}
	
	


	public static void main(String[] args) {
		String s1 = "geeks";
		String s2="abcd";
		String s3="aba";
		
		System.out.println("min char insert to form palindrome="+minimumInsertToFormPalindrome(s1,0,s1.length()-1));

		System.out.println("min char insert to form palindrome="+minimumInsertToFormPalindrome(s2,0,s2.length()-1));

		System.out.println("min char insert to form palindrome="+minimumInsertToFormPalindrome(s3,0,s3.length()-1));
		System.out.println("min using dp="+usingDyanmicProgramingTopDown(s1));
		System.out.println("min using dp="+usingDyanmicProgramingTopDown(s2));
		System.out.println("min using dp="+usingDyanmicProgramingTopDown(s3));
	
		

	}

}
