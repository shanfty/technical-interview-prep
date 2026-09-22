package interview.prep.algorithms.uniquepathsii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsPathsAroundObstacle() {
        assertEquals(2, Solution.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    @Test
    void handlesSingleRoute() {
        assertEquals(1, Solution.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
    }

    @Test
    void reportsBlockedDestination() {
        assertEquals(0, Solution.uniquePathsWithObstacles(new int[][]{{0, 0}, {0, 1}}));
    }
}
