package interview.prep.algorithms.courseschedule;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void acceptsAcyclicPrerequisites() {
        assertTrue(Solution.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    void rejectsCircularPrerequisites() {
        assertFalse(Solution.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    void acceptsCoursesWithoutPrerequisites() {
        assertTrue(Solution.canFinish(3, new int[][]{}));
    }
}
