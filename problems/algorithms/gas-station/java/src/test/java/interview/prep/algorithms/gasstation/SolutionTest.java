package interview.prep.algorithms.gasstation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsUniqueFeasibleStart() {
        assertEquals(3, Solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void reportsImpossibleCircuit() {
        assertEquals(-1, Solution.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    @Test
    void handlesSingleStation() {
        assertEquals(0, Solution.canCompleteCircuit(new int[]{5}, new int[]{5}));
    }
}
