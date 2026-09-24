package interview.prep.algorithms.productofarrayexceptself;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void computesProductsWithoutZero() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, Solution.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void handlesOneZero() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, Solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}
