package interview.prep.algorithms.maximumsumcircularsubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsNonWrappingMaximum() {
        assertEquals(3, Solution.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
    }

    @Test
    void findsWrappingMaximum() {
        assertEquals(10, Solution.maxSubarraySumCircular(new int[]{5, -3, 5}));
    }

    @Test
    void handlesAllNegativeValues() {
        assertEquals(-2, Solution.maxSubarraySumCircular(new int[]{-3, -2, -3}));
    }
}
