import org.example.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private final int[] entry = {2, 1, 0, -5, 7, -3, 12, 21};

    @Test
    public void should_find_correct_indexes() {
        TwoSum algorithm = new TwoSum();
        int[] result = algorithm.execute(entry, 13);

        assertArrayEquals(new int[]{1, 12}, result);
    }

    @Test
    public void should_return_invalid_indexes() {
        TwoSum algorithm = new TwoSum();
        int[] result = algorithm.execute(entry, 999);

        assertArrayEquals(new int[]{-1, -1}, result);
    }
}