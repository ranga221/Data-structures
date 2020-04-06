package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {

	public List<Integer> postOrderTraversal(TreeNode root){
		
		List<Integer> result = new ArrayList<>();
		 if(root == null) {
	            return result;
	        }
		 Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		
		while(!stack.isEmpty())
		{
			TreeNode cur = stack.pop();
			
			if(cur.left == null && cur.right == null)
			{
				result.add(cur.data);
				continue;
			}
			
			stack.push(cur);
			
			if(cur.right != null)
			{
				stack.push(cur.right);
				cur.right = null;
			}
			
			if(cur.left != null)
			{
				stack.push(cur.left);
				cur.left = null;
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		

		PostOrder i = new PostOrder();
		List<Integer> res = i.postOrderTraversal(root);
		System.out.println(res);

	}

}
