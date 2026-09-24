package interview.prep.algorithms.longestincreasingpathinamatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsLongestStrictlyIncreasingPath() {
        assertEquals(4, Solution.longestIncreasingPath(new int[][]{{9,9,4},{6,6,8},{2,1,1}}));
    }
}

