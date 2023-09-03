package tree;

public class BinaryTree {
	
	 Node root;
	 
	 
	public void insert(Node n, String value, int parent)
	 {
		Node start = n;
		
			
			if (root == null&& parent==0) {
				Node newNode = new Node(Integer.parseInt(value));
				start = newNode;
				root=start;
				System.out.print(root.data+"P,");

			   }
		     	
		    if(start!=null) {
				if (value.contains("L")&&start.data==parent) {
				
						Node newNode = new Node(Integer.parseInt(value.split("-")[0]));
						start.left = newNode;
						System.out.print(start.data+"P-");
						System.out.print(start.left.data+"L,");
				}	
				
				if (value.contains("R")&&start.data==parent) {
				
						Node newNode = new Node(Integer.parseInt(value.split("-")[0]));
						start.right = newNode;
						System.out.print(start.data+"P-");
						System.out.print(start.right.data+"R,");

					}
				else {
				insert(start.left,value,parent);
				insert(start.right,value,parent);
				}
			  }
							
	 }
	//level order insertion
	public Node insertFromArray(Node n,int [] arr,int i )
	{     
		if(i<arr.length) {

			Node newNode = new Node(arr[i]);
			n=newNode;
			
			n.left=insertFromArray(n.left,arr,2*i+1);
			n.right=insertFromArray(n.right,arr,2*i+2);
				
			}
		root=n;
		return n;
	}
	
	public void printPreOrderTraversal(Node n) {
		if(n==null)
		{
			return;
		}
		
			System.out.print(n.data +", ");
			printPreOrderTraversal(n.left);
			printPreOrderTraversal(n.right);
		
	}	
		
		public void printInOrderTraversal(Node n) {
			if(n==null)
			{
				return;
			}
				
			    printInOrderTraversal(n.left);
				System.out.print(n.data +", ");
				printInOrderTraversal(n.right);
			
		}	
			
			public void printPostOrderTraversal(Node n) {
				if(n==null)
				{
					return;
				}
				printPostOrderTraversal(n.left);			
				printPostOrderTraversal(n.right);
					System.out.print(n.data +", ");
				
				
		
	}
	

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.insert(tree.root,"10",0);

	    /* following is the tree after above statement

	          1
	        /   \
	      null  null     */
		
	
		tree.insert(tree.root,"20-L",10);
		tree.insert(tree.root,"30-R",10);


	    /* 2 and 3 become left and right children of 1
	           1
	         /   \
	        2      3
	      /    \    /  \
	    null null null null  */


		tree.insert(tree.root,"40-L",20);
	   // tree.insert(tree.root,"0-L",20);
	    tree.insert(tree.root,"50-L",30);
	    /* 4 becomes left child of 2
	                10
	            /       \
	           20          30
	         /   \        /  \
	        40    null   50  null
	       /   \
	      null null
	     */
   
	    tree.root=null;

		System.out.println("\n2nd method");
	    int a [] = {1,2,3,4,5,6,7,8};
	 //   int b [] = {1,2,3,4,5,6,7,8};
     //              1
     //            /   \
    //           2      3
   //          /   \    /  \
  //         4     5   6    7
//	        /
//	      8  

	    
	    tree.insertFromArray(tree.root,a,0);
	    System.out.println("\n Pre traversal");
	   tree.printPreOrderTraversal(tree.root);
		System.out.println("\n In order traversal");
	   tree.printInOrderTraversal(tree.root);
		System.out.println("\n Post order traversal");
	   tree.printPostOrderTraversal(tree.root);
	}

}
