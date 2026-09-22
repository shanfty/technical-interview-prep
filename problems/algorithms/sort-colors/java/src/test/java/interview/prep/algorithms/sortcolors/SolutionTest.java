package interview.prep.algorithms.sortcolors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void sortsThreeValuesInPlace() {
        int[] nums = {2,0,2,1,1,0};
        Solution.sortColors(nums);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);
    }
}

