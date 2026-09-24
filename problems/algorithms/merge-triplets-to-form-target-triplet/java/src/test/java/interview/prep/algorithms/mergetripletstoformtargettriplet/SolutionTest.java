package interview.prep.algorithms.mergetripletstoformtargettriplet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void acceptsPossibleTarget() {
        assertTrue(Solution.mergeTriplets(new int[][]{{2,5,3},{1,8,4},{1,7,5}}, new int[]{2,8,5}));
    }
    @Test void rejectsWhenCoordinateCannotReachTarget() {
        assertFalse(Solution.mergeTriplets(new int[][]{{3,4,5},{4,5,6}}, new int[]{2,5,5}));
    }
}

