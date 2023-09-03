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



public class LowestCommonAncestorBST {

	
	  static Node LCA(Node root, int n1 , int n2)
	  { // Your code here
	        if (root!=null){
	            
	            if (root.data>n1&&root.data>n2)
	            return LCA(root.left,n1,n2);
	            
	            if (root.data<n1&&root.data<n2)
	            return LCA(root.right,n1,n2);
	    
	        }
	        return root;
		 }

	  
	  
	public static void main(String[] args) {

		
   Node root = new Node(5);
	root.left = new Node(4);
	root.right = new Node(6);
	root.left.left = new Node(3);
	root.right.right = new Node(7);
	root.right.right.right = new Node(8);

	
	System.out.println(LCA(root,7,8).data);
	
	
	 /* following is the tree after above statement

5 4 6 3 7 8
      5
    /  \
   4    6
  /      \
3         7
           \
            8
 */  

	int[] arr = {12, 14, 15, 10, 9, 8};
	
	BinarySearchTree bst = new BinarySearchTree();
	for(int i =0;i<arr.length;i++) {

	bst.insert(arr[i]);
	}
	bst.inOrderDisplay(bst.root);
	
	System.out.println();
	System.out.println(LCA(bst.root,8,15).data);
	
   }
}
