package interview.prep.algorithms.subsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsEverySubset() {
        Set<List<Integer>> expected = Set.of(List.of(), List.of(1), List.of(2), List.of(3), List.of(1, 2), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
        assertEquals(expected, new HashSet<>(Solution.subsets(new int[]{1, 2, 3})));
    }

    @Test
    void emptyInputHasOneEmptySubset() {
        assertEquals(Set.of(List.of()), new HashSet<>(Solution.subsets(new int[]{})));
    }
}
