package interview.prep.algorithms.jumpgame;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void acceptsReachableEnd() {
        assertTrue(Solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void rejectsBlockedEnd() {
        assertFalse(Solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void singleElementIsAlreadyReachable() {
        assertTrue(Solution.canJump(new int[]{0}));
    }
}
