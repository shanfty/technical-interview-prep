package interview.prep.algorithms.largestrectangleinhistogram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void findsLargestRectangle() {
        assertEquals(10, Solution.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
    @Test void handlesSingleBar() {
        assertEquals(4, Solution.largestRectangleArea(new int[]{4}));
    }
}

