package interview.prep.algorithms.validparentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void acceptsNestedAndAdjacentPairs() {
        assertTrue(Solution.isValid("()[]{}"));
        assertTrue(Solution.isValid("([{}])"));
    }

    @Test
    void rejectsMismatchedOrMisorderedPairs() {
        assertFalse(Solution.isValid("(]"));
        assertFalse(Solution.isValid("([)]"));
    }

    @Test
    void rejectsUnclosedOpeningBracket() {
        assertFalse(Solution.isValid("("));
    }
}
