package interview.prep.algorithms.redundantconnection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsCycleClosingEdge() {
        assertArrayEquals(new int[]{2, 3}, Solution.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}}));
    }

    @Test
    void returnsLastEdgeThatCreatesCycle() {
        assertArrayEquals(new int[]{1, 4}, Solution.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}));
    }
}
