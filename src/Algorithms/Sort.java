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

}
