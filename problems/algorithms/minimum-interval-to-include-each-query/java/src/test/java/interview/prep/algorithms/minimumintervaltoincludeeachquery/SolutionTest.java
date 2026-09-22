package interview.prep.algorithms.minimumintervaltoincludeeachquery;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void findsSmallestContainingInterval() {
        assertArrayEquals(new int[]{3,3,1,4}, Solution.minInterval(new int[][]{{2,3},{2,5},{1,8},{20,25}}, new int[]{2,3,5,22}));
    }
}

