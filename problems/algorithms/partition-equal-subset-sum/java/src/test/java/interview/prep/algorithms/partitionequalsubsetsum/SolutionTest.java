package interview.prep.algorithms.partitionequalsubsetsum;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsEqualPartition() {
        assertTrue(Solution.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    void rejectsUnequalTotalOrSubsetSums() {
        assertFalse(Solution.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    void handlesTwoEqualValues() {
        assertTrue(Solution.canPartition(new int[]{2, 2}));
    }
}
