package binaryTree;

public class SymmetricTree {

	
	public boolean isSymmetric(TreeNode root)
	{
		return isMirror(root, root);	
	}
	
	
	  // For two trees to be mirror images, the following three 
    // conditions must be true 
    // 1 - Their root node's key must be same 
    // 2 - left subtree of left tree and right subtree 
    //      of right tree have to be mirror images 
    // 3 - right subtree of left tree and left subtree 
    //      of right tree have to be mirror images 
  
	private boolean isMirror(TreeNode root, TreeNode root2) {
		
		if(root == null && root2 == null)
		{
			return true;
		}
		
		if(root != null && root2 != null && root.data == root2.data )
		{
			return (isMirror(root.left, root2.right) && 
					isMirror(root.right,root2.left));
		}
		
		return false;
	}


	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		

		SymmetricTree i = new SymmetricTree();
	   boolean ans = i.isSymmetric(root);
		System.out.println(ans);

	}

}
