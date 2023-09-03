package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Vector;



public class VerticalTraversalOfBinaryTree {
	
//First way to print bottom with tree shorted and distinct key with latest value
	
	  static void veriticalTraversal(Node1 root)
	  {
		  TreeMap<Integer, Vector<Integer>> map = new TreeMap<Integer, Vector<Integer>>();
		  Queue<Node1> q = new LinkedList<Node1>();
		
		  
		  if(root ==null) {
			  return;
		  }
		 
		  root.height=0;
		  q.add(root);
		  
		  
		  
	      while(!q.isEmpty())
	        {
	    	  Node1 temp = q.poll();
	            int h = temp.height;
	            Vector<Integer> valueList= map.get(h);
			  
			  if(valueList==null)
			  {
				  valueList = new Vector<Integer>();
				  valueList.add(temp.data);
			  }
			  
			  else {
				  
				  valueList.add(temp.data);
				  
			      }
			 
			  map.put(h, valueList);
	    	  
			  
	            if(temp.left != null)
	            {
	            	temp.left.height=h-1;
	                q.add(temp.left);	               
	            }
	            if(temp.right != null)
	            {
	            	temp.right.height=h+1;
	                q.add(temp.right);     
	               
	            }
	            
	        }
	      
	      for(Entry<Integer, Vector<Integer>> entry : map.entrySet()) 
	        {
	            
	    	  Vector<Integer> nlist = entry.getValue();
	    	  for(int i : nlist)
	    	  {
	    		  System.out.print(i);
		            System.out.print(",");
	    	  }
	          
	        }
	      
	  }

	  
	  
	public static void main(String[] args) {

   Node1 root = new Node1(1);
	root.left = new Node1(2);
	root.right = new Node1(3);
	root.left.left = new Node1(4);
	root.left.right = new Node1(5);
	root.left.right.left = new Node1(6);
	root.left.right.right = new Node1(7);
	root.right.right = new Node1(8);
	root.right.left = new Node1(9);

	System.out.println("First way");
	veriticalTraversal(root);
	
	
	 /* following is the tree after above statement

      1
    /   \
   2       3
 /   \    /  \
4     5  9     8
    /   \
   6     7 
*/
   }
}
