package interview.prep.algorithms.reverseinteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reversesPositiveAndNegativeValues() {
        assertEquals(321, Solution.reverse(123));
        assertEquals(-321, Solution.reverse(-123));
    }

    @Test
    void removesLeadingZeroesAfterReversal() {
        assertEquals(21, Solution.reverse(120));
    }

    @Test
    void returnsZeroOnOverflow() {
        assertEquals(0, Solution.reverse(1534236469));
    }
}
