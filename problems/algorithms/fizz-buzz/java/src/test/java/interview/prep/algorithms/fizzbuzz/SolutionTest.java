package interview.prep.algorithms.fizzbuzz;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final List<Object> FIRST_THIRTY_ONE = List.of(
        1, 2, "fizz", 4, "buzz", "fizz", 7, 8, "fizz", "buzz",
        11, "fizz", 13, 14, "fizzbuzz", 16, 17, "fizz", 19, "buzz",
        "fizz", 22, 23, "fizz", "buzz", 26, "fizz", 28, 29, "fizzbuzz", 31
    );

    @ParameterizedTest(name = "n = {0}")
    @MethodSource("cases")
    void returnsExpectedSequence(int n, List<Object> expected) {
        assertEquals(expected, Solution.fizzBuzz(n));
    }

    static Stream<Arguments> cases() {
        return Stream.of(0, 1, 2, 3, 4, 5, 6, 10, 14, 15, 16, 29, 30, 31)
            .map(n -> Arguments.of(n, FIRST_THIRTY_ONE.subList(0, n)));
    }

    @Test
    void handlesLargerInput() {
        List<Object> result = Solution.fizzBuzz(100);
        assertEquals(100, result.size());
        assertEquals(FIRST_THIRTY_ONE, result.subList(0, 31));
        assertEquals(List.of("fizz", 46, 47, "fizz", 49, "buzz"), result.subList(44, 50));
        assertEquals(List.of("fizzbuzz", 91, 92, "fizz", 94, "buzz", "fizz", 97, 98, "fizz", "buzz"),
            result.subList(89, 100));
    }

    @Test
    void repeatedCallsReturnIndependentResults() {
        List<Object> first = Solution.fizzBuzz(5);
        assertEquals(List.of(1, 2, "fizz", 4, "buzz"), first);
        assertEquals(List.of(1, 2), Solution.fizzBuzz(2));
        assertEquals(List.of(), Solution.fizzBuzz(0));
        assertEquals(List.of(1, 2, "fizz", 4, "buzz"), first);
    }
}
