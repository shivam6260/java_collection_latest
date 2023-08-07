package Sorting;

public class BubbleSort {
	public void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
	
	 static void bubbleSortRecursive(int arr[], int n)
	    {
	        if (n == 1)
	            return;
	      
	        // One pass of bubble sort. After
	        // this pass, the largest element
	        // is moved (or bubbled) to end.
	        for (int i=0; i<n-1; i++)
	            if (arr[i] > arr[i+1])
	            {
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	      
	        // Largest element is fixed,
	        // recur for remaining array
	        bubbleSortRecursive(arr, n-1);
	    }
	 
    // Function to print an array
    public void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        obj.printArray(arr, n);
    }

}
