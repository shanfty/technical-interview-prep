package interview.prep.algorithms.rottingoranges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsMinutesAcrossLayers() {
        assertEquals(4, Solution.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }

    @Test
    void reportsUnreachableFreshOrange() {
        assertEquals(-1, Solution.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
    }

    @Test
    void ignoresGridWithNoFreshOranges() {
        assertEquals(0, Solution.orangesRotting(new int[][]{{0, 2}}));
    }
}
