package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SearchBox {
	static // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	List<String> retrieveMostFrequentlyUsedWords(String helpText, List<String> wordsToExclude) {
		HashSet<String> set = new HashSet<String>();
		HashSet<String> words = new HashSet<String>();
		ArrayList<String> result = new ArrayList<String>();
		for (String excluded : wordsToExclude) {
			set.add(excluded.toLowerCase());
		}
		HashMap<String, Integer> map = new HashMap<>();
		int count = 0;
		int maxcount = 0;
	    String str="";
	    int sCount=0;
		//System.out.println(helpText.replaceAll("[^a-zA-Z' ]",""));
		for (String temp : helpText.replaceAll("[^a-zA-Z' ]","").toLowerCase().split(" ")) {
			temp = temp.trim();
			String s="";
			if(temp.contains("'"))
			{
			//	System.out.println(temp);
				s=temp.split("'")[0];
				str="s";
				sCount++;
				
			}
			else {
				s =temp;
			}
		
			//System.out.println(s);
			if ((s.length() == 0 && !s.equals(" ") && !s.equals("") )|| set.contains(s)) {
				continue;
			}
			map.put(s, map.getOrDefault(s, 0) + 1);

			if (count <= map.get(s)) {
				count = map.get(s);
			}
			if(maxcount<count) {
				maxcount=count;
			}

		}
	
		
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() >= maxcount || Math.abs(e.getValue() - maxcount) == 1 && e.getValue() != 1) {
				result.add(e.getKey());
			}
			
		
		}
		if(sCount>=maxcount||Math.abs(sCount-=maxcount)==1&&sCount!=1) 
		{
			result.add("s");	
		}
		
	//	result.addAll(words);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favourite food ";
		List<String> l = new ArrayList<String>();
		l.add("and");
		l.add("he");
		l.add("the");
		l.add("to");
		l.add("is");
		
		String s1 = "Rose is a flower red rose are flower";
		List<String> l1 = new ArrayList<String>();
		l1.add("is");
		l1.add("are");
		l1.add("a");

		System.out.println(retrieveMostFrequentlyUsedWords(s, l));
		System.out.println(retrieveMostFrequentlyUsedWords(s1, l1));

	}

}
