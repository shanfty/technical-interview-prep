package interview.prep.algorithms.networkdelaytime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsTimeForLastReachableNode() {
        assertEquals(2, Solution.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
    }

    @Test
    void returnsMinusOneWhenNodeIsUnreachable() {
        assertEquals(-1, Solution.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2));
    }

    @Test
    void singleNodeNeedsNoTravel() {
        assertEquals(0, Solution.networkDelayTime(new int[][]{}, 1, 1));
    }
}
