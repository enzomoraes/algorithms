package search;

import org.example.search.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void should_find_target_element() {
        int[] array = {1, 3, 5, 6, 7, 99, 1001};
        BinarySearch bs = new BinarySearch();
        int index = bs.execute(array, array[4]);

        assertEquals(4, index);
    }

    @Test
    public void should_not_find_find_element() {
        int[] array = {-5, -3, 0, 1, 2, 7, 12, 21};
        BinarySearch bs = new BinarySearch();
        int index = bs.execute(array, 18);

        assertEquals(-1, index);
    }

    @Test
    public void should_ignore_index() {
        int[] arrayWithDuplicates = {1, 3, 5, 6, 6, 7, 99, 1001};
        BinarySearch bs = new BinarySearch();
        int index = bs.execute(arrayWithDuplicates, arrayWithDuplicates[4], 3);

        assertEquals(4, index);
    }

}
