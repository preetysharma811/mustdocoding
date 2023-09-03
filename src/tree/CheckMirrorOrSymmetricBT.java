package tree;

public class CheckMirrorOrSymmetricBT {


public static void checkMirror(Node root)
{
	
	System.out.println(checkMirrorHelper(root.left,root.right));
	
}
		
	public static boolean checkMirrorHelper(Node l,Node r) {
		
		if(l==null&&r==null) {
			return true;	
			}
			
		
		if(l==null|r==null) {
		return false;	
		}
		  
		if(l.data == r.data) {
		return checkMirrorHelper(l.left,r.right)&&checkMirrorHelper(l.right,r.left);
		}
		return false;
	
	}
	
	
	

	
	public static void main(String[] args) {



    /* following is the tree after above statement

         1
       /   \
     2       2
   /  \     /  \
  4    5   4    5

*/

	
	
	BinaryTree tree2 = new BinaryTree();
	tree2.root=new Node(1);
	tree2.root.left=new Node(2);
	tree2.root.right=new Node(2);
	tree2.root.left.left=new Node(4);
	tree2.root.left.right=new Node(5);
	tree2.root.right.left=new Node(5);
	tree2.root.right.right=new Node(4);
	
	tree2.printPostOrderTraversal(tree2.root);

	
	/*Output 
	 * right view of following tree is 1 3 7 8.
	 */
	System.out.println();
	
   checkMirror(tree2.root);

   }
}
