package interview.prep.algorithms.burstballoons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void maximizesCoins() {
        assertEquals(167, Solution.maxCoins(new int[]{3,1,5,8}));
    }
    @Test void handlesSingleBalloon() {
        assertEquals(7, Solution.maxCoins(new int[]{7}));
    }
}

