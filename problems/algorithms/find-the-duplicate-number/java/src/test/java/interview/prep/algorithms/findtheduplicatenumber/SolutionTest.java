package interview.prep.algorithms.findtheduplicatenumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsDuplicateInUnsortedInput() {
        assertEquals(2, Solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, Solution.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }

    @Test
    void handlesRepeatedSingleValue() {
        assertEquals(3, Solution.findDuplicate(new int[]{3, 3, 3, 3, 3}));
    }
}
