package Algorithms;

public class Search {

    /**
     * Performs a linear search on the given array to find the target element.
     *
     * @param array  The array to search through.
     * @param target The value to search for.
     * @return The index of the target if found; otherwise, -1.

     * Time Complexity:
     * - Worst Case: O(n) -> The target is at the last index or not present at all.

     * Explanation:
     * Linear search examines each element one by one.
     * If the array has 'n' elements, the algorithm may need to check up to 'n' elements in the worst case.
     */
    public static int linearSearch(int[] array, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the target
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        // Return -1 if the target is not found in the array
        return -1;
    }
    /**
     * Performs a binary search on a sorted array to find the target element.

     * Binary search is a highly efficient algorithm that repeatedly divides the
     * search range in half. This significantly reduces the number of comparisons
     * needed compared to linear search.

     * @param array  The sorted array to search through.
     * @param target The value to search for.
     * @return The index of the target if found; otherwise, -1.

     * Time Complexity:
            * - Worst Case: O(log n)
     *The search range is halved repeatedly until the target is found
     */

    public static int binarySearch(int[] array, int target) {
        int left = 0; // Initialize the left boundary of the search range
        int right = array.length - 1; // Initialize the right boundary of the search range

        while (left <= right) {
            // Calculate the middle index to avoid overflow
            int mid = left + (right - left) / 2;

            // Check if the target is at the middle index
            if (array[mid] == target) {
                return mid; // Target found, return its index
            }

            // If the target is greater, ignore the left half
            if (target > array[mid]) {
                left = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

}