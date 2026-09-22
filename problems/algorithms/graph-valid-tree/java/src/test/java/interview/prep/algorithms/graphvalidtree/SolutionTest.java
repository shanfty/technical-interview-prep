package interview.prep.algorithms.graphvalidtree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void acceptsConnectedAcyclicGraph() {
        assertTrue(Solution.validTree(5, new int[][]{{0,1},{0,2},{0,3},{1,4}}));
    }
    @Test void rejectsGraphWithCycle() {
        assertFalse(Solution.validTree(5, new int[][]{{0,1},{1,2},{2,3},{1,3},{1,4}}));
    }
    @Test void rejectsDisconnectedGraph() {
        assertFalse(Solution.validTree(4, new int[][]{{0,1},{2,3}}));
    }
}

