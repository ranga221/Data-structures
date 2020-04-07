package binaryTree;

import java.util.List;

/**
 * 
 * Using Recursive Method -> Top Down Solution & Bottom Up Solution.
 * @author Ranga Hari
 *
 */
public class MaximumDepthOfTree {

	private int answer;
	 //Top Down Solution
	private void maximum_depth(TreeNode root, int depth)
	{
		
		if(root == null)
		{
			return;
		}
		
		if(root.left == null && root.right == null)
		{
			answer = Math.max(answer, depth);
			System.out.println(answer);
		}
		
		maximum_depth(root.left, depth +1);
		maximum_depth(root.right, depth+1);
	}
	
	//bottom up
	private int maximum_depth_bottom_up(TreeNode root)
	{
		
		if(root == null)
		{
			return 0;
		}
		
		int left_depth = maximum_depth_bottom_up(root.left);
		int right_depth = maximum_depth_bottom_up(root.right);
		System.out.println(Math.max(left_depth, right_depth) + 1);
		return Math.max(left_depth, right_depth) + 1;
		
		
	}
	
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		MaximumDepthOfTree i = new MaximumDepthOfTree();
		i.maximum_depth(root, 1);
		i.maximum_depth_bottom_up(root);
		
	}
}
