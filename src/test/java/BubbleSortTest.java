import org.example.BubbleSort;
import org.example.SortAlgorithm;


public class BubbleSortTest extends OrderArrayBaseTest {

    @Override
    SortAlgorithm getSortAlgorithm() {
        return new BubbleSort();
    }
}


