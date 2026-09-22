package interview.prep.algorithms.plusone;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void incrementsWithoutCarryChain() {
        assertArrayEquals(new int[]{1, 2, 4}, Solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void propagatesCarryAcrossNines() {
        assertArrayEquals(new int[]{1, 0}, Solution.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 0, 0}, Solution.plusOne(new int[]{9, 9}));
    }

    @Test
    void incrementsTrailingNonNine() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, Solution.plusOne(new int[]{4, 3, 2, 1}));
    }
}
