package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;



public class LevelTraversalOfBinaryTree {
	
//Level Order or Breadth first Search or Traversal
	
	  static void levelOrderTraversal(Node root)
	  {
	
		  Queue<Node> q = new LinkedList<Node>();
		  q.add(root);
		  q.add(null);
	 
	      
	      while(!q.isEmpty())
	        {
	    	  
	    	  if(q.peek()==null) {
	    		  q.poll();
	    		  if(!q.isEmpty()){
	    		  q.add(null);
	    		  System.out.println();
	    		  }
	    		  
	    	  }
	    	  else {
	    	  Node temp = q.poll();   	 
	    	 	  
	    	  System.out.print(temp.data);
	    	  System.out.print(",");
	          
	            if(temp.left != null)
	            {
	            	
	                q.add(temp.left);
	   
	               
	            }
	            if(temp.right != null)
	            {
	            	
	                q.add(temp.right);
	            
	            }
	    	  } 
	    	  
	    	
	        }
	      
      
	  }

	  
	  
	public static void main(String[] args) {

   Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.left.right.left = new Node(6);
	root.left.right.right = new Node(7);
	root.right.right = new Node(8);
	root.right.left = new Node(9);

	System.out.println("BFS or level order traversal");
	levelOrderTraversal(root);
	
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
