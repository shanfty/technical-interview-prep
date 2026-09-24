package interview.prep.algorithms.lettercombinationsofaphonenumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsNineCombinationsForTwoThree() {
        assertEquals(Set.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), new HashSet<>(Solution.letterCombinations("23")));
    }

    @Test
    void handlesFourLetterDigit() {
        assertEquals(4, Solution.letterCombinations("7").size());
    }

    @Test
    void emptyInputReturnsEmptyList() {
        assertEquals(Set.of(), new HashSet<>(Solution.letterCombinations("")));
    }
}
