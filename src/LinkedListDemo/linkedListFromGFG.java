package LinkedListDemo;

public class linkedListFromGFG {
	 Node head; // head of list
	 
	    /* Linked list Node.  This inner class is made static so that
	       main() can access it */
	 static class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        } 
	    }
	 
	 
	 public static void main(String[] args) {
		 int arr[] = {1,2,3,4,5,6};
		 linkedListFromGFG llist = new linkedListFromGFG();
		 llist.head = new Node(arr[0]);
		 Node p = llist.head;
		 for(int i=1;i<arr.length;i++)
		 {
			 Node temp = new Node(arr[i]);
			 p.next = temp;
			 p = temp;
		 }
		 while(llist.head != null)
		 {
			 System.out.println(llist.head.data);
			 llist.head = llist.head.next;
		 }
		 
		 
	}

}
