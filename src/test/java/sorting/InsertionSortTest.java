package sorting;

import org.example.sorting.InsertionSort;
import org.example.sorting.SortAlgorithm;


public class InsertionSortTest extends OrderArrayBaseTest {

    @Override
    SortAlgorithm getSortAlgorithm() {
        return new InsertionSort();
    }
}


