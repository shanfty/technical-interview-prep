package interview.prep.algorithms.aliendictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void derivesOrdering() {
        assertEquals("wertf", Solution.foreignDictionary(new String[]{"wrt","wrf","er","ett","rftt"}));
    }
    @Test void rejectsInvalidPrefixOrdering() {
        assertEquals("", Solution.foreignDictionary(new String[]{"abc","ab"}));
    }
}

