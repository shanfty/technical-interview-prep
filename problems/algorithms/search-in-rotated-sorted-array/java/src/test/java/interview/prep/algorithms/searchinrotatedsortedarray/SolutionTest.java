package interview.prep.algorithms.searchinrotatedsortedarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsTargetAcrossPivot() {
        assertEquals(4, Solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void returnsMinusOneWhenAbsent() {
        assertEquals(-1, Solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void handlesUnrotatedArray() {
        assertEquals(2, Solution.search(new int[]{1, 2, 3, 4}, 3));
    }
}
