package tree;


public class ConvertBinaryTreeToDoubleLinkedList {
	

	Node head;

	Node prev=null;
	
	void convert(Node root )
	{
		if(root==null)
		{
			return;
		}
	
		convert(root.left);
		
		if(prev==null)
		{
		
			head=root;
		}
		else {
			root.left=prev;
			prev.right=root;
			
		}	
		prev=root;
		convert(root.right);
	
		
	}
	
	void inOrder(Node n)
	{
		if(n==null)
		{
			return;
		}
		inOrder(n.left);
		System.out.print(n.data+",");
		inOrder(n.right);
	}
	
	void printList(Node n)
	{
		Node prev=n;
		while(n!=null) {
			System.out.print(n.data+",");
			prev=n;
			n=n.right;
		}
		System.out.println();
		while(prev!=null) {
			System.out.print(prev.data+",");
			prev=prev.left;
		}
	}
	  
	public static void main(String[] args) {
	
		
		 /* following is the tree after above statement

	      15
	    /   \
	   5      6
	  /  \    /  \
	 10   1   9   8
 
  
	*/


		   Node root = new Node(15);
		   root.left = new Node(5);
		   root.right = new Node(6);
		   
		   root.left.left = new Node(10);
		   root.left.right = new Node(1);
		   
		   
		   root.right.left = new Node(9);
		   root.right.right = new Node(8);
		   
		   
		
		


	
	ConvertBinaryTreeToDoubleLinkedList d = new 
			ConvertBinaryTreeToDoubleLinkedList();
	d.inOrder(root);
	d.convert(root);
	System.out.println();
	System.out.println("print");
	d.printList(d.head);

	

   }
}
