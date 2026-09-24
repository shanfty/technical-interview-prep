package interview.prep.algorithms.handofstraights;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void formsConsecutiveGroups() {
        assertTrue(Solution.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
    }

    @Test
    void rejectsIncompatibleGroupSize() {
        assertFalse(Solution.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }

    @Test
    void rejectsMissingConsecutiveValue() {
        assertFalse(Solution.isNStraightHand(new int[]{1, 2, 4, 5}, 2));
    }
}
