/******************************************************************
 *
 *   Evan/ 002
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int[] list1, int[] list2) {
    // Store elements of list1 in a HashSet for quick lookups
    HashSet<Integer> lookupSet = new HashSet<>();
    
    int index = 0;
    while (index < list1.length) { 
        lookupSet.add(list1[index]); 
        index++;
    }

    // Check if all elements in list2 exist in the set
    for (int element : list2) {
        if (!lookupSet.contains(element)) {
            return false; // If any element is missing, it's not a subset
        }
    }

    return true; // All elements in list2 were found in list1
}



    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {

        Arrays.sort(array);
        return array[array.length - k];
    }


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] array1, int[] array2) {
    int totalSize = array1.length + array2.length;
    int[] combinedArray = new int[totalSize];

    // Insert elements from both arrays into the new array
    int index = 0;
    for (int num : array1) {
        combinedArray[index++] = num;
    }
    for (int num : array2) {
        combinedArray[index++] = num;
    }

    // Sort the merged array
    Arrays.sort(combinedArray);

    return combinedArray;
}


}
