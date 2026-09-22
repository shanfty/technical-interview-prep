package interview.prep.algorithms.combinationsumii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsUniqueSingleUseCombinations() {
        Set<List<Integer>> expected = Set.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
        assertEquals(expected, new HashSet<>(Solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8)));
    }

    @Test
    void handlesDuplicateCandidates() {
        Set<List<Integer>> expected = Set.of(List.of(1, 2, 2), List.of(5));
        assertEquals(expected, new HashSet<>(Solution.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5)));
    }

    @Test
    void returnsEmptyWhenTargetCannotBeReached() {
        assertEquals(Set.of(), new HashSet<>(Solution.combinationSum2(new int[]{2, 4}, 3)));
    }
}
