package BinaryTree;

// A general questions and there solution on Traversal of Tree using DFS Approach
// https://leetcode.com/problems/binary-tree-level-order-traversal/discuss/114449/A-general-approach-to-level-order-traversal-questions-in-Java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class TreeTraversals {
	Node root;
	
	static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<Node>();
        list.add(root.key);
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.left != null)
            {
                list.add(temp.left.key);
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                list.add(temp.right.key);
                q.add(temp.right);
            }
        }
        return list;
    }
	void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
 
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    
    void printPreorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    // Wrappers over above recursive functions
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
	
	public static void main(String[] args) {
		/*
		 * Depth First Traversals: 
		(a) Inorder (Left, Root, Right) : [4,2,5,1,6,3,7]
		(b) Preorder (Root, Left, Right) : [1,2,4,5,3,6,7]
		(c) Postorder (Left, Right, Root) : [4,5,2,6,7,3,1]
		Breadth-First or Level Order Traversal: 1 2 3 4 5 6 7
		                 1
		                / \
		               2   3
		              / \ / \
		             4  5 6  7
		 */
		
		TreeTraversals tree = new TreeTraversals();
        tree.root = new Node(6);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(2);
        tree.root.left.right.right = new Node(1);
        tree.root.right.left = new Node(0);
 
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printPreorder();
 
        System.out.println(
            "\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
		
		
	}

}
