package dsa_by_love_babber.recursion;

public class PalindromeCheck {
	
	//complexity:
	static boolean isPalindrome(String s,int start,int end)
	{
		if(start>=end) {
			return true;
		}
		
		if(s.charAt(start)!=s.charAt(end))
		{
			return false;
		}
		
		
		return isPalindrome(s,start+1,end-1);
	
	}

	public static void main(String[] args) {
		
		String s = "abcba";
		System.out.println("is palindrome: "+isPalindrome(s,0,s.length()-1));
		
		
		String r = "abcbag";
		System.out.println("is palindrome: "+isPalindrome(r,0,r.length()-1));
		
		
	

	}

}
