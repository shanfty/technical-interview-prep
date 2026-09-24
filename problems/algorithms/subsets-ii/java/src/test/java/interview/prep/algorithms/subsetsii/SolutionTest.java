package interview.prep.algorithms.subsetsii;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsDistinctSubsets() {
        Set<Set<Integer>> expected = Set.of(Set.of(), Set.of(1), Set.of(2), Set.of(1,2), Set.of(2,2), Set.of(1,2,2));
        Set<Set<Integer>> actual = Solution.subsetsWithDup(new int[]{1,2,2}).stream().map(HashSet::new).collect(Collectors.toSet());
        assertEquals(expected, actual);
    }
}

