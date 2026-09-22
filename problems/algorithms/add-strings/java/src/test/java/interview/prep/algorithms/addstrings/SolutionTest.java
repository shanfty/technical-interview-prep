package interview.prep.algorithms.addstrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addsDifferentLengthNumbers() {
        assertEquals("134", Solution.addStrings("11", "123"));
        assertEquals("533", Solution.addStrings("456", "77"));
    }

    @Test
    void handlesZero() {
        assertEquals("0", Solution.addStrings("0", "0"));
    }

    @Test
    void propagatesFinalCarry() {
        assertEquals("1000", Solution.addStrings("999", "1"));
    }
}
