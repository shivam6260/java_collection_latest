package BinaryTree;

import java.util.*;

///                      Creating Binary Tree from Inorder and PreOrder Array
class TreeNode {
	int val;
	TreeNode left,right;
	public TreeNode(int val)
	{
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class Solution {
    int rootIndex;
    Map<Integer,Integer> inOrderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        rootIndex = 0;
        inOrderMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inOrderMap.put(inorder[i],i);
        TreeNode root = arrayToTree(preorder,0,preorder.length-1);
        return root;
    }
    
    public TreeNode arrayToTree(int[] preorder,int left, int right)
    {
        if(left > right)
            return null;
        int rootValue = preorder[rootIndex];
        rootIndex++;
        TreeNode root = new TreeNode(rootValue);
        root.left = arrayToTree(preorder,left,inOrderMap.get(rootValue) - 1);
        root.right = arrayToTree(preorder,inOrderMap.get(rootValue) + 1,right);
        return root;
    }
}

public class preorderAndInorderToBinaryTree {

}
