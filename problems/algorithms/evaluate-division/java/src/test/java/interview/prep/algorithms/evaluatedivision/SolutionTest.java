package interview.prep.algorithms.evaluatedivision;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evaluatesDirectAndChainedRatios() {
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"));
        double[] actual = Solution.calcEquation(equations, new double[]{2.0, 3.0}, List.of(List.of("a", "c"), List.of("c", "a"), List.of("a", "e"), List.of("a", "a")));
        assertArrayEquals(new double[]{6.0, 1.0 / 6.0, -1.0, 1.0}, actual, 1e-9);
    }

    @Test
    void rejectsDisconnectedVariables() {
        double[] actual = Solution.calcEquation(List.of(List.of("x", "y")), new double[]{4.0}, List.of(List.of("x", "z")));
        assertArrayEquals(new double[]{-1.0}, actual, 1e-9);
    }
}
