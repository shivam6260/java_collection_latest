package BinaryTree;

import java.util.*;

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}

public class deletingBinaryTree {
	
	// Exact Question Link - https://practice.geeksforgeeks.org/problems/deletion-in-a-binary-tree/1/#
	
	public Node deletionBT(Node root, int key){
		
		if(root==null)
			return null;
		if(root.left==null && root.right==null && root.data==key)
	        return null;
	    if(root.left==null && root.right==null )
	        return root;
	    
	    Node parent=null,last=null,deleted=null;
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(root);
	    while(!q.isEmpty())
	    {
	    	Node cur = q.poll();
                if(cur.data==key){
                    deleted=cur;
                }
                if(cur.left!=null){
                    parent=cur;
                    last=cur.left;
                    q.add(last);
                }
                if(cur.right!=null){
                    parent=cur;
                    last=cur.right;
                    q.add(last);
                }
        }
	    if(deleted!=null){
            deleted.data=last.data;
            if(parent.right!=null)
            parent.right=null;
            else
            parent.left=null;
        }
        return root; 
	}
	public static void main(String[] args) {
		
	}
	

}
