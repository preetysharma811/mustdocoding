package string;

public class FormPalindromeByRemovingChars {

	
	static void minimumRemovalToFormPalindrome(String s) {
		
		int count=0;
		
		for(int i=0;i<s.length()/2;i++)
		{
			count+=Math.abs(s.charAt(i)-s.charAt(s.length()-1-i));
		}
		
		System.out.println(count);
	}
	
	

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "aba";
		
		minimumRemovalToFormPalindrome(s1);
		minimumRemovalToFormPalindrome(s2);
		
	
		
	
	
		

	}

}
