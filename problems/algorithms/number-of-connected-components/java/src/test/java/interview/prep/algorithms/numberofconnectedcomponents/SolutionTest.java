package interview.prep.algorithms.numberofconnectedcomponents;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void countsComponents() {
        assertEquals(2, Solution.countComponents(5, new int[][]{{0,1},{1,2},{3,4}}));
    }
    @Test void countsIsolatedNodes() {
        assertEquals(3, Solution.countComponents(3, new int[][]{}));
    }
}

