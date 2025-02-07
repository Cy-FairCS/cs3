//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

//You'll need to supply any missing import statements:



public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree() 	{
		root = null;
	}

	public void add(Comparable val) 	{

	}

	private TreeNode add(Comparable val, TreeNode tree)
	{

	}
   
   public void inOrder() 	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)	{

	}

	//add preOrder, postOrder, and revOrder



	public int getNumLevels() 	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree) {
		return 0;
	}
   
   // Complete the traversals and the toString method
   // and then each of these:
   
   //clear()

	//getNumLeaves 
      
   //getHeight
   
   //getNumNodes
   
   //isFull
	
	//search
	
	//getSmallest
	
	//getLargest
		
   //getDiameter

	//remove



   // Returns a String that represents 
   // an IN-ORDER traversal of the tree.
	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		return "";
	}
 
   public void levelOrder() {
      levelOrder(root);
      System.out.println("\n");
   }

   private void levelOrder(TreeNode tree) {
      if(tree==null)
         return;
        
      Queue<TreeNode> level = new LinkedList<TreeNode>();
      level.add(tree);
      while(!level.isEmpty()) {
         TreeNode node = level.remove();
         out.print(node.getValue() + " ");
         if(node.getLeft()!=null) {
            level.add(node.getLeft());
         }
         if(node.getRight()!=null) {
            level.add(node.getRight());
         }
      }
   }
 
   public void levelOrderWithNulls() {
      levelOrderWithNulls(root);
      System.out.println();
   }

   private void levelOrderWithNulls(TreeNode tree) {
      if(tree==null)
         return;
     
      Queue<TreeNode> level = new LinkedList<TreeNode>();
      level.add(tree);
      int prevLevelSize = 1;
      int spot = 0;      
      while(!level.isEmpty() && !allElementsNull(level)) {
         TreeNode node = level.remove();
         out.print( node == null ? "null " : node.getValue() + " ");
         if(node == null) {
            level.add(null);
            level.add(null);
            continue;
         }
         if(node.getLeft()!=null)
            level.add(node.getLeft());
         else
            level.add(null);
         if(node.getRight()!=null)
            level.add(node.getRight());
         else
            level.add(null);     
         spot++;
         if (spot == prevLevelSize) {
            prevLevelSize *= 2;
            spot = 0;
            out.print("| ");
         }
      }
   } 
   
   private boolean allElementsNull(Collection<TreeNode> list) {
      for (Object object : list) {
         if (object != null)
            return false;
      }
      return true;
   }
}
