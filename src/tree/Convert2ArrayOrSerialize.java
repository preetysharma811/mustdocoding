package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Convert2ArrayOrSerialize {

	
	
  String serialize(Node root,ArrayList<Integer> list) {
	  if(root==null)
      { 
          return "X";
      }
	  String l=serialize(root.left,list);
	  String p= String.valueOf(root.data);
	  list.add(root.data);
	  String r=serialize(root.right,list);
	  
	//  return l+" "+p+" "+r;  //only in-order as root is required first
	  return p+" "+l+" "+r;
 	}


  static Node deserialize(String s)
  {
	  Queue<String> q= new LinkedList<String>();
	q.addAll(Arrays.asList(s.split(" ")));
	return deserializeHelper(q);	
  }

 static Node deserializeHelper(Queue<String> q){
	  String temp=q.poll();
	 
	 if(temp.equals("X"))
	 {
		 return null;
	 }
	 
	 Node t = new Node(Integer.parseInt(temp));	
   

	  t.left=deserializeHelper(q);
		 
		 t.right=deserializeHelper(q);
	 
	   return t;
  }
  
	
	public static void main(String[] args) {

		
		 /* following is the tree after above statement

	       15
	    /     \
	   5       6
	 /   \    /  \
	7     1   9   8
	     /   
	    3     
	*/


		   Node root = new Node(15);
		   root.left = new Node(5);
		   root.right = new Node(6);
		   root.left.left = new Node(7);
		   root.left.right = new Node(1);
		   root.left.right.left = new Node(3);
		   root.right.left = new Node(9);
		   root.right.right = new Node(8);
		
		
		   BinaryTree bt = new BinaryTree();
		   Convert2ArrayOrSerialize obj = new Convert2ArrayOrSerialize();
		   bt.printInOrderTraversal(root);
		   System.out.println("\nserialized pre-order manner");
		   ArrayList<Integer> list = new ArrayList<Integer>();
		   
	      System.out.println(obj.serialize(root,list));

		   
	      System.out.println("\nderialized pre-order manner");
		   Node head=deserialize(obj.serialize(root,list));
		   bt.printPreOrderTraversal(head);

	
	

   }
}
