package org.example.search;

public class BinarySearch {

    /**
     * Assumes the array is sorted, then return the index of the target, otherwise -1
     *
     * @param array       the array to be searched
     * @param target      the target num
     * @param ignoreIndex if an index is to be ignored
     * @return the index of the target or -1
     */
    public int execute(int[] array, int target, int ignoreIndex) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) >>> 1; // divide by 2 in binary
            if (middle == ignoreIndex) {
                low++;
                continue;
            }
            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] > target) {
                high = middle - 1;
                continue;
            }
            if (array[middle] < target) {
                low = middle + 1;
            }
        }
        return -1;
    }

    public int execute(int[] array, int target) {
        return execute(array, target, -1);
    }

}
