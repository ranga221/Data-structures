package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;




public class Inorder {

	public List<Integer> inorderTraversal(TreeNode root)
	{
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		
		TreeNode curr = root;
		
		while(curr != null || !stack.isEmpty())
		{
			while(curr != null)
			{
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			res.add(curr.data);
			curr = curr.right;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		Inorder i = new Inorder();
		List<Integer> res = i.inorderTraversal(root);
		System.out.println(res);
	}
	
	
	
}
