package interview.prep.algorithms.kokoeatingbananas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsMinimumFeasibleSpeed() {
        assertEquals(4, Solution.minEatingSpeed(new int[]{3,6,7,11}, 8));
    }
    @Test void handlesOneHourPerPile() {
        assertEquals(11, Solution.minEatingSpeed(new int[]{3,6,7,11}, 4));
    }
}

