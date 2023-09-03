package tree;

public class BinarySearchTree {

	      Node  root;  
	    
	      void insert(int data) { 
	          root = insertRec(root, data); 
	       } 
	         
	      
	  	public Node insertRec(Node node, int val) {
			
	  		 if (node == null) { 
	  			node = new Node(val); 
	             return node; 
	         } 
	   
	     
	         if (val < node.data) 
	        	 node.left = insertRec(node.left, val); 
	         else if (val > node.data) 
	        	 node.right = insertRec(node.right, val); 
	   
	         return node; 
		}

		public void inOrderDisplay(Node n) {
			if(n!=null)
			{
				
				inOrderDisplay(n.left);
				System.out.print(n.data +", ");
				inOrderDisplay(n.right);
			}
		}
		
		
		public Node search(Node node , int no)
		{
	  		 if ( node== null||node.data==no) { 
	  		
	             return node; 
	         } 
	   
	  	
	  		  if (no < node.data) {
	  			return node.left = search(node.left, no);
	  		  }
	  			return node.right = search(node.right, no);		  
		}

		public static void main(String[] args) {
 
			
			 int arr [] = {4,8,2,5,6,1,9};
			BinarySearchTree bst = new BinarySearchTree();
			for(int i = 0; i<arr.length;i++)
			{
				bst.insert(arr[i]);
			}
			
			bst.inOrderDisplay(bst.root);
			
			System.out.println();
			if(bst.search(bst.root,8)!=null)
			{
				System.out.println("yes BST");
			}
			else {
				System.out.println("not BST");
			}
			System.out.println();
			
			if(bst.search(bst.root,15)!=null)
			{
				System.out.println("yes BST");
			}
			else {
				System.out.println("not BST");
			}
			//System.out.println(bst.search(bst.root,10).data);
		}
}