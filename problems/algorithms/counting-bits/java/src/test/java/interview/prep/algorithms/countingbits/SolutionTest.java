package interview.prep.algorithms.countingbits;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsPrefixCounts() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, Solution.countBits(5));
    }

    @Test
    void handlesZero() {
        assertArrayEquals(new int[]{0}, Solution.countBits(0));
    }
}
