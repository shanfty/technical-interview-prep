package interview.prep.algorithms.nonoverlappingintervals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removesMinimumOverlappingIntervals() {
        assertEquals(1, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
    }

    @Test
    void handlesIdenticalIntervals() {
        assertEquals(2, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
    }

    @Test
    void allowsTouchingIntervals() {
        assertEquals(0, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }
}
