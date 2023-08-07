package BinaryTree;

// Detail Question Link - https://leetcode.com/problems/maximum-depth-of-binary-tree/
/*
 * Input: root = [3,9,20,null,null,15,7]
   Output: 3
*/
public class DepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }
	public static void main(String[] args) {
	}

}
