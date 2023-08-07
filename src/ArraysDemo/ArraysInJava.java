package ArraysDemo;

public class ArraysInJava {
	public static void main(String[] args) {
		
//		int[] arr = new int[20];
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		// Output = All Zero
//		The elements in the array allocated by new will automatically be initialized 
//		to zero (for numeric types), false (for boolean), or null (for reference types)
		
		
//      To Pass Arr in Function.
//	    int arr[] = {3, 1, 2, 5, 4};
//      int res  = sum(arr);
//      System.out.println(res);
		
		// Java Hamesha Pass by Value hi hota, Isme hota kya ki humlog reference wala address ko copy hoke pass hota.
      
      //Pass by Reference
//      int brr[] = {1,2,3,4,5};
      
//      for(int i=0;i<brr.length;i++)
//      {
//    	  System.out.println(brr[i]);
//      }
//      modify(brr);
//      System.out.println();
//      for(int i=0;i<brr.length;i++)
//      {
//    	  System.out.println(brr[i]);
//      }
      
 
	
      
	}
	
	public static void modify(int[] brr)
	{
		brr[1] = 100;
	}
	
	public static int sum(int[] arr) {
		int res = 0;
		for(int it : arr)
		{
			res = res + it;
		}
		return res;
		
	}

}




// This is the Best Explanation for Pass by Value, In java we pass the copy of the Reference

//public static void main(String[] args) {
//    Dog aDog = new Dog("Max");
//    Dog oldDog = aDog;
//
//    // we pass the object to foo
//    foo(aDog);
//    // aDog variable is still pointing to the "Max" dog when foo(...) returns
//    aDog.getName().equals("Max"); // true
//    aDog.getName().equals("Fifi"); // false
//    aDog == oldDog; // true
//}
//
//public static void foo(Dog d) {
//    d.getName().equals("Max"); // true
//    // change d inside of foo() to point to a new Dog instance "Fifi"
//    d = new Dog("Fifi");
//    d.getName().equals("Fifi"); // true
//}