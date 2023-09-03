package string;


import java.util.HashSet;
import java.util.Set;

public class LongestDistinctCharInSubstring {

	//using two pointer method(start & end) or sliding window technique
	//complexity o(n)
	static int getIndexForDistinctCharSubstr(String text) {
		int maxLen=0;
		
		int start=0;
		int end=0;
		Set<Character> set = new HashSet<Character>();
		
		while(start<text.length()&&end<text.length())
		{
			if(!set.contains(text.charAt(end)))
			{
				set.add(text.charAt(end));
				end++;
			}
			//if duplicate identified , remove from set and move start for new window
			else {
				set.remove(text.charAt(end));
				start++;
			}
			maxLen = Math.max(end-start, maxLen);
		}
		System.out.println("non repeating substring maxLen: " +maxLen);
		return maxLen;
	
	}
	
	//naive method , taking all substring and neglect substring which has duplicates

	
	public static void main(String[] args) {
		String s1="abababcdefababcdab";
		String s2="geeksforgeeks";
		getIndexForDistinctCharSubstr(s1);
		getIndexForDistinctCharSubstr(s2);
		getIndexForDistinctCharSubstr("BBBBBB");

	}

}
