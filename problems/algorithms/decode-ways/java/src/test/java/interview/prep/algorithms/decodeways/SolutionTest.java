package interview.prep.algorithms.decodeways;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsSingleAndDoubleDigitChoices() {
        assertEquals(2, Solution.numDecodings("12"));
        assertEquals(3, Solution.numDecodings("226"));
    }

    @Test
    void rejectsLeadingZero() {
        assertEquals(0, Solution.numDecodings("06"));
    }

    @Test
    void rejectsZeroWithoutValidPredecessor() {
        assertEquals(0, Solution.numDecodings("100"));
    }
}
