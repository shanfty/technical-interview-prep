package interview.prep.algorithms.pacificatlanticwaterflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsCellsReachableFromBothOceans() {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        Set<List<Integer>> expected = Set.of(List.of(0, 4), List.of(1, 3), List.of(1, 4), List.of(2, 2), List.of(3, 0), List.of(3, 1), List.of(4, 0));
        Set<List<Integer>> actual = new HashSet<>(Solution.pacificAtlantic(heights));
        assertEquals(expected, actual);
    }

    @Test
    void flatMatrixAllowsEveryCell() {
        Set<List<Integer>> actual = new HashSet<>(Solution.pacificAtlantic(new int[][]{{1, 1}, {1, 1}}));
        assertEquals(Set.of(List.of(0, 0), List.of(0, 1), List.of(1, 0), List.of(1, 1)), actual);
    }

    @Test
    void singleCellReachesBothOceans() {
        assertEquals(Set.of(List.of(0, 0)), new HashSet<>(Solution.pacificAtlantic(new int[][]{{7}})));
    }
}
