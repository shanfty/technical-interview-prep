package interview.prep.algorithms.houserobber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void choosesNonAdjacentHouses() {
        assertEquals(4, Solution.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, Solution.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void handlesEmptyAndSingletonInputs() {
        assertEquals(0, Solution.rob(new int[]{}));
        assertEquals(5, Solution.rob(new int[]{5}));
    }
}
