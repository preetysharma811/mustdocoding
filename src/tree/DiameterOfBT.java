package tree;

public class DiameterOfBT {
	

public static int daimeter(Node root)
{
	if(root==null)
	{
		return 0;
	}
	int lHeight=getHeight(root.left);
	int rHeight= getHeight(root.right);
	
	int withRoot = lHeight+rHeight+1;

	int withoutRoot = Math.max(daimeter(root.left),daimeter(root.right));
	
	return Math.max(withRoot, withoutRoot);

	
}
	
static int getHeight(Node root)
{
	if(root==null) {
		return 0;
	}
	
	return 1+Math.max(getHeight(root.left),getHeight(root.right));	
}
	
	public static void main(String[] args) {



    /* following is the tree after above statement

         1
       /   \
      2     3
     / \       
    10  5       
   /   / \
  11   6  7
 /        \
12          9
	
*/	
	BinaryTree tree2 = new BinaryTree();
	tree2.root=new Node(1);
	tree2.root.left=new Node(2);
	tree2.root.left.left=new Node(10);
	tree2.root.left.left.left=new Node(11);
	tree2.root.left.left.left.left=new Node(12);
	tree2.root.right=new Node(3);
	tree2.root.left.right=new Node(5);
	tree2.root.left.right.left=new Node(6);
	tree2.root.left.right.right=new Node(7);
	tree2.root.left.right.right.right=new Node(9);
	//tree2.root.left.right.right=new Node(7);
	//tree2.root.right.right=new Node(8);
	
	tree2.printPostOrderTraversal(tree2.root);

	
	/*Output 
	 * right view of following tree is 1 3 7 8.
	 */
	System.out.println();
	
	System.out.println("daimter="+daimeter(tree2.root));

   }
}
