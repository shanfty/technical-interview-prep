package interview.prep.algorithms.regularexpressionmatching;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinguishesExactAndRepeatedMatches() {
        assertFalse(Solution.isMatch("aa", "a"));
        assertTrue(Solution.isMatch("aa", "a*"));
    }

    @Test
    void dotAndStarCanMatchAnyString() {
        assertTrue(Solution.isMatch("ab", ".*"));
    }

    @Test
    void requiresEntireStringToMatch() {
        assertFalse(Solution.isMatch("mississippi", "mis*is*p*."));
    }
}
