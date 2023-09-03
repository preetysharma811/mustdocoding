package string;


public class PatternMatchingKMPAlgo {


	static int[] buildFailedStartTable(String pattern) {
		int len=pattern.length();
		
		int startTableForFailure [] = new int[len];
		
		int i=0;
		for(int j =1;j<len;)
		{
		
			if(pattern.charAt(i)==pattern.charAt(j))
			{
				startTableForFailure[j]=i+1;
				i++;
                j++;
			}
			else {
				
				if(i!= 0){
					i=startTableForFailure[i-1];
					
				}
				
				else {
					startTableForFailure[j] =0;
	                    j++;
				}
			}
		}
		
		return startTableForFailure;	
	}
	
//KMP with o(n+m) , as reduce useless comparison by maintaining start table on failed comparison
	static void patternSearchUsingKMP(String text, String pattern) {
		
		int longestPrefixSufficsTable[]=buildFailedStartTable(pattern);
		
		int i =0;
		int j = 0;
		
		while(i<text.length()&&j<pattern.length())
		{
			
			
			 if(text.charAt(i) == pattern.charAt(j)){
	                i++;
	                j++;
	            }
			 
			
			 else {
				 
				 if(j!=0)
				 {
					 j=longestPrefixSufficsTable[j-1];
				 }
				 
				 else {
					 i++;
				 }
			 }
			
		}	
		
		 if (j == pattern.length()) { 
             System.out.println("Found pattern "
                                + "at index " + (i - j)); 
            // j = longestPrefixSufficsTable[j - 1]; 
		 }
		
	}
	
	//based on rolling hash function to calculate hascode for pattern
	//complexity o(m+n)
	static void patternMatchingUsingRabinKarbAlgo(String text, String pattern, int base) {

		int pattLen = pattern.length();
		int textLen = text.length();
		int patternHashCode = createHash(pattern, pattLen - 1,base);
//
//		System.out.println();
//		System.out.println(patternHashCode);

		int textHashCode = createHash(text, pattLen - 1,base);
//
//		System.out.println();
//		System.out.println(textHashCode);

		for (int i = 1; i <= textLen - pattLen + 1; i++) {
			
			int textStart = i - 1;
			int textEnd = i + pattLen - 2;
			int pattStart = 0;
            int pattEnd = pattLen - 1;
			
			
			// hascode followed by String
			if (patternHashCode == textHashCode) {
				
				System.out.println("matched at i:" + (i-1));
				System.out.print("text:");

				if (textEnd - textStart == pattEnd - pattStart) {

					while (textStart <= textEnd && pattStart <= pattEnd) {

						if (text.charAt(textStart) == pattern.charAt(pattStart)) {
							
							System.out.print(text.charAt(textStart));
							textStart++;
							pattStart++;
							
						}

					}
					


				}

			}
// id not parsed the whole text then, the recalculate hashcode
			if (i < textLen - pattLen + 1) {
				int newHash = textHashCode - text.charAt(i - 1);
				newHash = newHash / base;
				newHash += text.charAt(i + pattLen - 1) * Math.pow(base, pattLen - 1);
				textHashCode = newHash;
			}
		}

	}

	// base could be prime or total 26 letter
	//static int base = 10;

	// int base =101;
	private static int createHash(String pattern, int patternLen, int base) {
		int hash = 0;
		for (int i = 0; i <= patternLen; i++) {
			hash += pattern.charAt(i) * Math.pow(base, i);
//			System.out.print(pattern.charAt(i) + ",");
		}
		return hash;
	}
	

	public static void main(String[] args) {
		String text = "abcxabcdabcdabcy";  //aabbaa
		String pattern = "abcdabcy"; //aa
		
		String text1 = "aaaaaaaaaabbaaaaaaaaaaaaaabaaaa";  //aabbaa
		String pattern1 = "aba"; //aa
		
		// KMP complexity 0(n)		
		patternSearchUsingKMP(text,pattern);
		patternSearchUsingKMP(text1,pattern1);
		System.out.println();
		
		//rabin karb algo with rolling hash complexity o(n)
		System.out.println("pattern:" + pattern);
		patternMatchingUsingRabinKarbAlgo(text,pattern, 11);

		System.out.println();
		System.out.println("pattern:" + pattern1);
		patternMatchingUsingRabinKarbAlgo(text1,pattern1,101);
		

	}

}
