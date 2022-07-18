package LeetCode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode144 {
	// Inorder => Left, Root, Right.

//Preorder => Root, Left, Right.

//Post order => Left, Right, Root.
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		LeetCode144 lc = new LeetCode144();
		System.out.print(lc.preorderTraversal(root));
		
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		LinkedList<Integer> output = new LinkedList<>();
		if (root == null) {
			return output;
		}

		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pollLast();
			output.add(node.data);
			if (node.right != null) {
				stack.add(node.right);
			}
			if (node.left != null) {
				stack.add(node.left);
			}
		}
		return output;
	}

//	public List<Integer> preorderTraversal(TreeNode root) {
//
//		List<Integer> preorder = new ArrayList<Integer>();
//        if (root == null) {
//            return preorder;
//        }
//        Deque<TreeNode> stack = new LinkedList<TreeNode>();
//        stack.offerFirst(root);
//        while (!stack.isEmpty()) {
//            TreeNode cur = stack.pollFirst();
//            // the left subtree should be traversed before right subtree,
//            // since stack is LIFO, we should push right into the stack first,
//            // so for the next step the top element of the stack is the left
//            // subtree.
//            // stack 先进后出 所以想先print left ，就得后进left
//            if (cur.right != null) {
//                stack.offerFirst(cur.right);
//            }
//            if (cur.left != null) {
//                stack.offerFirst(cur.left);
//            }
//            preorder.add(cur.key);
//        }
//        return preorder;
}
