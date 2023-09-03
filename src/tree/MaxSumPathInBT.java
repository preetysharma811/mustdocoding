package tree;


public class MaxSumPathInBT {
	
	int maxSum=0;
	
	int sumPath(Node root)
	{
		if(root==null) {
			return 0;
		}

		int leftSum=sumPath(root.left);
		int rightSum=sumPath(root.right);
		int maxSumRootChild = Math.max(Math.max(leftSum+root.data,rightSum+root.data),root.data);
		int sumALL = root.data + leftSum + rightSum;		
		
		
		 maxSum = Math.max(maxSum,sumALL);	
		 
		return maxSumRootChild;
	}
	
	  
	public static void main(String[] args) {
	
		
		 /* following is the tree after above statement

	      15
	    /   \
	   5      6
	    \    /  \
	     1   9   8
	    /   
	    6     
	*/


		   Node root = new Node(15);
		   root.left = new Node(5);
		   root.right = new Node(6);
		   root.left.right = new Node(1);
		   root.left.right.left = new Node(6);
		   root.right.left = new Node(9);
		   root.right.right = new Node(8);
		
		


	System.out.println("First way");

	
	MaxSumPathInBT d = new 
			MaxSumPathInBT();
	//System.out.println(Math.max(d.sumPath(root),d.maxSum));
	d.sumPath(root);
	System.out.println(d.maxSum);
	

   }
}
