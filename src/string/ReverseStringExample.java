package string;

public class ReverseStringExample {
	static String reverseString1(String str) {
		String reverse ="";
		for (int i = str.length()-1;i>=0;i--)
		{
			reverse= reverse + str.charAt(i);
			
		}
		return reverse;
      
	}
	
	static String reverseString2(String str) {
		String reverse ="";
		for (int i = 0;i<str.length();i++)
		{
			reverse= reverse + str.charAt(str.length()-1-i);
			
		}
		return reverse;
      
	}
	
	static String reverseWordInSentence(String str)
	{
		String reverse = "";
        String s[] = str.split("\\s");
     for(int i =0;i<s.length;i++)
     {
    	 reverse = reverse + " " +s[s.length-1-i];
     }
		return reverse;
		
	}
	
	public static void main(String[] args) {
	String s = "preety";
	String sentence="Hello I am preety super girl";
	System.out.println("original: "+s);

	System.out.println("reversed1 string: "+ReverseStringExample.reverseString1(s));
	System.out.println("reversed2 String: "+ReverseStringExample.reverseString2(s));
	
	System.out.println("reversed2 word in sentence: "+
	ReverseStringExample.reverseWordInSentence(sentence));
	}

}
