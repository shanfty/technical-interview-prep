package interview.prep.algorithms.besttimetobuyandsellstock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsBestProfit() {
        assertEquals(5, Solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void returnsZeroWhenPricesOnlyFall() {
        assertEquals(0, Solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void respectsBuyBeforeSellOrder() {
        assertEquals(2, Solution.maxProfit(new int[]{2, 4, 1}));
    }
}
