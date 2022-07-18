package blind75;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);

		root.left = new TreeNode(9);
		root.right = new TreeNode(20);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		MaximumDepthofBinaryTree dbt = new MaximumDepthofBinaryTree();
		System.out.print(dbt.maxDepth1(root));

	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int level = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			for (int i = 0; i < q.size(); i++) {
				TreeNode node = q.poll();
				if (node.left != null) {
					q.remove(node.left);
				}
				if (node.right != null) {
					q.remove(node.right);
				}
				level += 1;
			}

		}

		return level;
	}

	public int maxDepth1(TreeNode root) {

		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		} else {
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		}

	}

}
