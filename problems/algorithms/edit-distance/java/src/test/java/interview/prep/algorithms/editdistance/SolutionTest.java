package interview.prep.algorithms.editdistance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void countsInsertionsDeletionsAndSubstitutions() {
        assertEquals(3, Solution.minDistance("horse", "ros"));
    }
    @Test void handlesEmptyString() {
        assertEquals(3, Solution.minDistance("", "abc"));
    }
}

