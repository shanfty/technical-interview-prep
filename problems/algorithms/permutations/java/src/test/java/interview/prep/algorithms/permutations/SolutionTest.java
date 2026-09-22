package interview.prep.algorithms.permutations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsAllDistinctOrderings() {
        Set<List<Integer>> expected = Set.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        assertEquals(expected, new HashSet<>(Solution.permute(new int[]{1, 2, 3})));
    }

    @Test
    void handlesSingleton() {
        assertEquals(Set.of(List.of(1)), new HashSet<>(Solution.permute(new int[]{1})));
    }
}
