package interview.prep.algorithms.generateparentheses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void generatesAllThreePairSequences() {
        Set<String> expected = Set.of("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expected, new HashSet<>(Solution.generateParenthesis(3)));
    }

    @Test void zeroPairsProducesOneEmptySequence() {
        assertEquals(Set.of(""), new HashSet<>(Solution.generateParenthesis(0)));
    }
}

