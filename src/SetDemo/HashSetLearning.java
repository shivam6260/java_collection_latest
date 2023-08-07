package SetDemo;
import java.util.*;

public class HashSetLearning {
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4};
		Integer brr[] = {1,2,2,3,3,4};
		Set<Integer> hs = new HashSet<Integer>();
		Set<Long> hs1 = new HashSet<Long>();
		// One way of adding all the elements to set is this
		//hs.addAll(Arrays.asList(brr));  
		
		for(int i=0;i<arr.length;i++)
			hs.add(arr[i]);
		
		
		//System.out.println(hs.size());
		
		// To Iterate set
//		for(int itr : hs)
//		{
//			System.out.println(itr);
//		}
		
		//To check any value present in set or not
//		boolean res = hs.contains(12);
//		System.out.println(res);
		
		hs.remove(21);
		System.out.println(hs);
		
	}

}


/*
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 
public class SortJavaHashSetExample {
    
    public static void main(String[] args) {
        
        Set<Integer> hSetNumbers = new HashSet<Integer>();
        
        hSetNumbers.add(43);
        hSetNumbers.add(14);
        hSetNumbers.add(21);
        hSetNumbers.add(33);
 
        System.out.println("HashSet contains: " + hSetNumbers);
        TreeSet<Integer> treeSetNumbers = new TreeSet<Integer>(hSetNumbers);
        
        System.out.println("Sorted HashSet: " + treeSetNumbers);
    }
}

*/

//How to sort HashSet of custom class objects?

/*

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 
class Subject{
    
    private int subjectId;
    
    public Subject(int subjectId){
        this.subjectId = subjectId;
    }
    
    public String toString(){
        return "Subject: " + this.subjectId;
    }
    
    public int getSubjectId(){
        return this.subjectId;
    }
}
 

class SubjectComparator implements Comparator<Subject>{
    public int compare(Subject s1, Subject s2) {
        return s1.getSubjectId() - s2.getSubjectId();
    }    
}
 

class SubjectComparatorDescending implements Comparator<Subject>{
 
    
    public int compare(Subject s1, Subject s2) {
        return s2.getSubjectId() - s1.getSubjectId();
    }    
}
 
public class SortJavaHashSetExample {
    
    public static void main(String[] args) {
        
        Set<Subject> hSetSubjects = new HashSet<Subject>();
        
        hSetSubjects.add( new Subject(2) );
        hSetSubjects.add( new Subject(4) );
        hSetSubjects.add( new Subject(3) );
        hSetSubjects.add( new Subject(5) );
        hSetSubjects.add( new Subject(1) );
        
        System.out.println("HashSet contains: ");
        System.out.println(hSetSubjects);
        
        TreeSet<Subject> treeSetSubjectsAsc = new TreeSet<Subject>(new SubjectComparator());
        
        //add all elements of HashSet to TreeSet
        treeSetSubjectsAsc.addAll(hSetSubjects);
        
        System.out.println("Sorted HashSet in ascending order: ");
        System.out.println(treeSetSubjectsAsc);
        
        //similarly, sort HashSet in descending order
        TreeSet<Subject> treeSetSubjectsDesc = new TreeSet<Subject>(new SubjectComparatorDescending());
        treeSetSubjectsDesc.addAll(hSetSubjects);
        
        System.out.println("Sorted HashSet in descending order: ");
        System.out.println(treeSetSubjectsDesc);
    }
}

*/















