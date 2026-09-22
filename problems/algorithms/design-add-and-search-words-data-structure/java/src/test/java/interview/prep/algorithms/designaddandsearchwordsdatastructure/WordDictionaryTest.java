package interview.prep.algorithms.designaddandsearchwordsdatastructure;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WordDictionaryTest {
    @Test
    void searchesExactWords() {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        assertFalse(dictionary.search("pad"));
        assertTrue(dictionary.search("bad"));
    }

    @Test
    void supportsSingleCharacterWildcards() {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        assertTrue(dictionary.search(".ad"));
        assertTrue(dictionary.search("b.."));
        assertFalse(dictionary.search("..e"));
    }

    @Test
    void requiresExactPatternLength() {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("a");
        assertFalse(dictionary.search(""));
        assertFalse(dictionary.search("aa"));
    }
}
