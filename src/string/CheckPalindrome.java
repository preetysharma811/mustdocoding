package string;

public class CheckPalindrome {
	//int count=0;
	
	static void isPalindrome(String s) {
		int i=0;
		s=s.toLowerCase().replaceAll("\\s", "");
		char[] ch = s.toCharArray();
		boolean status =true;
		while(i!=s.length())
		{
			if(ch[i]!=ch[s.length()-1-i])
			{
				status=false;
				break;
			}
			
			i++;
		}
		
		if(status==true)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
			
		
	}
	
	

	public static void main(String[] args) {
		String s1 = "nitin";
		String s2 = "nitinn";
		isPalindrome(s1);
		isPalindrome(s2);

	}

}
