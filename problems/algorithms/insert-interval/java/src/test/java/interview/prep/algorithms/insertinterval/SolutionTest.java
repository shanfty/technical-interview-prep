package interview.prep.algorithms.insertinterval;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergesOverlapInMiddle() {
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, Solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
    }

    @Test
    void mergesSeveralIntervals() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, Solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
    }

    @Test
    void insertsDisjointIntervalAtBeginning() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 5}}, Solution.insert(new int[][]{{3, 5}}, new int[]{1, 2}));
    }
}
