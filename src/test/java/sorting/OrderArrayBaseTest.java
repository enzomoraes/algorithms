package sorting;

import org.example.sorting.SortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public abstract class OrderArrayBaseTest {

    abstract SortAlgorithm getSortAlgorithm();

    private final int[] toBeOrdered = {45, 9, 4, 90, 3, 3, 1, 33};

    @Test
    public void should_order_elements() {
        assertArrayEquals(new int[]{1, 3, 3, 4, 9, 33, 45, 90}, getSortAlgorithm().execute(toBeOrdered));
    }
}


