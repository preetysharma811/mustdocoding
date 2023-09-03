package string;


class TrieNode {
	
	 TrieNode[] children = new TrieNode[26]; 
	 
	 boolean wordEnd;
	
	 TrieNode()
	   {
		 wordEnd=false; 
		 for(int i =0 ;i<26;i++) {
		 children[i]=null;
		 }
	 }
}


public class LongestCommonPrefix {
	
	 TrieNode root ;

	//using charachter by character matching complexity c(m*n) n no of string , m is lenght of longest string
	 String longestCommonSubstringBruteMethod(String str) {
		
      String s [] = str.split("\\W");
      
      int minLenth=s[0].length();
   
      
      for(int i=0;i<s.length;i++)
      {
    	  if(s[i].length()<minLenth)
    	  {
    		  minLenth=s[i].length();
    	  }
      }
     
      String result="";
      
     for(int i=0;i<minLenth;i++)
     {
    	char current = s[0].charAt(i); 
       for(int j=1;j<s.length;j++)
       {
    	   if(current!=s[j].charAt(i)) {
    		   return result;
    	   }
       }
 		  result+=current;
     }
     return result;
	}	
	
	 
	 void inserTrie(String s)
	 {
		 TrieNode current=root;
		 
		 for(int i =0;i<s.length();i++)
		 {
			 int asciiIndex=s.charAt(i)-'a';
			 if (current.children[asciiIndex] == null) {
				 current.children[asciiIndex] = new TrieNode(); 
			 } 
			
			 current = current.children[asciiIndex]; 
			 
		 }
		 current.wordEnd = true; 
	 }
	//using Tries Tree complexity c(m*n) n no of string , m is lenght of longest string
	 void longestCommonSubstringTriesTreeMethod(String s1) {
		 root = new TrieNode(); 
		 
        String words[] = s1.split("\\W");
		 
        //insert word in trie
        for(int i =0;i<words.length;i++) {
        	System.out.print(words[i]+" ");
        	inserTrie(words[i]);
        }
		 
        System.out.println();
       System.out.println("2nd way prefix :" +walkTrie());
        
        //count childs
      
	}
	    int index;
	 int countChildren(TrieNode node) {
	  int childCount = 0; 
  
      TrieNode current =node;
      for (int i=0; i<26; i++) 
      { 
          if (current.children[i] != null) 
          { 
          	childCount++; 
          	index = i; 
          } 
      } 
     // System.out.println(childCount);
	return childCount;
	 } 
	 
	  String walkTrie() 
	    { 
	        TrieNode current = root; 
	       // int indexs = 0; 
	        String prefix = ""; 
	       
	        while (countChildren(current) == 1 && 
	        		current.wordEnd== false) 
	        { 
	        	current = current.children[index]; 
	        	System.out.println(index);
	            prefix += (char)('a' + index); 
	        } 
	        return prefix; 
	    } 
	 
	 
	void longestCommonPrefixByWordByWord(String s){
	
		String word[] = s.split("\\W");
		
		String prefix=word[0];
		
		for(int i=1;i<word.length;i++)
		{
			while(word[i].indexOf(prefix)!=0) {
    			prefix=prefix.substring(0, prefix.length()-1);
			//	System.out.println(prefix);
				
			}
		}
		System.out.println("3rd way prefix: "+prefix);
		
	}
	  
	  
	public static void main(String[] args) {
	
		String s1 = "geeksforgeeks geeks geek geezer"; //o/p - gee
		String s2 = "apple ape april";  //o/p -ap
		
		LongestCommonPrefix l = new LongestCommonPrefix();
		
//		System.out.println("1st way prefix: "+l.longestCommonSubstringBruteMethod(s1));
//		System.out.println("1st way prefix: "+l.longestCommonSubstringBruteMethod(s2));

		
//		l.longestCommonSubstringTriesTreeMethod(s1);
	l.longestCommonSubstringTriesTreeMethod(s2);
		
	//	l.longestCommonPrefixByWordByWord(s1);
	//	l.longestCommonPrefixByWordByWord(s2);

	}

}

