package interview.prep.algorithms.threesum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsUniqueTripletsWithoutOrderingRequirements() {
        Set<List<Integer>> expected = Set.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
        Set<List<Integer>> actual = Solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).stream()
                .map(triplet -> triplet.stream().sorted().toList()).collect(Collectors.toCollection(HashSet::new));
        assertEquals(expected, actual);
    }

    @Test
    void returnsEmptyWhenNoTripletExists() {
        assertEquals(List.of(), Solution.threeSum(new int[]{0, 1, 1}));
    }

    @Test
    void keepsOnlyOneAllZeroTriplet() {
        assertEquals(Set.of(List.of(0, 0, 0)), new HashSet<>(Solution.threeSum(new int[]{0, 0, 0})));
    }
}
