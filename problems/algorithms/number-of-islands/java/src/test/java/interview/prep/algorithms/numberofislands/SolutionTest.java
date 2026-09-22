package interview.prep.algorithms.numberofislands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsFourDirectionalComponents() {
        char[][] grid = {{'1', '1', '0'}, {'0', '1', '0'}, {'0', '0', '1'}};
        assertEquals(2, Solution.numIslands(grid));
    }

    @Test
    void diagonalsDoNotConnectIslands() {
        char[][] grid = {{'1', '0'}, {'0', '1'}};
        assertEquals(2, Solution.numIslands(grid));
    }

    @Test
    void handlesAllWater() {
        assertEquals(0, Solution.numIslands(new char[][]{{'0', '0'}, {'0', '0'}}));
    }
}
