package interview.prep.algorithms.powxn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void computesPositiveExponent() {
        assertEquals(1024.0, Solution.myPow(2.0, 10));
    }
    @Test void computesNegativeExponent() {
        assertEquals(0.25, Solution.myPow(2.0, -2));
    }
}

