package string;

public class LongestPalindromeSubsequence {

	//using dyanmic programing o(n2)

	static void longestPalindrome(String s) {
		int len=s.length();
		String res="";
		
		
		int matrix [][] = new int[len][len];
		
		for(int i=0; i < len; i++){
			matrix[i][i] = 1;
        }
	
		
		for(int k =2;k<=len;k++)
		{
			for(int i =0;i<len-k+1;i++)
			{
				 int j = i + k - 1;
				if(s.charAt(i)==s.charAt(j))
				{
					matrix[i][j] = matrix[i+1][j-1]+2;
					
				}
				
				
				else{
					matrix[i][j] = Math.max(matrix[i + 1][j], matrix[i][j - 1]);
				
                }
			
			}
		}
		
			
		 System.out.println("max length of plaindrome is= "+matrix[0][s.length()-1]);
//    
//		 int n =s.length()-1;
//		 while(n>0&&matrix[0][n]!=1)
//		 {
//			 System.out.print(s.charAt(n)+",");
//			 n--;
//		 }
//
//	
	}
	


	public static void main(String[] args) {
		String s1 = "abcdc";
		//cdc
		String s2 = "LPASPAL";
		//PASPA
		longestPalindrome(s1);
		longestPalindrome(s2);

	}

}
