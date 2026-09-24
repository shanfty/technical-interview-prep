package interview.prep.algorithms.searcha2dmatrix;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private static final int[][] MATRIX = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

    @Test
    void findsValueInFirstAndLastRows() {
        assertTrue(Solution.searchMatrix(MATRIX, 3));
        assertTrue(Solution.searchMatrix(MATRIX, 60));
    }

    @Test
    void rejectsValueBetweenRows() {
        assertFalse(Solution.searchMatrix(MATRIX, 13));
    }

    @Test
    void handlesSingleCellMatrix() {
        assertTrue(Solution.searchMatrix(new int[][]{{5}}, 5));
        assertFalse(Solution.searchMatrix(new int[][]{{5}}, 4));
    }
}
