package interview.prep.algorithms.evaluatereversepolishnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evaluatesMultipleOperators() {
        assertEquals(9, Solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void truncatesDivisionTowardZero() {
        assertEquals(6, Solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    void handlesNegativeOperandsAndLongExpression() {
        assertEquals(22, Solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}
