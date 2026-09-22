package interview.prep.algorithms.surroundedregions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void capturesOnlyInteriorRegion() {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        Solution.solve(board);
        assertArrayEquals(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}}, board);
    }

    @Test
    void preservesSingleBoundaryRegion() {
        char[][] board = {{'O'}};
        Solution.solve(board);
        assertArrayEquals(new char[][]{{'O'}}, board);
    }
}
