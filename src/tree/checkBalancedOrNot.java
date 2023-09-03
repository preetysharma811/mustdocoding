package tree;

public class checkBalancedOrNot {
	

		
	public static int getHeight(Node node) {
		
		if(node==null) {
		return 0;	
		}
		return 1+ Math.max(getHeight(node.left), getHeight(node.right));
		  		
	}
	
	static boolean checkBalance(Node root)
	{
		 if(root==null)return true;
		
		int lHeight=getHeight(root.left);
		int rHeight=getHeight(root.right);
		
		if(Math.abs(lHeight-rHeight)>1)
		{
			return false;
		}
	
		return checkBalance(root.left)&&checkBalance(root.right);
		
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
     
     
                         10
                        /  \
                      20    30
                    /    \
                  40      60
                           \
                           70
*/ 
	tree1.insert(tree1.root,"1",0);
	tree1.insert(tree1.root,"2-L",1);
	tree1.insert(tree1.root,"3-R",1);
	tree1.insert(tree1.root,"4-L",2);
	tree1.insert(tree1.root,"5-R",2);
	tree1.insert(tree1.root,"6-L",3);
	tree1.insert(tree1.root,"7-L",3);
	tree1.insert(tree1.root,"8-R",4);
	//tree1.insert(tree1.root,"10-R",8);
	
	BinaryTree tree2 = new BinaryTree();
	tree2.insert(tree2.root,"10",0);
	tree2.insert(tree2.root,"20-L",10);
	tree2.insert(tree2.root,"30-R",10);
	tree2.insert(tree2.root,"40-L",20);
	tree2.insert(tree2.root,"60-R",20);
	tree2.insert(tree2.root,"70-R",60);

	//tree1.insert(tree1.root,"10-R",8)
	/*Output 
	 * right view of following tree is 1 3 7 8.
	 */
	System.out.println();
	System.out.println("balanced="+checkBalance(tree1.root));
	System.out.println("balanced="+checkBalance(tree2.root));

   }
}
