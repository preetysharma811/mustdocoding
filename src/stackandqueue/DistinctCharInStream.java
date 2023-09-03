package stackandqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//use count array and queue 
//complexity o(n)

public class DistinctCharInStream {
	Queue<Character> q = new LinkedList<Character>();
  	int countDictionary [] = new int[26];
  	static int index=0;
    void checkDuplicateInStream(StringBuffer sb) {
    		
    		countDictionary[sb.charAt(index-1)-'a']++;
    		q.add(sb.charAt(index-1));
    	while(!q.isEmpty())	{
    		char front=q.peek();
    		if(countDictionary[front-'a']>1)
    		{
    		 q.poll();
    		}
    			else {
    				System.out.println(front+",");
        		break;
    			}
        		
    		}
    		if(q.isEmpty()) {
    			System.out.println("-1");
    		}
 		
    	}
    	
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		DistinctCharInStream dc = new DistinctCharInStream();
		StringBuffer sb = new StringBuffer();
		
		while(sc.hasNext()) {
           sb.append(sc.next());
           index++;
           dc.checkDuplicateInStream(sb);
		}
		 sc.close();

    }
	}