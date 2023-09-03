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



public class LowestCommonAncestorBinaryTree {

	
	  static Node LCAInBT(Node root, int n1 , int n2)
	  { // Your code here
	        if (root==null){
	        	return null;
	        }
	            
	            if (root.data==n1||root.data==n2)
	            {
	            	return root;
	            }
	            Node left =  LCAInBT(root.left,n1,n2);
	            Node right =  LCAInBT(root.right,n1,n2);
	   
	            if(left!=null &&right!=null)
	            {
	            	return root;
	            } 
	            
	            if(left==null&&right==null) {
	            
	            return null;
	            } 
	    
	        
	        return left!=null?left:right;
		 }

	  
	  
	public static void main(String[] args) {

		
   Node root = new Node(3);
	root.left = new Node(6);
	root.right = new Node(8);
	root.left.left = new Node(2);
	root.left.right = new Node(11);
	root.left.right.left = new Node(9);
	root.left.right.right = new Node(5);
	root.right.right = new Node(13);
	root.right.right.left = new Node(7);

	System.out.println("First way");
	System.out.println(LCAInBT(root,7,8).data);
	System.out.println(LCAInBT(root,8,11).data);
	
	
	
	 /* following is the tree after above statement

       3
    /    \
   6      8
  / \       \
2    11      13
     /\      /
    9  5     7
 */             
   }
}
