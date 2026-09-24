package interview.prep.algorithms.carfleet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergesCarsIntoExampleFleets() {
        assertEquals(3, Solution.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
    }

    @Test
    void singleCarIsOneFleet() {
        assertEquals(1, Solution.carFleet(10, new int[]{3}, new int[]{3}));
    }

    @Test
    void carsWithSameArrivalTimeFormOneFleet() {
        assertEquals(1, Solution.carFleet(10, new int[]{0, 5}, new int[]{2, 1}));
    }
}
