package dsa_by_love_babber.recursion;

public class ReverseString {
	
	//complexity:
		static void reverse(char[] s,int start,int end)
		{
			if(start>end) {
				System.out.println(s);
				return ;
			}
			
			swap(s,start,end);
			//s=s.replace(s.charAt(start), s.charAt(end));
			
			reverse(s,start+1, end-1);
		}

		static void swap(char [] s, int i , int j)
		{
			char temp = s[i];
			s[i] = s[j];
			s[j]=temp;
		}
		
		public static void main(String[] args) {
			
			String s = "preetysharma";
			reverse(s.toCharArray(),0,s.length()-1);
			
			String r = "12345";
			reverse(r.toCharArray(),0,r.length()-1);
			
			

		

	}

}
