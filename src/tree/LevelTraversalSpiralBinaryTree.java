package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;



public class LevelTraversalSpiralBinaryTree {
	
//spiral Level Order 1 way using 2 stack , using recursion without stack, using Dequeue 
	
	 static void spiralLevelWithoutStack(Node root)
	  {
		 int height = getHeight(root);
		 boolean isLeft= true;
		 System.out.println("final height="+height);

		 for(int i = 0;i<=height;i++) {
		 spiralHelper(root,i,isLeft);
		 isLeft=!isLeft;
		
	
	  }

		 
	}
	private static int getHeight(Node root) {
			if (root == null) {
				return 0;
			}
			//System.out.println("root="+root.data);
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	
	  
	} 
	 static void  spiralHelper(Node r,int h,boolean dir)
	  {
		
			if (r == null) {
				return;
			}
			if (h == 1) {
				System.out.print(r.data + " ");
			}
			else if( h > 1)
			{
				if (dir==false) {
					spiralHelper(r.right, h - 1, dir);
					spiralHelper(r.left, h - 1, dir);
				} else {
					spiralHelper(r.left, h - 1, dir);
					spiralHelper(r.right, h - 1, dir);
				}
			}

	}
	 
	 
	 	static void sprialLevelOrderTraversal(Node root)
	  {
	
		  Stack<Node> s1 = new Stack<Node>();
		  Stack<Node> s2 = new Stack<Node>();
		  s1.push(root);
	 
	      
		while (!s1.isEmpty() || !s2.isEmpty()) {

			while (!s1.isEmpty()) {
				Node temp1 = s1.peek();
				s1.pop();
				System.out.print(temp1.data + ",");

				if (temp1.right != null) {
					s2.push(temp1.right);
				}

				if (temp1.left != null) {
					s2.push(temp1.left);
				}

				
			}System.out.println();
			
			while (!s2.isEmpty()) {
				Node temp1 = s2.peek();
				s2.pop();
				System.out.print(temp1.data + ",");
				if (temp1.left != null) {
					s1.push(temp1.left);
				}

				if (temp1.right != null) {
					s1.push(temp1.right);
				}
			}
			System.out.println();

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

	System.out.println("Spiral level order traversal");
	//sprialLevelOrderTraversal(root);
	spiralLevelWithoutStack(root);
	
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
