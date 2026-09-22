package interview.prep.algorithms.palindromicsubstrings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void countsAllOccurrences() {
        assertEquals(6, Solution.countSubstrings("aaa"));
    }
    @Test void handlesNoRepeatedCharacters() {
        assertEquals(3, Solution.countSubstrings("abc"));
    }
}

