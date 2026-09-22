package interview.prep.algorithms.wordsearchii;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void returnsAllFormableWords() {
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        assertEquals(Set.of("oath","eat"), new HashSet<>(Solution.findWords(board, new String[]{"oath","pea","eat","rain"})));
    }
    @Test void returnsEmptyWhenNoWordCanBeFormed() {
        assertEquals(Set.of(), new HashSet<>(Solution.findWords(new char[][]{{'a'}}, new String[]{"b"})));
    }
}

