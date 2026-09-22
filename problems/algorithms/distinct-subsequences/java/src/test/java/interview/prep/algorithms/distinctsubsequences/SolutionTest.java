package interview.prep.algorithms.distinctsubsequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsRepeatedCharacterChoices() {
        assertEquals(3, Solution.numDistinct("rabbbit", "rabbit"));
    }

    @Test
    void countsMultipleSubsequencePaths() {
        assertEquals(5, Solution.numDistinct("babgbag", "bag"));
    }

    @Test
    void emptyTargetHasOneSubsequence() {
        assertEquals(1, Solution.numDistinct("abc", ""));
    }
}
