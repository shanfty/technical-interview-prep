package interview.prep.algorithms.longestsubstringwithoutrepeatingcharacters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsDistinctWindow() {
        assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void handlesAllRepeatedCharacters() {
        assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void handlesEmptyString() {
        assertEquals(0, Solution.lengthOfLongestSubstring(""));
    }
}
