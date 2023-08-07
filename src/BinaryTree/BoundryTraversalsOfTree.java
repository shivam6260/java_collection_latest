package BinaryTree;

import java.util.*;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

// Print Right Side of Tree
// https://leetcode.com/problems/binary-tree-right-side-view/

public class BoundryTraversalsOfTree {
	public static void main(String[] args) {

	}

	// Right Side view Iterative Approach
	// Just add the last element of the Queue to List
	// And for Finding the left side of the tree , add the first element of the Queue to the list
	public List<Integer> rightSideView(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<Integer> res = new ArrayList<Integer>();
		if (root == null)
			return res;

		q.add(root);
		int size = q.size();
		while (true) {
			for (int i = 1; i <= size; i++) {
				TreeNode temp = q.poll();
				if (i == size)
					res.add(temp.val);
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}
			size = q.size();
			if (size == 0)
				break;
		}
		return res;
	}

	// Right Side view Recursive ( DFS ) Approach
	List<Integer> res;

	public void dfs(TreeNode root, int depth) {
		if (root == null)
			return;
		if (res.size() == depth)
			res.add(root.val);
		dfs(root.right, depth + 1);
		dfs(root.left, depth + 1);

		// For Finding the Left side of the Binary tree
//	    dfs(root.left,depth + 1);
//	    dfs(root.right,depth + 1);

	}

	public List<Integer> rightSideViewRecursive(TreeNode root) {
		res = new ArrayList<Integer>();
		if (root == null)
			return res;
		dfs(root, 0);
		return res;

	}

}
