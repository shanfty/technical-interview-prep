package interview.prep.algorithms.jumpgameii;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void findsMinimumJumps() {
        assertEquals(2, Solution.jump(new int[]{2,3,1,1,4}));
    }
    @Test void handlesDirectReach() {
        assertEquals(1, Solution.jump(new int[]{2,1}));
    }
}

