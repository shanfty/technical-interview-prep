package interview.prep.algorithms.slidingwindowmaximum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsEachWindowMaximum() {
        assertArrayEquals(new int[]{3,3,5,5,6,7}, Solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }

    @Test void handlesWindowOfOneAndNegativeValues() {
        assertArrayEquals(new int[]{-1,-2,-3}, Solution.maxSlidingWindow(new int[]{-1,-2,-3}, 1));
    }
}

