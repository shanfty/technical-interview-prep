package interview.prep.algorithms.longestrepeatingcharacterreplacement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void replacesDifferentLettersWithinBudget() {
        assertEquals(4, Solution.characterReplacement("XYYX", 2));
        assertEquals(4, Solution.characterReplacement("ABAB", 2));
    }

    @Test
    void respectsReplacementBudget() {
        assertEquals(4, Solution.characterReplacement("AABABBA", 1));
    }

    @Test
    void handlesEmptyString() {
        assertEquals(0, Solution.characterReplacement("", 2));
    }
}
