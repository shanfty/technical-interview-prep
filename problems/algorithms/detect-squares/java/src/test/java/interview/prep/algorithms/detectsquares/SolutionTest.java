package interview.prep.algorithms.detectsquares;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void countsAxisAlignedSquares() {
        Solution.DetectSquares d = new Solution.DetectSquares();
        d.add(new int[]{3,10}); d.add(new int[]{11,2}); d.add(new int[]{3,2}); d.add(new int[]{11,10});
        assertEquals(1, d.count(new int[]{3,10}));
    }
}

