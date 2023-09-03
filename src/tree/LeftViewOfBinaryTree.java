package tree;

public class LeftViewOfBinaryTree {
	static int maxLevel=0;
	
	public static void leftView(Node root)
	{
		leftViewUtils(root,1);
			
  }
		
	public static void leftViewUtils(Node node ,int level) {
		
//System.out.println("max_level="+maxLevel);
//System.out.println("level="+level);
		if(node==null) {
		return;	
		}
		if(maxLevel<level)
		{
			System.out.print(node.data +",");
			maxLevel=level;
		}	

		leftViewUtils(node.left,level+1);
	
		leftViewUtils(node.right,level+1);	 
		  		
	}
	
	
	public static void main(String[] args) {
	BinaryTree tree = new BinaryTree();


    /* following is the tree after above statement

         1
       /   \
     2       3
   /  \     /  \
  4    5   6    7
  \
   8 
*/
	tree.insert(tree.root,"1",0);
	tree.insert(tree.root,"2-L",1);
	tree.insert(tree.root,"3-R",1);
	tree.insert(tree.root,"4-L",2);
	tree.insert(tree.root,"5-R",2);
	tree.insert(tree.root,"6-L",3);
	tree.insert(tree.root,"7-L",3);
	tree.insert(tree.root,"8-R",4);
	System.out.println();
	leftView(tree.root);


	/*Output 
	 * Left view of following tree is 1 2 4 8.
	 */
   }
}
