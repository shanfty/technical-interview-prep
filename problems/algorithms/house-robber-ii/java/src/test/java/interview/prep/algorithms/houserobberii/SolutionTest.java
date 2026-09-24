package interview.prep.algorithms.houserobberii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void respectsFirstLastAdjacency() {
        assertEquals(3, Solution.rob(new int[]{2, 3, 2}));
    }

    @Test
    void choosesBestNonAdjacentSet() {
        assertEquals(4, Solution.rob(new int[]{1, 2, 3, 1}));
        assertEquals(3, Solution.rob(new int[]{1, 2, 3}));
    }

    @Test
    void handlesSingleHouse() {
        assertEquals(5, Solution.rob(new int[]{5}));
    }
}
