package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

class Node {
	Node left;
	Node right;
	int data;
	
	public Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class creatingBinaryTree {
	static void inorder(Node temp)
    {
        if (temp == null)
            return;
 
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }
	
	static void insert(Node temp,int key)
	{
		if(temp == null)
		{
			temp = new Node(key);
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty())
		{
			temp = q.peek();
			q.remove();
			
			
			if(temp.left == null)
			{
				Node root = new Node(key);
				temp.left = root;
				break;
			}
			else
				q.add(temp.left);
			
			if(temp.right == null)
			{
				Node root = new Node(key);
				temp.right = root;
				break;
			}
			else q.add(temp.right);
		}
		
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(10);
	    root.left = new Node(11);
	    root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        
        System.out.print(
	            "Inorder traversal before insertion:");
        inorder(root);
        System.out.println(
	            "Inorder traversal After insertion:");
        
        insert(root,12);
        inorder(root);
	}
}















