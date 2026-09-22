package interview.prep.algorithms.wordbreak;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void acceptsSegmentableString() {
        assertTrue(Solution.wordBreak("leetcode", List.of("leet", "code")));
    }
    @Test void rejectsStringWithUncoverableSuffix() {
        assertFalse(Solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }
}

