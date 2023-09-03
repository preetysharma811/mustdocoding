package tree;

public class RightViewOfBinaryTree {
	
static int maxLevel=0;

		
	public static void rightViewUtils(Node node ,int level) {
		
		if(node==null) {
		return;	
		}
		if(maxLevel<level)
		{
			System.out.print(node.data +",");
			maxLevel=level;
		}	

		rightViewUtils(node.right,level+1);	
		rightViewUtils(node.left,level+1);
	
		 
		  		
	}
	
	
	
	public static void rightView(Node n)
	{
		
		rightViewUtils(n,1);
			
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
	
	/*Output 
	 * right view of following tree is 1 3 7 8.
	 */
	System.out.println();
	rightView(tree1.root);

   }
}
