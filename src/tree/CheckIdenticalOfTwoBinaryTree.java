package tree;

public class CheckIdenticalOfTwoBinaryTree {
	
		
	public static boolean checkIdentical(Node node1,Node node2) {
		
		if(node1==null&&node2==null) {
			return true;	
			}
			
		
		if(node1==null||node2==null) {
		return false;	
		}
		
		if(node1.data!=node2.data) {
			  return false;
		}	  
			return checkIdentical(node1.left,node2.left) && checkIdentical(node1.right,node2.right);
	//	return (node1.data==node2.data)&&checkIdentical(node1.left,node2.left)&&checkIdentical(node1.right,node2.right);
	}
	
	
	

	
	public static void main(String[] args) {
	BinaryTree tree1 = new BinaryTree();


    /* following is the tree after above statement

         1
       /   \
     2       3
   /  \     /  \
  4    5   6    7
   \
     8
*/
	tree1.insert(tree1.root,"1",0);
	tree1.insert(tree1.root,"2-L",1);
	tree1.insert(tree1.root,"3-R",1);
	tree1.insert(tree1.root,"4-L",2);
	tree1.insert(tree1.root,"5-R",2);
	tree1.insert(tree1.root,"6-L",3);
	tree1.insert(tree1.root,"7-L",3);
	tree1.insert(tree1.root,"8-R",4);
	
	
	BinaryTree tree2 = new BinaryTree();
	tree2.insert(tree2.root,"1",0);
	tree2.insert(tree2.root,"2-L",1);
	tree2.insert(tree2.root,"3-R",1);
	tree2.insert(tree2.root,"4-L",2);
	tree2.insert(tree2.root,"5-R",2);
	tree2.insert(tree2.root,"6-L",3);
	tree2.insert(tree2.root,"7-L",3);
	tree2.insert(tree2.root,"8-R",4);
	
	/*Output 
	 * right view of following tree is 1 3 7 8.
	 */
	System.out.println();
	
	System.out.println(checkIdentical(tree1.root,tree2.root));

   }
}
