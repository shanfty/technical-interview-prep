package interview.prep.algorithms.twosumii;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsOneBasedIndices() {
        assertArrayEquals(new int[]{1, 2}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void handlesNegativeTarget() {
        assertArrayEquals(new int[]{1, 2}, Solution.twoSum(new int[]{-1, 0}, -1));
    }

    @Test
    void handlesRepeatedValues() {
        assertArrayEquals(new int[]{1, 2}, Solution.twoSum(new int[]{1, 1}, 2));
    }
}
