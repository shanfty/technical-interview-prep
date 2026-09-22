package interview.prep.algorithms.trappingrainwater;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void measuresMultipleBasins() {
        assertEquals(6, Solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void measuresSecondExample() {
        assertEquals(9, Solution.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    @Test
    void monotonicHeightsTrapNothing() {
        assertEquals(0, Solution.trap(new int[]{1, 2, 3, 4}));
    }
}
