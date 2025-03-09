package org.example;

public interface SortAlgorithm {

    public int[] execute(int[] array);

    default void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
