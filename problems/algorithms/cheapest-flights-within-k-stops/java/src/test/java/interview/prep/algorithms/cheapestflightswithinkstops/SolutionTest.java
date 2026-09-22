package interview.prep.algorithms.cheapestflightswithinkstops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void usesPermittedStopForCheaperRoute() {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        assertEquals(200, Solution.findCheapestPrice(3, flights, 0, 2, 1));
    }

    @Test
    void respectsZeroStopLimit() {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        assertEquals(500, Solution.findCheapestPrice(3, flights, 0, 2, 0));
    }

    @Test
    void reportsUnavailableRoute() {
        assertEquals(-1, Solution.findCheapestPrice(3, new int[][]{{0, 1, 100}}, 0, 2, 1));
    }
}
