package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;



public class TopViewOfBinaryTree {
	
//First way to print bottom with tree shorted and distinct key with latest value
	
	  static void topViewFisrtWay(Node1 root)
	  {
		  TreeMap<Integer, Node1> map = new TreeMap<>();
		  Queue<Node1> q = new LinkedList<Node1>();
		  q.add(root);
	      map.put(0,root);
	      
	      while(!q.isEmpty())
	        {
	    	  Node1 temp = q.poll();
	            int h = temp.height;
	            
	            if(map.containsKey(h)==false) {
	            	  map.put(h,temp);
	            	
	            }
	          
	            if(temp.left != null)
	            {
	            	temp.left.height=h-1;
	                q.add(temp.left);
	               // map.put(h-1,temp.left);
	               
	            }
	            if(temp.right != null)
	            {
	            	temp.right.height=h+1;
	                q.add(temp.right);
	               // map.put(h+1,temp.right);
	               
	            }
	            
	        }
	      
	      for(Entry<Integer, Node1> entry : map.entrySet()) 
	        {
	            
	            Node1 n = entry.getValue();
	            System.out.print(n.data);
	            System.out.print(" ");
	        }
	      
	  }
//First 2nd way to print bottom	 with hashMap and level order traversal (greater one level)
	  static Map<Integer, HashMap<Integer, Node1>> topMap = new HashMap<Integer,HashMap<Integer, Node1>>();
	  
	  static void topView2ndWay(Node1 root)
	  {
		  topView2ndWayUtils(root,0,0);
		  
		  for(Entry<Integer, HashMap<Integer, Node1>> entry : topMap.entrySet()) 
	        {
	            
	            HashMap<Integer, Node1> n = entry.getValue();
	            Object[] val=n.keySet().toArray();
	            System.out.print(n.get(val[0]).data);
	            System.out.print(",");
	        }
	  }
	  
	  static void topView2ndWayUtils(Node1 n,int height,int level )
	  {
		  if(n==null)
		  {
			return; 
		  }
		  
		   if(topMap.containsKey(height)==false) {
				  
				  HashMap<Integer, Node1> map = new HashMap<Integer, Node1>();
		  map.put(level, n);
		  topMap.put(height, map);  
	       }
		  
		  else {
			  HashMap<Integer, Node1> m =topMap.get(height);
			  Object[] val=m.keySet().toArray();
			  
			  if(level<=Integer.parseInt(val[0].toString()))
			  {
				  HashMap<Integer, Node1> map = new HashMap<Integer, Node1>();
				  map.put(level, n);
				  topMap.put(height, map);   
			  }
			  
		  }
				
		   topView2ndWayUtils(n.left,height-1,level+1);
		   topView2ndWayUtils(n.right,height+1,level+1);
	  
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
	//bottomViewFisrtWay(root);
	
	topView2ndWay(root);
	 System.out.println();
	topViewFisrtWay(root);
	
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
