package interview.prep.algorithms.setmatrixzeroes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void zerosAffectedRowsAndColumns() {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        Solution.setZeroes(matrix);
        assertArrayEquals(new int[][]{{1,0,1},{0,0,0},{1,0,1}}, matrix);
    }
    @Test void handlesMultipleZeros() {
        int[][] matrix = {{0,1},{1,1}};
        Solution.setZeroes(matrix);
        assertArrayEquals(new int[][]{{0,0},{0,1}}, matrix);
    }
}

