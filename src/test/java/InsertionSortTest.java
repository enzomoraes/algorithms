import org.example.InsertionSort;
import org.example.SortAlgorithm;


public class InsertionSortTest extends OrderArrayBaseTest {

    @Override
    SortAlgorithm getSortAlgorithm() {
        return new InsertionSort();
    }
}


