package sorting;

import org.example.sorting.BubbleSort;
import org.example.sorting.SortAlgorithm;


public class BubbleSortTest extends OrderArrayBaseTest {

    @Override
    SortAlgorithm getSortAlgorithm() {
        return new BubbleSort();
    }
}


