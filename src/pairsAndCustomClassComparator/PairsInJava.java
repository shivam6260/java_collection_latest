package pairsAndCustomClassComparator;
import java.io.*;
import java.util.*;

class Student {
    int rollno;
    String name, address;
    
    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    
    public String toString()
    {
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}




class Pairs {
	public int first;
	public int second;
	public Pairs(int first,int second)
	{
		this.first = first;
		this.second = second;
	}
	
}
public class PairsInJava {
	public static void main(String[] args) {
//		int arr[] = {13,45,13,87,13};
//		int brr[] = {37,56,39,51,79};
//		Pairs crr[] = new Pairs[arr.length];
//		for(int i=0;i<arr.length;i++)
//		{
//			crr[i] = new Pairs(arr[i],brr[i]);
//		}
		
//		Arrays.sort(crr, new Comparator<Pairs>() {
//            @Override public int compare(Pairs p1, Pairs p2)
//            {
//            	// Sorting in Ascending Order
//            	
//                //return p1.first - p2.first;
//            	//return p1.second - p2.second;
//            	
//            	// Sorting in Descending Order
//            	
//            	//return p2.second - p1.second ;
//            	//return p2.first - p1.first ;
//            	
//            	// Custom Sorting Logic
//            	if(p1.first == p2.first)
//            		return  p2.second - p1.second;
//            	return p1.first - p2.first;
//            	
//            }
//            
//        });
		
//		for(int i=0;i<crr.length;i++)
//		{
//			System.out.println(crr[i].first + " ,  " + crr[i].second);
//			System.out.println();
//		}
		
		
		Student[] err = new Student[3];
		err[0] = new Student(111, "bbbb", "london");
        err[1] = new Student(131, "aaaa", "nyc");
        err[2] = new Student(121, "cccc", "jaipur");
        
        
        //Sorting of Int
        Arrays.sort(err, new Comparator<Student>() {
        	@Override
        	public int compare(Student s1,Student s2)
        	{
        		return s2.rollno - s1.rollno;
        	}
		});
        
        Arrays.sort(err, new Comparator<Student>() {
        	@Override
        	public int compare(Student s1, Student s2)
        	{
        		return s2.name.compareTo(s1.name);
        	}
        });
        for(int i=0;i<3;i++)
        {
        	System.out.println(err[i]);
        }
		
	}
	
	
	
	
	
	

}
