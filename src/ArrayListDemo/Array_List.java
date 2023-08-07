package ArrayListDemo;

import java.util.*;

/*
 * ArrayList	LinkedList
1) ArrayList internally uses a dynamic array to store the elements.	
2) Manipulation with ArrayList is slow because it internally uses an array. 
If any element is removed from the array, all the bits are shifted in memory.	
3) An ArrayList class can act as a list only because it implements List only.	
4) ArrayList is better for storing and accessing data.	


1- LinkedList internally uses a doubly linked list to store the elements.
2- Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, 
so no bit shifting is required in memory.
3- LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4- LinkedList is better for manipulating data.
 */

class Twins {
	int a;
	int b;

	public Twins(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return this.a + " " + this.b;
	}
}

public class Array_List {
	public static void main(String[] args) {

//		To Initialise an ArrayList
//		 ArrayList<String> gfg = new ArrayList<String>(
//		            Arrays.asList("Geeks",
//		                          "for",
//		                          "Geeks"));

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			arr.add(i);
		}
		
//		for(int i=0;i<arr.size();i++)
//		{
//			System.out.println(arr.get(i));
//		}

//		ArrayList<Integer> brr = new ArrayList<Integer>();
//		
//		for(int i=0;i<5;i++)
//		{
//			brr.add(i);
//		}
//		//   Adding element at a particular index
//		//brr.add(0,100);
//		
//		// Modifying element at a particular index
//		//brr.set(4,-30);
//		
//		// Ascending Order Sorting
//		Collections.sort(brr);
//		
//		// Descending Order Sorting
//		Collections.sort(brr, Collections.reverseOrder());
//		for(int i=0;i<brr.size();i++)
//		{
//			System.out.println(brr.get(i));
//		}

		// Size 60 with All Elements 10. Just like vector<int> v(60,10)
//		List<Integer> drr = new ArrayList<Integer>(Collections.nCopies(60, 10));
//		System.out.println(drr.get(60));

		List<Twins> err = new ArrayList<Twins>();
		for (int i = 1; i <= 10; i++) {
			Twins obj = new Twins(i, i + 100);
			err.add(obj);
		}

		Collections.sort(err, new Comparator<Twins>() {
			@Override
			public int compare(Twins t1, Twins t2) {
				return t2.a - t2.b;
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.println(err.get(i));
		}

	}

}
