//pq.size() return size of priority queue
package PriorityQueueDemo;

import java.util.*;

class Student {
	int math;
	int sst;
	int science;
	int average;

	public Student(int math, int science, int sst) {
		this.math = math;
		this.science = science;
		this.sst = sst;
		this.average = this.math + this.science + this.sst;
	}
}

public class PriorityQueueLearning {
	public static void main(String[] args) {
//		int arr[]  = {6,8,9,3,4,5,6};
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		
//		for(int i = 0;i<arr.length;i++)
//		{
//			pq.add(arr[i]);
//		}
//		while(!pq.isEmpty())
//		{
//			System.out.print(pq.poll() + " ");
//		}

//		int brr[] = { 7, 5, 8, 9, 9, 3, 4 };
//		
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
//			public int compare(Integer a, Integer b) {
//				return b - a;
//			}
//		});
//		for(int i=0;i<brr.length;i++)
//		{
//			pq.add(brr[i]);
//		}
//		while(!pq.isEmpty())
//		{
//			System.out.print(pq.poll() + " ");
//		}



		PriorityQueue<Student> pq = new PriorityQueue<Student>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if (s1.average == s2.average)
					return s2.math - s1.math;
				return s2.average - s1.average;
			}
		});

		pq.add(new Student(40, 50, 50));
		pq.add(new Student(80, 70, 50));
		pq.add(new Student(30, 50, 10));
		pq.add(new Student(70, 50, 50));
		pq.add(new Student(50, 40, 50));

		while (!pq.isEmpty()) {
			System.out.println(pq.poll().average);
		}
		

		// pq.contains(); Check wether that element is present or not in Priority Queue

	}

	

}
