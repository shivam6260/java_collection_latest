package Sorting;

public class InsertionSort {
	void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
	
	static void insertionSortRecursive(int arr[], int n)
    {
        if (n <= 1)
            return;
        
        insertionSortRecursive( arr, n-1 );
        
        int last = arr[n-1];
        int j = n-2;
      
        
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
	
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
    
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        InsertionSort ob = new InsertionSort();
        insertionSortRecursive(arr,5);
        //ob.sort(arr);
 
        printArray(arr);
    }

}
