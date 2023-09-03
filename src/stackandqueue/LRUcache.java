package stackandqueue;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

//list recntly used


import java.util.Queue;


public class LRUcache {
    
	int capacity;
	Map<Integer, Integer> map;
	 Queue<Integer> q = new LinkedList<>();
	 {
		 
		 
	 }
	
	LRUcache(int capacity)
	{
		map= new LinkedHashMap<>();
		this.capacity=capacity;
	}
	int get(int x)
	{	
		  if(map.containsKey(x)) {
	            q.remove(x);
	            q.add(x);
	            return map.get(x);
	       }
	       return -1;
	}
	
	void set(int key, int value)
	{
		if(map.containsKey(key)) {
			q.remove(key);
            q.add(key);
            map.put(key,value);
		}
		else {
			if(map.size()==capacity)
			{
				int first=q.remove();
				map.remove(first);
			}
			 q.add(key);
	          map.put(key,value);
		}
	  }

	
	public static void main(String[] args) {
		LRUcache stack = new LRUcache(3);
		stack.set(1, 10);
		stack.set(2, 20);
		stack.set(3, 30);
	System.out.println(stack.get(1));
	stack.set(4, 40);
	System.out.println(stack.get(4));
	System.out.println(stack.get(2));
		
		
	//	System.out.println(stack.remove());
		
		
	
	}

}
