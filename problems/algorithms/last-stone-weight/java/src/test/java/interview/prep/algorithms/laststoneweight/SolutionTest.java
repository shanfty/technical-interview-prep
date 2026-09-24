package interview.prep.algorithms.laststoneweight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void simulatesExample() {
        assertEquals(1, Solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    void handlesOneStone() {
        assertEquals(1, Solution.lastStoneWeight(new int[]{1}));
    }

    @Test
    void destroysEqualStones() {
        assertEquals(0, Solution.lastStoneWeight(new int[]{2, 2}));
    }
}
