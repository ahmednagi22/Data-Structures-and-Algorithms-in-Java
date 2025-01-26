package Algorithms;

public class Sort {

    /**
     * Sorts an array of integers in ascending order using the Insertion Sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void insertionSort(int[] array){

        // Traverse through the array from the second element
        for (int i = 1; i < array.length; i++) {
            // Store the current element to be compared
            int key = array[i];

            // Initialize the index of the previous element
            int j = i-1;

            // Shift elements of the sorted portion that are greater than the key
            // to one position ahead of their current position
            while(j >= 0 && array[j] > key){
             array[j+1] = array[j];
             j--;
            }

            // Place the key in its correct position
            array[j+1] = key;
        }
    }

    /**
     * Sorts an array in ascending order using the Bubble Sort algorithm.
     * Bubble Sort repeatedly steps through the list, compares adjacent elements,
     * and swaps them if they are in the wrong order.
     *
     * @param array the array to be sorted
     */
    public static void bubbleSort(int[] array) {
        int n = array.length; // Length of the array

        // Outer loop for the number of passes
        // After each pass, the largest element in the unsorted portion is placed at its correct position
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements in the unsorted portion
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];       // Temporary variable to hold the current element
                    array[j] = array[j + 1];  // Move the next element to the current position
                    array[j + 1] = temp;      // Place the current element in the next position
                }
            }
        }
    }

    /**
     * Sorts an array in ascending order using the Selection Sort algorithm.
     * Selection Sort works by repeatedly finding the minimum element in the unsorted portion
     * and placing it at the beginning.
     *
     * @param array the array to be sorted
     */
    public static void selectionSort(int[] array) {
        int n = array.length; // Length of the array

        // Outer loop: Iterate through each position in the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current position has the minimum value

            // Inner loop: Find the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }
            // Swap the current element with the smallest element found
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // Base case: array is already sorted

        int mid = length / 2;

        // Split the array into left and right halves
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        // Populate left and right arrays
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            rightArray[i - mid] = array[i];
        }

        // Recursively sort both halves
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted halves
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, l = 0, r = 0;

        // Merge elements from leftArray and rightArray into array
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] <= rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }
        }

        // Copy remaining elements from leftArray (if any)
        while (l < leftSize) {
            array[i++] = leftArray[l++];
        }

        // Copy remaining elements from rightArray (if any)
        while (r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }

    public static void quickSort(int[] array, int start, int end){

        if(end <= start)return; // base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if(array[j] < pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i]=temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end]=temp;
        return i;

    }
}


