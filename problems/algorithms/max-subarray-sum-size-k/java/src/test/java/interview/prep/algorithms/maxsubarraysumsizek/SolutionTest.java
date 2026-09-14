package interview.prep.algorithms.maxsubarraysumsizek;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest(name = "{0}")
    @MethodSource("cases")
    void returnsMaximumSum(String name, List<Integer> nums, int k, int expected) {
        assertEquals(expected, Solution.maxSubarraySumSizeK(nums, k));
    }

    static Stream<Arguments> cases() {
        return Stream.of(
            Arguments.of("supplied example", List.of(4, 2, 1, -9, 8, 4, 3), 3, 15),
            Arguments.of("maximum at start", List.of(8, 7, 1, 2), 2, 15),
            Arguments.of("maximum in middle", List.of(1, 6, 7, 2), 2, 13),
            Arguments.of("all negative", List.of(-8, -2, -3, -9), 2, -5),
            Arguments.of("size one", List.of(-4, 9, 2), 1, 9),
            Arguments.of("size one all negative", List.of(-7, -2, -8), 1, -2),
            Arguments.of("whole list", List.of(3, -5, 7), 3, 5),
            Arguments.of("single element", List.of(-6), 1, -6),
            Arguments.of("all zeros", List.of(0, 0, 0), 2, 0),
            Arguments.of("tied maxima", List.of(3, 1, 3, 1), 2, 4),
            Arguments.of("elements must be contiguous", List.of(9, -20, 8), 2, -11),
            Arguments.of("exactly k elements", List.of(5, -2, 4), 2, 3),
            Arguments.of("zero beats negative sums", List.of(-2, 0, 0, -3), 2, 0),
            Arguments.of("maximum int sum", List.of(2147483646, 1), 2, Integer.MAX_VALUE),
            Arguments.of("minimum int sum", List.of(-2147483647, -1), 2, Integer.MIN_VALUE)
        );
    }
}
