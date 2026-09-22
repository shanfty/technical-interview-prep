package interview.prep.algorithms.singlenumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsUnpairedValue() {
        assertEquals(1, Solution.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, Solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void handlesSingletonArray() {
        assertEquals(1, Solution.singleNumber(new int[]{1}));
    }
}
