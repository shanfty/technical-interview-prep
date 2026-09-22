package interview.prep.algorithms.happynumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void identifiesHappyNumber() {
        assertTrue(Solution.isHappy(19));
    }

    @Test
    void identifiesCycleWithoutOne() {
        assertFalse(Solution.isHappy(2));
    }

    @Test
    void oneIsHappy() {
        assertTrue(Solution.isHappy(1));
    }
}
