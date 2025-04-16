package org.example.sorting;

public class BubbleSort implements SortAlgorithm {

    @Override
    public int[] execute(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[j] < array[i]) swap(array, i, j);
            }
        }
        return array;
    }
}
