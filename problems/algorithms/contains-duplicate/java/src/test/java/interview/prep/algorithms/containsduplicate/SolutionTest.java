package interview.prep.algorithms.containsduplicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void detectsRepeatedValue() {
        assertTrue(Solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void rejectsAllDistinctValues() {
        assertFalse(Solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void handlesSingleElementArray() {
        assertFalse(Solution.containsDuplicate(new int[]{7}));
    }
}
