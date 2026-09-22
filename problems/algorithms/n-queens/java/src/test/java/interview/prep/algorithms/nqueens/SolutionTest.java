package interview.prep.algorithms.nqueens;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fourQueensHasTwoSolutions() {
        List<List<String>> result = Solution.solveNQueens(4);
        assertEquals(2, result.size());
        for (List<String> board : result) {
            assertEquals(4, board.size());
            for (String row : board) assertEquals(4, row.length());
        }
    }

    @Test
    void oneQueenHasOneSolution() {
        assertEquals(List.of(List.of("Q")), Solution.solveNQueens(1));
    }

    @Test
    void twoQueensHaveNoSolution() {
        assertEquals(List.of(), Solution.solveNQueens(2));
    }
}
