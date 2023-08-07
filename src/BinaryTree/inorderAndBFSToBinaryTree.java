package BinaryTree;

public class inorderAndBFSToBinaryTree {
	// Article Link = https://www.geeksforgeeks.org/construct-tree-inorder-level-order-traversals/
	// Question Link = https://practice.geeksforgeeks.org/problems/construct-tree-from-inorder-and-levelorder/1/#
	public static void main(String[] args) {
		
		/*
		 * Once you track the Question with Example it is easy for you
		 *  in[]    = {4, 8, 10, 12, 14, 20, 22};
			level[] = {20, 8, 22, 4, 12, 10, 14};
		 */
		
	}
	
	Node buildTree(int inord[], int level[])
    {
        return tree(inord,level,0,inord.length-1);
    }
    
    Node tree(int inord[], int level[] , int left, int right)
    {
        Node root = null;
        if(left > right)
            return null;
        if(left == right)
            return new Node(inord[left]);
        int index = -1;
        loop : for(int i=0;i<level.length;i++)
        {
            int data = level[i];
            for(int j = left;j<=right;j++)
            {
                if(inord[j] == data)
                {
                    root = new Node(data);
                    index = j;
                    break loop;
                }
            }
        }
        
        root.setLeft(tree(inord,level,left,index-1));
        root.setRight(tree(inord,level,index + 1 , right));
        return root;
        
    }
}
