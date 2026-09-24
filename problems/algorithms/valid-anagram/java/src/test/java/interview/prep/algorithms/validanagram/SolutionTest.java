package interview.prep.algorithms.validanagram;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void acceptsRearrangedCharacters() {
        assertTrue(Solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void rejectsDifferentFrequencies() {
        assertFalse(Solution.isAnagram("rat", "car"));
    }

    @Test
    void rejectsDifferentLengths() {
        assertFalse(Solution.isAnagram("a", "aa"));
    }
}
