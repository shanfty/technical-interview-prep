package interview.prep.algorithms.spiralmatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void traversesSquareMatrixInSpiralOrder() {
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), Solution.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void traversesSingleRow() {
        assertEquals(List.of(1, 2, 3, 4), Solution.spiralOrder(new int[][]{{1, 2, 3, 4}}));
    }

    @Test
    void traversesSingleColumn() {
        assertEquals(List.of(1, 2, 3), Solution.spiralOrder(new int[][]{{1}, {2}, {3}}));
    }
}
