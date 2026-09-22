package interview.prep.algorithms.medianoftwosortedarrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void handlesOddCombinedLength() {
        assertEquals(2.0, Solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
    @Test void handlesEvenCombinedLength() {
        assertEquals(2.5, Solution.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}

