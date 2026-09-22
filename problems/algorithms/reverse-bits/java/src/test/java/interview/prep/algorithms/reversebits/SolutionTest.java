package interview.prep.algorithms.reversebits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reversesSparseBitPattern() {
        int input = Integer.parseUnsignedInt("00000010100101000001111010011100", 2);
        int expected = Integer.parseUnsignedInt("00111001011110000010100101000000", 2);
        assertEquals(expected, Solution.reverseBits(input));
    }

    @Test
    void zeroRemainsZero() {
        assertEquals(0, Solution.reverseBits(0));
    }
}
