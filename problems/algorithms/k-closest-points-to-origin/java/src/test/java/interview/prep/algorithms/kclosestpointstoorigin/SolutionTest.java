package interview.prep.algorithms.kclosestpointstoorigin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsKClosestPoints() {
        int[][] result = Solution.kClosest(new int[][]{{1,3},{-2,2}}, 1);
        assertEquals(1, result.length);
        assertEquals(-2, result[0][0]);
        assertEquals(2, result[0][1]);
    }
}

