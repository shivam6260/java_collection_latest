package ArraysDemo;

import java.util.*;

public class ArraysSorting {
	public static void main(String[] args) {
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		
		

		// Sorting Arrays in Ascending Order
//		 Arrays.sort(arr);
//		 System.out.printf("Modified arr[] : %s",
//	                           Arrays.toString(arr));

		// Sorting Arrays in Descending Order
		// You cannot sort Primitive data using Custom Sort
//		 Integer[] brr = { 13, 7, 6, 45, 21, 9, 101, 102 };
//		 Arrays.sort(brr, Collections.reverseOrder());
//		 System.out.printf("Modified brr[] : %s",
//                 Arrays.toString(brr));

//		 Integer temp =5;
//		 System.out.println(temp);
//		 int a = temp;
//		 System.out.println(a);

		// Sorting the Array using Custom Comparator
//		 Integer[] crr = { 13, 7, 6, 45, 21, 9, 101, 102 };
//		 Arrays.sort(crr, new Comparator<Integer>() {
//	        	@Override
//	        	public int compare(Integer a,Integer b)
//	        	{
//	        		// Descending
//	        		return b - a;
//	        		
//	        		// Ascending
//	        		//return a - b;
//	        	}
//		});
//		 System.out.println(Arrays.toString(crr));

//		 Integer[] drr = {1,3,-2,5,-4,-6};
//		 Arrays.sort(drr, new Comparator<Integer>() {
//	        	@Override
//	        	public int compare(Integer a,Integer b)
//	        	{
//	        		// Yai sort karega uska square dekh kar -2 ka sq = 4 and 1 ka sq = 1 to sort hoga 1, -2 , 3, -4 , 5,-6
//	        		//return (a*a - b*b);
//	        		return b * b - a * a ;
//	        	}
//		});
//		 System.out.println(Arrays.toString(drr));

		// To Fill the Array with SAME Number
 
		int[] err = new int[10];
		Arrays.fill(err, -10);
		System.out.println(Arrays.toString(err));

		int[][] arr10 = { { 1, 2 }, { 3, 4 } };
		Integer[][] arr12 = { { 1, 2 }, { 3, 4 } };
		Arrays.sort(arr12, new Comparator<Integer[]>() {
			public int compare(Integer[] a1, Integer[] a2) {
				return a1[0] - a2[0];
			}
		});

		Arrays.sort(arr10, new Comparator<int[]>() {
			public int compare(int[] a1, int[] a2) {
				return a1[0] - a2[0];
			}
		});

	}

}
