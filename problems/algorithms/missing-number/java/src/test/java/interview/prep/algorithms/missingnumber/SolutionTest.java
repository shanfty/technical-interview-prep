package interview.prep.algorithms.missingnumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsMissingInteriorValue() {
        assertEquals(2, Solution.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    void findsMissingUpperBound() {
        assertEquals(2, Solution.missingNumber(new int[]{0, 1}));
        assertEquals(8, Solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    @Test
    void handlesSingleZero() {
        assertEquals(1, Solution.missingNumber(new int[]{0}));
    }
}
