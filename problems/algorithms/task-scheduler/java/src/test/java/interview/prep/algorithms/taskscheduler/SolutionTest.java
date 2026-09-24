package interview.prep.algorithms.taskscheduler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void insertsRequiredIdleIntervals() {
        assertEquals(8, Solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    void zeroCoolingNeedsNoIdleTime() {
        assertEquals(6, Solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }

    @Test
    void handlesOneTaskType() {
        assertEquals(4, Solution.leastInterval(new char[]{'A', 'A'}, 2));
    }
}
