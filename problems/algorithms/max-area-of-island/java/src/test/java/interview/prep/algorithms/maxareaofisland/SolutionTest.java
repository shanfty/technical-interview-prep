package interview.prep.algorithms.maxareaofisland;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsLargestFourDirectionalComponent() {
        int[][] grid = {{0, 0, 0}, {0, 1, 1}, {0, 1, 0}};
        assertEquals(3, Solution.maxAreaOfIsland(grid));
    }

    @Test
    void ignoresDiagonalContact() {
        assertEquals(1, Solution.maxAreaOfIsland(new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    void handlesAllWater() {
        assertEquals(0, Solution.maxAreaOfIsland(new int[][]{{0, 0}, {0, 0}}));
    }
}
