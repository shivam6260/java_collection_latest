package Theory;

public class Differences {
	public static void main(String[] args) {

	}

}
/*
 * ArrayList Vector
 * 
 * 1) ArrayList is not synchronized. Vector is synchronized.
 * 
 * 2) ArrayList is not a legacy class. Vector is a legacy class.
 * 
 * 
 * 3) ArrayList is faster than vector operations because it is non-synchronized,
 * but vector operations are slower since they are synchronized (thread-safe).
 */

/*
 * ArrayList LinkedList
 * 
 * 1) ArrayList uses a dynamic array. LinkedList uses a doubly linked list.
 * 
 * 2) ArrayList is not efficient for manipulation because too much is required.
 * LinkedList is efficient for manipulation.
 * 
 * 3) ArrayList is better to store and fetch data. LinkedList is better to
 * manipulate data.
 * 
 * 
 * 4) ArrayList provides random access. LinkedList does not provide random
 * access.
 * 
 * 5) An ArrayList class can act as a list only because it implements List
 * only.LinkedList class can act as a list and queue both because it implements
 * List and Deque interfaces.
 */

/*
 * Iterator ListIterator
 * 
 * 1) The Iterator traverses the elements in the forward direction only.
 * ListIterator traverses the elements in backward and forward directions both.
 * 
 * 2) The Iterator can be used in List, Set, and Queue. ListIterator can be used
 * in List only.
 * 
 * 3) The Iterator can only perform remove operation while traversing the
 * collection. ListIterator can perform add, remove and set operation while
 * traversing the collection.
 */

/*
 * List and Set
 * 
 * The List can contain duplicate elements whereas Set includes unique items.
 * 
 * The List is an ordered collection which maintains the insertion order whereas
 * Set is an unordered collection which does not preserve the insertion order.
 * 
 * The List interface can allow n number of null values whereas Set interface
 * only allows a single null value.
 * 
 * In List Elements can be accessed based on their position.Access to items from
 * a certain position is not permitted.
 */

/*
 * HashSet and TreeSet
 * 
 * 1 -HashSet maintains no order whereas TreeSet maintains ascending order.
 * 
 * 2 -HashSet impended by hash table whereas TreeSet implemented by a Tree
 * structure. HashSet performs faster than TreeSet.
 * 
 * 3 -HashSet is backed by HashMap whereas TreeSet is backed by TreeMap.
 */

/*
 * 
 * Set and Map
 * 
 * 1 - Set contains values only whereas Map contains key and values both.
 * 
 * 2 - Set contains unique values whereas Map can contain unique Keys with
 * duplicate values.
 * 
 * 3 - Set holds a single number of null value whereas Map can include a single
 * null key with n number of null values.
 */

/*
 * HashSet and HashMap
 * 
 * 1 - HashSet contains only values whereas HashMap includes the entry (key,
 * value).
 * 
 * 2 - HashSet implements Set interface whereas HashMap implements the Map
 * interface
 * 
 * 3 - HashSet cannot have any duplicate value whereas HashMap can contain
 * duplicate values with unique keys.
 * 
 * 4 - HashSet contains the only single number of null value whereas HashMap can
 * hold a single null key with n number of null values.
 */

/*
 * HashMap and TreeMap
 * 
 * 1 - HashMap maintains no order, but TreeMap maintains ascending order.
 * 
 * 2 - HashMap is implemented by hash table whereas TreeMap is implemented by a
 * Tree structure.
 * 
 * 3 - HashMap can be sorted by Key or value whereas TreeMap can be sorted by
 * Key.
 * 
 * 4 - HashMap may contain a null key with multiple null values whereas TreeMap
 * cannot hold a null key but can have multiple null values.
 */

/*
 * Collection and Collections
 * 
 * 1 - The Collection is an interface whereas Collections is a class.
 * 
 * 2 - The Collection interface provides the standard functionality of data
 * structure to List, Set, and Queue. However, Collections class is to sort and
 * synchronize the collection elements.
 * 
 * 3 - The Collection interface provides the methods that can be used for data
 * structure whereas Collections class provides the static methods which can be
 * used for various operation on a collection.
 */

/*
 * Comparable and Comparator Interface
 * 
 * 1) Comparable provides only one sort of sequence. The Comparator provides
 * multiple sorts of sequences.
 * 
 * 2) It provides one method named compareTo(). It provides one method named
 * compare().
 * 
 * 3) It is found in java.lang package. It is located in java.util package.
 */

/*
 * Fail-Fast Fail-Safe
 * 
 * 1 - Fail-Fast iterators do not allow modifying the collection while iterating
 * over it. Fail-safe iterators allow modifying the collection while iterating
 * over it.
 * 
 * 2 - Fail-Fast throws ConcurrentModificationException if the collection is
 * modified while iterating over it. In Fail-safe No exception is thrown if the
 * collection is modified while iterating over it.
 * 
 * 3 - Fail-Fast uses the original collection while traversing the elements.
 * Fail-Safe uses a copy of the original collection while traversing over it.
 * 
 * 4 - No extra memory is required in this case. Extra memory is required in
 * this case.
 */
