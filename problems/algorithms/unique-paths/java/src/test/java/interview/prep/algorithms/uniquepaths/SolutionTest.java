package interview.prep.algorithms.uniquepaths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsRectangularGridPaths() {
        assertEquals(28, Solution.uniquePaths(3, 7));
        assertEquals(3, Solution.uniquePaths(3, 2));
    }

    @Test
    void singleCellHasOnePath() {
        assertEquals(1, Solution.uniquePaths(1, 1));
    }
}
