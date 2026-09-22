package interview.prep.algorithms.longestpalindromicsubstring;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsPalindromeOfMaximumLength() {
        String result = Solution.longestPalindrome("babad");
        assertTrue(result.equals("bab") || result.equals("aba"));
    }
    @Test void handlesEvenLengthPalindrome() {
        assertTrue(Solution.longestPalindrome("cbbd").equals("bb"));
    }
}

