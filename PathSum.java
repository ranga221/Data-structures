package binaryTree;

import java.util.List;

//Given a binary tree and a sum, determine 
//if the tree has a root-to-leaf path such that 
//adding up all the values along the path equals the given sum.

//Note: A leaf is a node with no children.
public class PathSum {
	
	public boolean hasPathSum(TreeNode root, int sum)
	{
		return traverse(root, 0, sum);
	}
	

	private boolean traverse(TreeNode root, int carry, int sum) {
		if(root == null)
		{
			return false;
		}
		
		if(root.right == null && root.left == null)
		{
			return sum == root.data + carry;
		}
		
		carry += root.data;
		
		boolean l = traverse(root.left, carry, sum);
		boolean r = traverse(root.right, carry, sum);
		
		return l || r;
	}


	public static void main(String[] args) {	
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.right.left = new TreeNode(1);
		

		PathSum i = new PathSum();
	    boolean res =  i.hasPathSum(root, 5);
		System.out.println(res);

	}
}
