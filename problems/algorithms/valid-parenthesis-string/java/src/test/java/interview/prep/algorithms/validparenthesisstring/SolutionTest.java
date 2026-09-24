package interview.prep.algorithms.validparenthesisstring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void acceptsUsingAsteriskAsEitherRole() {
        assertTrue(Solution.checkValidString("(*)"));
    }
    @Test void rejectsUnbalancedString() {
        assertFalse(Solution.checkValidString("(*))("));
    }
}

