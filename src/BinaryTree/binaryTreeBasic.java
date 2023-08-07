package BinaryTree;

public class binaryTreeBasic {
	public static void main(String[] args) {
		
		// No of Binary tree for a given node (For Unlabelled Node) = 
		// n = 5 = (2*nCn)/(n+1);
		
		// No of Binary tree for a given node (For labelled Node) = 
	    // n = 5 = ((2*nCn)/(n+1)) * n!;
		
		
		// If height h is given then 
		// min node = h + 1;
		// max node = 2pow(h+1) - 1;
		
		// If n node is given then
		// max height = n - 1;
		// min height = log(base 2)(n+1) - 1
		
		// In Binary tree
		// Number of node having deg(0) = deg(2) + 1
		// Binary tree either have deg(0) or deg(1) or max deg(2);
		
		
		// Strict Binary Tree - No deg(1) Node
		// In case of Strict Binary tree
		
		// If height h is given then 
		// min node =  (2 * h) + 1;
		// max node = 2pow(h+1) - 1;
		
		// If n node is given then
		// max height = (n - 1) / 2;
		// min height = log(base 2)(n+1) - 1
		
		
		
		// Array Representation of Binary tree
		// BFS Traversal
		//     A
		//    / \
		//   B   C
		//  / \  / \
		// D  E  F  G
		// arr = [A,B,C,D,E,F,G]
		// Index [1,2,3,4,5,6,7]
		//
		// If element at i
		// Left child - 2 * i;
		// Right child- (2 * i) + 1;
		
		
		
		
		
		
	}

}





