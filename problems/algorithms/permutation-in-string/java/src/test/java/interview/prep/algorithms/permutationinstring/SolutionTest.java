package interview.prep.algorithms.permutationinstring;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsPermutationInWindow() {
        assertTrue(Solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void rejectsWhenNoPermutationExists() {
        assertFalse(Solution.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void rejectsWhenPatternIsLonger() {
        assertFalse(Solution.checkInclusion("abcd", "abc"));
    }
}
