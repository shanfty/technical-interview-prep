package interview.prep.algorithms.twosum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsPairInExample() {
        assertPair(new int[]{2, 7, 11, 15}, 9, 0, 1);
    }

    @Test
    void handlesPairAwayFromBeginning() {
        assertPair(new int[]{3, 2, 4}, 6, 1, 2);
    }

    @Test
    void handlesDuplicateValues() {
        assertPair(new int[]{3, 3}, 6, 0, 1);
    }

    private void assertPair(int[] nums, int target, int first, int second) {
        int[] result = Solution.twoSum(nums, target);
        assertEquals(2, result.length);
        assertTrue(Arrays.stream(result).distinct().count() == 2);
        assertEquals(target, nums[result[0]] + nums[result[1]]);
        assertTrue((result[0] == first && result[1] == second)
                || (result[0] == second && result[1] == first));
    }
}
