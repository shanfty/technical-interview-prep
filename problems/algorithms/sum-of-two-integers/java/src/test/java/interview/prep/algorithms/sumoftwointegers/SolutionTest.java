package interview.prep.algorithms.sumoftwointegers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addsPositiveValues() {
        assertEquals(3, Solution.getSum(1, 2));
        assertEquals(5, Solution.getSum(2, 3));
    }

    @Test
    void handlesNegativeAndZeroValues() {
        assertEquals(0, Solution.getSum(-4, 4));
        assertEquals(-7, Solution.getSum(-3, -4));
    }
}
