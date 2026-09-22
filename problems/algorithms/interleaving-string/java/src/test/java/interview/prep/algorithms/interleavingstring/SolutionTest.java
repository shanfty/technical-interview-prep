package interview.prep.algorithms.interleavingstring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void acceptsValidInterleaving() {
        assertTrue(Solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }
    @Test void rejectsInvalidInterleaving() {
        assertFalse(Solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}

