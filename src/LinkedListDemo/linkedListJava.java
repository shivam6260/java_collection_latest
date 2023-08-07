package LinkedListDemo;

class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class linkedListJava {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Node head = new Node(arr[0]);
		Node p = head;
		for(int i=1;i<arr.length;i++)
		{
			Node temp = new Node(arr[i]);
			p.next = temp;
			p = temp;
		}
		
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	

}
