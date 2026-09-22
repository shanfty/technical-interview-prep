package interview.prep.algorithms.maximumsubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsBestMixedSubarray() {
        assertEquals(6, Solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void handlesAllPositiveValues() {
        assertEquals(23, Solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    @Test
    void choosesLargestSingleNegativeWhenAllAreNegative() {
        assertEquals(-1, Solution.maxSubArray(new int[]{-3, -1, -2}));
    }
}
