package string;

import java.util.Arrays;

public class LongestPalindromeSubString {
	//int count=0;
	//dynamic programing

	static void longestPalindromeWithDyanmicPrograming(String s) {
		int len=s.length();
		int maxLengthStr=1;

		
		//create 2d array to store result of sub problem

		int dp [][] = new int[len][len];
		
		//store 1 len string is palindrom itself
		for(int i =0;i<len;i++)
		{
			dp[i][i]=1;
		}
		int startPos=0;
		
		//store 2 len string palindrome result
		for(int i = 0;i<len-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1)) {
				dp[i][i+1]=1;
				maxLengthStr=2;
				startPos=i;
			}

		}
		
		//check result for 3+ length
		
		for(int i = 3;i<len;i++)
		{
			for(int start=0;start<=len-i;start++)
			{
				int end=start+i-1;
				if(s.charAt(start)==s.charAt(end)&&dp[start+1][end-1]==1) {
					dp[start][end]=1;

                    if (i > maxLengthStr) { 
                    	startPos = start; 
                        maxLengthStr=i;                    } 
				}
			}
		
		}
		
		 System.out.print("Longest palindrome substring is in o(n2) time: "); 
		// System.out.print("Longest palindrome substring is; "+startPos +":"+(maxLengthStr+startPos)); 
		 String subStrPaline = s.substring(startPos, startPos+maxLengthStr);
		 System.out.println(subStrPaline);
	       
	}
	
	
	static String formatString(String s)
	{
		String updated="$";
		for(int i =0;i<s.length();i++)
		{
		updated= updated+s.charAt(i)+"$";
			
		}
		
	//	System.out.println(updated);
		return updated;
		
	}
	
	static void longestPalindromeWithMancherAlgo(String s)
	{
		String str = formatString(s);
	
		int mid = 0;
		int rightBoundary = 0;
		int ar[]= new int[str.length()];
		Arrays.fill(ar, 0);
		
		for(int i = 0;i<str.length();i++)
		{
			int mirrorIndex = 2*mid-i;
			
			
			//if i within right boundary then copy min of mirrorIndex value and rightBoundar -i 
			if(i<rightBoundary)
			{
				ar[i]=Math.min(ar[mirrorIndex], rightBoundary-i);
			}
			
			//expand the value 
			int left = i-(ar[i]+1);
			int right = i+(ar[i]+1);
		
		while(left>=0&&right<str.length()) {
			if(str.charAt(left)==str.charAt(right)) {
		        ar[i]++;
				right++;
	             left--;
			}
			else 
				break;
		}
		
		if(i+ar[i]>rightBoundary)
		{
			mid=i;
			rightBoundary=i+ar[i];
			
		  
		 }	
		}	
		
	 int max = 0 ;
	   int index=0;
	 
	 for(int i =0;i<ar.length;i++)
	 {
		 
			if( max<ar[i]) {
				max=ar[i];
				index=i;	
			}
			
			
			// System.out.println(index);
			
	 }
//	 
//	 System.out.println(max);
//     System.out.println(index);
     int start=index-max;
     int end=index+max;
     
     String res =str.substring(start, end).replace("$", "");  
     System.out.println("longest palindrome with o(n) time: "+res);
	}


	public static void main(String[] args) {
		String s1 = "aaaabbaa";  //aabbaa
		String s2 = "aabca"; //aa
		String s3 = "abacabacabb";    //bacabacab
		String s4 = "abababa";
		
		// o(n2) time complexity with  dynamic progrming
		longestPalindromeWithDyanmicPrograming(s1);
		longestPalindromeWithDyanmicPrograming(s2);
		longestPalindromeWithDyanmicPrograming(s3);
		
		// o(n) time complexity with manacher algorithm
		longestPalindromeWithMancherAlgo(s1);
		longestPalindromeWithMancherAlgo(s4);
		

	}

}
