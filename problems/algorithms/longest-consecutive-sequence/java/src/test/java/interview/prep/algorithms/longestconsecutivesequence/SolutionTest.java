package interview.prep.algorithms.longestconsecutivesequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsUnsortedConsecutiveRun() {
        assertEquals(4, Solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    void handlesLongRunWithDuplicates() {
        assertEquals(9, Solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    void handlesEmptyArray() {
        assertEquals(0, Solution.longestConsecutive(new int[]{}));
    }
}
