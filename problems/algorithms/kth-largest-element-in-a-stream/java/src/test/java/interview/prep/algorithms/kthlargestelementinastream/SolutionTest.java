package interview.prep.algorithms.kthlargestelementinastream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsKthLargestAfterEachAddition() {
        Solution.KthLargest k = new Solution.KthLargest(3, new int[]{4,5,8,2});
        assertEquals(4, k.add(3));
        assertEquals(5, k.add(10));
    }
}

