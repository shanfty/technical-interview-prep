package interview.prep.algorithms.wallsandgates;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void fillsDistancesToNearestGate() {
        int inf = 2147483647;
        int[][] grid = {{inf,-1,0,inf},{inf,inf,inf,-1},{inf,-1,inf,-1},{0,-1,inf,inf}};
        Solution.islandsAndTreasure(grid);
        assertArrayEquals(new int[]{3,-1,0,1}, grid[0]);
        assertArrayEquals(new int[]{2,2,1,-1}, grid[1]);
    }
}

