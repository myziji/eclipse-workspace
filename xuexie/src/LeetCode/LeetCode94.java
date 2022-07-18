package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		LeetCode94 lc = new LeetCode94();
		System.out.print(lc.inorderTraversal(root));
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> res = new ArrayList<>();
		while(root!=null || !stack.isEmpty()) {
			while(root!=null) {
				stack.push(root);
				root = root.left;
			}
			root=stack.pop();
			res.add(root.data);
			root = root.right;
		}
		return res;
	}
}
