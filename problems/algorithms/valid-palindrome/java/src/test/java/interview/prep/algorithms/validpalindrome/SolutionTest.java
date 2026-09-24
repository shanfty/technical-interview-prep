package interview.prep.algorithms.validpalindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void ignoresCaseAndPunctuation() {
        assertTrue(Solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void rejectsNonPalindrome() {
        assertFalse(Solution.isPalindrome("race a car"));
    }

    @Test
    void treatsNoAlphanumericCharactersAsPalindrome() {
        assertTrue(Solution.isPalindrome(" "));
    }
}
