package interview.prep.algorithms.mincosttoconnectallpoints;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void computesExampleMinimumCost() {
        assertEquals(20, Solution.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}));
    }

    @Test
    void connectsTwoPointsByManhattanDistance() {
        assertEquals(2, Solution.minCostConnectPoints(new int[][]{{0, 0}, {1, 1}}));
    }

    @Test
    void onePointNeedsNoConnection() {
        assertEquals(0, Solution.minCostConnectPoints(new int[][]{{4, 7}}));
    }
}
