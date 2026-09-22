package interview.prep.algorithms.combinationsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsUniqueReusableCombinations() {
        Set<List<Integer>> expected = Set.of(List.of(2, 2, 3), List.of(7));
        Set<List<Integer>> actual = new HashSet<>(Solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
        assertEquals(expected, actual);
    }

    @Test
    void returnsEmptyWhenTargetCannotBeFormed() {
        assertEquals(Set.of(), new HashSet<>(Solution.combinationSum(new int[]{2}, 1)));
    }
}
