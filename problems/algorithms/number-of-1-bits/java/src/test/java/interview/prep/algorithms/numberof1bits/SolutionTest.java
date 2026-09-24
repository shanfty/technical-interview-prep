package interview.prep.algorithms.numberof1bits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsSetBits() {
        assertEquals(3, Solution.hammingWeight(11));
        assertEquals(1, Solution.hammingWeight(128));
    }

    @Test
    void zeroHasNoSetBits() {
        assertEquals(0, Solution.hammingWeight(0));
    }

    @Test
    void handlesAllBitsSet() {
        assertEquals(32, Solution.hammingWeight(-1));
    }
}
