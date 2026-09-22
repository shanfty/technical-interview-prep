package interview.prep.algorithms.targetsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsSignAssignments() {
        assertEquals(5, Solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    @Test
    void handlesSingleElement() {
        assertEquals(1, Solution.findTargetSumWays(new int[]{1}, 1));
        assertEquals(0, Solution.findTargetSumWays(new int[]{1}, 2));
    }

    @Test
    void handlesZeroTarget() {
        assertEquals(2, Solution.findTargetSumWays(new int[]{0, 0}, 0));
    }
}
