package interview.prep.algorithms.containerwithmostwater;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsMaximumContainer() {
        assertEquals(49, Solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void handlesMinimumInput() {
        assertEquals(1, Solution.maxArea(new int[]{1, 1}));
    }

    @Test
    void handlesMonotonicHeights() {
        assertEquals(6, Solution.maxArea(new int[]{1, 2, 3, 4}));
    }
}
