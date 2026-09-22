package interview.prep.algorithms.coinchangeii;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void countsUnorderedCombinations() {
        assertEquals(4, Solution.change(5, new int[]{1,2,5}));
    }
    @Test void returnsOneForZeroAmount() {
        assertEquals(1, Solution.change(0, new int[]{1,2}));
    }
}

