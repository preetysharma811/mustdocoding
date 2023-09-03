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

class Node2 {
	
	int data;
	Node2 left;
	Node2 right;
	Node2 next;

	

   Node2(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}

public class ConnectToSameLevelOrNextRightPointers {
	
	
	public void printSpecial(Node2 root)
	{
		if(root==null)
		{
			return;
		}
		Node2 node = root;
		
		while (node!=null)
		{
			System.out.print(node.data + ",");
			node=node.next;
	
		}
		if(root.left!=null)
		{
			printSpecial(root.left);
		}
		
		else
		{
			printSpecial(root.right);
		}
		
	}

	public void inOrderSpeacial(Node2 root)
	{
		if(root==null)
		{
			return;
		}
		inOrderSpeacial(root.left);
		System.out.print(root.data+",");
		inOrderSpeacial(root.right);
		
		
	}
	
	  public void connect(Node2 root)
	  {
		     if (root == null || (root.left == null && root.right == null)){
		          return;
		        }
		        
		  
		  Queue<Node2> q = new LinkedList<Node2>();
		  q.add(root);
		  q.add(null);
		  
		  while(!q.isEmpty())
		  {
			  Node2 temp=q.peek();
			  q.poll();
			  if(temp==null) {
				  if(!q.isEmpty())
				  {
					  q.add(null);
				  }
			  }
			  else {
              temp.next=q.peek();
			 if(temp.left!=null)
			 {
				 q.add(temp.left);
			 }
			 if(temp.right!=null)
			 {
				 q.add(temp.right);
			 }
		  }}
	  }

	  
	  
	public static void main(String[] args) {
		

//		   Node2 root = new Node2(3);
//		   root.left = new Node2(1);
//		   root.right = new Node2(2);
		
		   Node2 root = new Node2(10);
		   root.left = new Node2(20);
		   root.right = new Node2(30);
		   root.left.left = new Node2(40);
		   root.left.right = new Node2(60);
		
		
		
  // Node2 root = new Node2(1);
//	root.left = new Node2(2);
//	root.right = new Node2(3);
//	root.left.left = new Node2(4);
//	root.left.right = new Node2(5);
//	root.left.right.left = new Node2(6);
//	root.left.right.right = new Node2(7);
//	root.right.right = new Node2(8);
//	root.right.left = new Node2(9);

	System.out.println("First way");

	
	ConnectToSameLevelOrNextRightPointers d = new 
			ConnectToSameLevelOrNextRightPointers();
	d.connect(root);
	d.printSpecial(root);
	System.out.println();
	d.inOrderSpeacial(root);
	
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
