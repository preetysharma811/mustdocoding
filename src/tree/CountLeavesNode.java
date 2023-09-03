package tree;


public class CountLeavesNode {
	
	
	int countLeaves(Node root)
	{
		if(root==null) {
			return 0;
		}
	
		if(root.left==null&&root.right==null)
		{
			return 1;
		}
		 
		return countLeaves(root.left)+countLeaves(root.right);
	}
	
	  
	public static void main(String[] args) {
	
		
		 /* following is the tree after above statement

	      15
	    /   \
	   5      6
	  /  \    /  \
	 10   1   9   8
	     /   
	    6     
	*/


		   Node root = new Node(15);
		   root.left = new Node(5);
		   root.left.left = new Node(10);
		   root.right = new Node(6);
		   root.left.right = new Node(1);
		   root.left.right.left = new Node(6);
		   root.right.left = new Node(9);
		   root.right.right = new Node(8);
		
		


	
	CountLeavesNode d = new 
			CountLeavesNode();
	
	System.out.println(" total leaves "+ d.countLeaves(root));
	

   }
}
