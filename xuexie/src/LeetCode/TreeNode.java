package LeetCode;



public class TreeNode {
	 int data;
	 TreeNode left, right;
	 static final int COUNT = 10;
	    public TreeNode(int data)
	    {
	    	 this.data = data;
	         this.left = null;
	         this.right = null;
	    } 
	    static void print2DUtil(TreeNode root, int space)
	    {
	        // Base case
	        if (root == null)
	            return;
	     
	        // Increase distance between levels
	        space += COUNT;
	     
	        // Process right child first
	        print2DUtil(root.right, space);
	     
	        // Print current node after space
	        // count
	        System.out.print("\n");
	        for (int i = COUNT; i < space; i++)
	            System.out.print(" ");
	        System.out.print(root.data + "\n");
	     
	        // Process left child
	        print2DUtil(root.left, space);
	    }
	    static void print2D(TreeNode root)
	    {
	        // Pass initial space count as 0
	        print2DUtil(root, 0);
	    }
}
