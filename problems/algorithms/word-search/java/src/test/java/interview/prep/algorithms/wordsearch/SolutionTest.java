package interview.prep.algorithms.wordsearch;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private static final char[][] BOARD = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

    @Test
    void findsHorizontalAndTurningPaths() {
        assertTrue(Solution.exist(BOARD, "ABCCED"));
        assertTrue(Solution.exist(BOARD, "SEE"));
    }

    @Test
    void rejectsPathThatReusesCell() {
        assertFalse(Solution.exist(BOARD, "ABCB"));
    }

    @Test
    void rejectsMissingWord() {
        assertFalse(Solution.exist(BOARD, "XYZ"));
    }
}
