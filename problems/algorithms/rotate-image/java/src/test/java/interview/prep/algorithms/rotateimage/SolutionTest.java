package interview.prep.algorithms.rotateimage;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void rotatesThreeByThreeMatrixClockwise() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        Solution.rotate(m);
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}}, m);
    }
}

