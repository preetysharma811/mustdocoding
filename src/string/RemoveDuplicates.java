package string;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	static void removeDuplicatesIstWay(String s) {
		boolean[] count = new boolean[256];
		for(int i =0 ; i<s.length();i++)
		{
			int index=s.charAt(i);
			if(!count[index]) {
				System.out.print((char)index+",");
			}
			count[index]=true;
		}
		
	}
	
	static void removeDuplicatesWithLinkedhashMap(String s)
	{
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		
		for(int i =0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		Iterator<Character> it =hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		
	}
	

	public static void main(String[] args) {
		String s1 = "abaacdde";
		removeDuplicatesIstWay(s1);
		System.out.println();
		removeDuplicatesWithLinkedhashMap(s1);
	
	}

}
