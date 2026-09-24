package interview.prep.algorithms.coursescheduleii;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsValidDependencyOrder() {
        int[] result = Solution.findOrder(2, new int[][]{{1,0}});
        assertArrayEquals(new int[]{0,1}, result);
    }
    @Test void returnsEmptyForCycle() {
        assertEquals(0, Solution.findOrder(2, new int[][]{{1,0},{0,1}}).length);
    }
}

