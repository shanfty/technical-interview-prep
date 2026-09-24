package interview.prep.algorithms.mincostclimbingstairs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsMinimumCost() {
        assertEquals(15, Solution.minCostClimbingStairs(new int[]{10,15,20}));
    }
}

