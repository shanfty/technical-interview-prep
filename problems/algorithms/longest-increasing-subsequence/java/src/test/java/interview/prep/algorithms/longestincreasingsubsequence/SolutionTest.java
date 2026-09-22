package interview.prep.algorithms.longestincreasingsubsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsNonContiguousIncreasingSubsequence() {
        assertEquals(4, Solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    void handlesMultipleCandidateRuns() {
        assertEquals(4, Solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    void repeatedValuesAreNotStrictlyIncreasing() {
        assertEquals(1, Solution.lengthOfLIS(new int[]{7, 7, 7, 7}));
    }
}
