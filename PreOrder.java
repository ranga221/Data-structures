package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class PreOrder {
	
	 public List<Integer> preorderTraversal(TreeNode root) {
	        
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode node = root;
	        List<Integer> list = new ArrayList<>();
	        if(node != null)
	        {
	            stack.push(node);
	        }
	        while(!stack.isEmpty())
	        {
	            node = stack.pop();
	           /* list.add(node.val);
	            
	            if(node.right != null)
	            {
	                stack.push(node.right);
	            }
	            if(node.left != null)
	            {
	                stack.push(node.left);
	            }*/
	        }
	        return list;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
