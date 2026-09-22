package interview.prep.algorithms.maximumxoroftwonumbersinanarray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void findsMaximumPairXor() {
        assertEquals(28, Solution.findMaximumXOR(new int[]{3,10,5,25,2,8}));
    }
}

