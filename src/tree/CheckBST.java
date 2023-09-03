package tree;

public class CheckBST {
	
	
	public static boolean checkBinarySearchTree(Node node)
	{
		
		  boolean b=isBSTcheck(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
	        if(b==true)
	            return true;
	        else
	            return false;
		
	}
	
	public static boolean isBSTcheck(Node node, int min, int max)
	{
		 if(node==null)
	            return true;
	        if(node.data<min || node.data>max)
	            return false;
//
//	   	 if(node.left!=null||node.right!=null) {
//	        System.out.println("left-"+ node.left.data);
//			System.out.println(min);
//			System.out.println(node.data-1);
//	  
//			System.out.println("+++++++++++++++++++++");
//			
//			 System.out.println("right-"+ node.right.data);
//				System.out.println(max);
//				System.out.println(node.data+1);
	 //	 }
//				boolean a =isBSTcheck(node.left,min,node.data-1);
//				boolean b =isBSTcheck(node.right,node.data+1,max);
//	        
	        boolean c = isBSTcheck(node.left,min,node.data)&&isBSTcheck(node.right,node.data,max);
	      //  System.out.println(c);
	        return c;
	}
	
	public static void main(String[] args) {
	BinaryTree tree = new BinaryTree();
	BinaryTree tree1 = new BinaryTree();


    /* following is the tree after above statement

         2
       /   \
     1       3
   /  \     /  \
  4    5   6    7
  \
   8 
*/
	tree.insert(tree.root,"2",0);
	tree.insert(tree.root,"1-L",2);
	tree.insert(tree.root,"3-R",2);
	tree.insert(tree.root,"4-L",1);
	tree.insert(tree.root,"5-R",1);
	tree.insert(tree.root,"6-L",3);
	tree.insert(tree.root,"7-L",3);
	//tree.insert(tree.root,"8-R",4);
	System.out.println();
	System.out.println("Result---"+checkBinarySearchTree(tree.root));
	//checkBinarySearchTree(tree.root);
	
	
    /* following is the tree after above statement

      5
    /   \
   3     8
 /  \   / \
1   4 6   10
\
8 
*/
	
	tree1.insert(tree.root,"5",0);
	tree1.insert(tree.root,"3-L",5);
	tree1.insert(tree.root,"8-R",5);
	tree1.insert(tree.root,"1-L",3);
	tree1.insert(tree.root,"4-R",3);
	tree1.insert(tree.root,"6-L",8);
	tree1.insert(tree.root,"10-R",8);

	System.out.println();
	System.out.println(checkBinarySearchTree(tree1.root));
	/*Output 
	 * Left view of following tree is 1 2 4 8.
	 */
   }
}
