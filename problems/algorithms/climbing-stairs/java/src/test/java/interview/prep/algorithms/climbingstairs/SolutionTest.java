package interview.prep.algorithms.climbingstairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsTwoSteps() {
        assertEquals(2, Solution.climbStairs(2));
    }

    @Test
    void countsThreeSteps() {
        assertEquals(3, Solution.climbStairs(3));
    }

    @Test
    void handlesOneStep() {
        assertEquals(1, Solution.climbStairs(1));
    }
}
