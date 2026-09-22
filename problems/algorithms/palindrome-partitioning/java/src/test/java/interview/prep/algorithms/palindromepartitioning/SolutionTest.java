package interview.prep.algorithms.palindromepartitioning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsAllPalindromePartitions() {
        assertEquals(Set.of(List.of("a", "a", "b"), List.of("aa", "b")), new HashSet<>(Solution.partition("aab")));
    }

    @Test
    void singleCharacterHasOnePartition() {
        assertEquals(Set.of(List.of("a")), new HashSet<>(Solution.partition("a")));
    }

    @Test
    void emptyStringHasEmptyPartition() {
        assertEquals(Set.of(List.of()), new HashSet<>(Solution.partition("")));
    }
}
