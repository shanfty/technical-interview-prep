package interview.prep.algorithms.longestcommonsubsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsOrderedSubsequence() {
        assertEquals(3, Solution.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void handlesIdenticalStrings() {
        assertEquals(3, Solution.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void handlesNoCommonCharacters() {
        assertEquals(0, Solution.longestCommonSubsequence("abc", "def"));
    }
}
