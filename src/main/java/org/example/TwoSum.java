package org.example;

import org.example.search.BinarySearch;
import org.example.sorting.BubbleSort;

public class TwoSum {
    /**
     * Should return the elements in the @array which, when summed, satisfy the @target param
     */
    public int[] execute(int[] array, int target) {
        // first I'll sort the array
        int[] sortedArray = new BubbleSort().execute(array);
        BinarySearch bs = new BinarySearch();

        // now I'll try to find an element in the array that satisfies the complement of the current number
        for (int i = 0; i < sortedArray.length; i++) {
            int currentValue = sortedArray[i];
            int complementIndex = bs.execute(sortedArray, target - currentValue, i);

            if(complementIndex != -1) return new int[]{array[i], array[complementIndex]};
        }

        return new int[]{-1, -1};
    }

}
