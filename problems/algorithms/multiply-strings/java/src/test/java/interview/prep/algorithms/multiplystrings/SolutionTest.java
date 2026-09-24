package interview.prep.algorithms.multiplystrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void multipliesSingleAndMultiDigitNumbers() {
        assertEquals("6", Solution.multiply("2", "3"));
        assertEquals("56088", Solution.multiply("123", "456"));
    }

    @Test
    void zeroFactorReturnsZero() {
        assertEquals("0", Solution.multiply("0", "12345"));
    }

    @Test
    void handlesLeadingZeroInput() {
        assertEquals("6", Solution.multiply("02", "3"));
    }
}
