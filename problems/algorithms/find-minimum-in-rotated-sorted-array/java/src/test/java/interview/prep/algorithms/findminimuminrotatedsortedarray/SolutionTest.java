package interview.prep.algorithms.findminimuminrotatedsortedarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsMinimumAfterRotation() {
        assertEquals(1, Solution.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, Solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    void handlesUnrotatedArray() {
        assertEquals(11, Solution.findMin(new int[]{11, 13, 15, 17}));
    }

    @Test
    void handlesTwoElements() {
        assertEquals(1, Solution.findMin(new int[]{2, 1}));
    }
}
