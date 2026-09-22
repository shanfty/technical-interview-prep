package interview.prep.algorithms.topkfrequentelements;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsMostFrequentElementsRegardlessOfOrder() {
        int[] result = Solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(result);
        assertEquals(2, result.length);
        assertTrue(Arrays.equals(new int[]{1, 2}, result));
    }

    @Test
    void handlesSingleDistinctValue() {
        assertEquals(1, Solution.topKFrequent(new int[]{1}, 1).length);
        assertEquals(1, Solution.topKFrequent(new int[]{1}, 1)[0]);
    }
}
