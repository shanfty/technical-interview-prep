package interview.prep.algorithms.groupanagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void groupsAnagramsWithoutRequiringOrdering() {
        List<List<String>> result = Solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Set<Set<String>> groups = result.stream().map(HashSet::new).collect(Collectors.toSet());
        assertEquals(Set.of(Set.of("eat", "tea", "ate"), Set.of("tan", "nat"), Set.of("bat")), groups);
    }

    @Test
    void handlesEmptyInput() {
        assertEquals(List.of(), Solution.groupAnagrams(new String[]{}));
    }

    @Test
    void handlesEmptyString() {
        assertEquals(List.of(List.of("")), Solution.groupAnagrams(new String[]{""}));
    }
}
