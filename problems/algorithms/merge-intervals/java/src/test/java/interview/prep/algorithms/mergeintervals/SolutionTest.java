package interview.prep.algorithms.mergeintervals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergesOverlappingIntervals() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, Solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    void mergesTouchingIntervals() {
        assertArrayEquals(new int[][]{{1, 5}}, Solution.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    void preservesDisjointIntervals() {
        assertArrayEquals(new int[][]{{1, 2}, {5, 7}}, Solution.merge(new int[][]{{5, 7}, {1, 2}}));
    }
}
