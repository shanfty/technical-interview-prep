package interview.prep.algorithms.kthlargestelementinanarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsSecondLargest() {
        assertEquals(5, Solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void countsDuplicateValuesInRank() {
        assertEquals(4, Solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    void handlesLargestAndSmallestRanks() {
        assertEquals(9, Solution.findKthLargest(new int[]{9, 1, 4}, 1));
        assertEquals(1, Solution.findKthLargest(new int[]{9, 1, 4}, 3));
    }
}
