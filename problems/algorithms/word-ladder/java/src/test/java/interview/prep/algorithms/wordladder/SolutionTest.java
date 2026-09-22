package interview.prep.algorithms.wordladder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsShortestTransformation() {
        assertEquals(5, Solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void returnsZeroWhenEndWordIsUnavailable() {
        assertEquals(0, Solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }

    @Test
    void directOneLetterTransformationHasLengthTwo() {
        assertEquals(2, Solution.ladderLength("hit", "hot", List.of("hot")));
    }
}
