package string;


public class LongestCommonSubString {
	
	static void longestCommonSubstring(String s1, String s2) {

		String res="";
		int maxlen=0;
		int table [][] = new int[s1.length()][s2.length()];
		
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j))
				{
					
					if(i==0||j==0) {
						table [i][j]=1;
					}
					
					else {
					table [i][j]=table [i-1][j-1]+1;
					}
					
					if(table [i][j]>maxlen)
					{
						maxlen=table [i][j];
						res=s1.substring(i-maxlen+1, i+1);
					}
					else if(table [i][j]==maxlen)
					{
						maxlen=table [i][j];
						res=res+","+s1.substring(i-maxlen+1, i+1);
					}
					
					
				}
				
				else {
					table [i][j]=0;
				}
			}
		
	    }
		
		System.out.println("Longest SubString using dyanmic programing: "+maxlen);
		System.out.println("substring: "+res);

	}
	public static void main(String[] args) {
	
		String s1 = "aabca"; //aab
		String s2 = "acaaabbaca";  //aab
		
		String s3 = "LCLC"; //aab,ca,aa
		String s4 = "CLCL";  //aab,ca,aa
		
		longestCommonSubstring(s1,s2);
		longestCommonSubstring(s3,s4);
		
		

	}

}
