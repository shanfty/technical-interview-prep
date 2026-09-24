package interview.prep.algorithms.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsInteriorValue() {
        assertEquals(4, Solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void returnsMinusOneWhenAbsent() {
        assertEquals(-1, Solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void handlesSingleElementBoundaries() {
        assertEquals(0, Solution.search(new int[]{5}, 5));
        assertEquals(-1, Solution.search(new int[]{5}, 4));
    }
}
