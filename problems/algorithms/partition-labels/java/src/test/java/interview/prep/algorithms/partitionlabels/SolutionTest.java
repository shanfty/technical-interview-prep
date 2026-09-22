package interview.prep.algorithms.partitionlabels;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsMaximalPartitionLengths() {
        assertEquals(List.of(9,7,8), Solution.partitionLabels("ababcbacadefegdehijhklij"));
    }
    @Test void handlesSingleCharacter() {
        assertEquals(List.of(1), Solution.partitionLabels("a"));
    }
}

