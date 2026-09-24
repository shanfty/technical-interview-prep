package interview.prep.algorithms.besttimetobuyandsellstockwithcooldown;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void respectsCooldownBetweenSales() {
        assertEquals(3, Solution.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    @Test
    void oneDayHasNoProfit() {
        assertEquals(0, Solution.maxProfit(new int[]{1}));
    }

    @Test
    void descendingPricesHaveNoProfit() {
        assertEquals(0, Solution.maxProfit(new int[]{5, 4, 3, 2}));
    }
}
