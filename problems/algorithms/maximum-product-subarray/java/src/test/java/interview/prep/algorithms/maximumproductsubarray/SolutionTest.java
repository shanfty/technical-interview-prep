package interview.prep.algorithms.maximumproductsubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsPositiveMaximum() {
        assertEquals(6, Solution.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    void handlesZeroAndNegativeValues() {
        assertEquals(0, Solution.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(24, Solution.maxProduct(new int[]{-2, 3, -4}));
    }

    @Test
    void handlesSingleElement() {
        assertEquals(-3, Solution.maxProduct(new int[]{-3}));
    }
}
