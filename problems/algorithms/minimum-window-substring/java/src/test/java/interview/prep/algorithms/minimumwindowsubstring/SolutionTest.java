package interview.prep.algorithms.minimumwindowsubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsShortestCoveringWindow() {
        assertEquals("BANC", Solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void returnsExactSingleCharacterWindow() {
        assertEquals("a", Solution.minWindow("a", "a"));
    }

    @Test
    void respectsDuplicateRequirements() {
        assertEquals("", Solution.minWindow("a", "aa"));
    }
}
