package interview.prep.algorithms.coinchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsFewestCoins() {
        assertEquals(3, Solution.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void reportsUnreachableAmount() {
        assertEquals(-1, Solution.coinChange(new int[]{2}, 3));
    }

    @Test
    void zeroAmountNeedsNoCoins() {
        assertEquals(0, Solution.coinChange(new int[]{1, 2, 5}, 0));
    }
}
