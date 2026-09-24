package interview.prep.algorithms.implementtrieprefixtree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TrieTest {
    @Test
    void distinguishesCompleteWordsFromPrefixes() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));
        trie.insert("app");
        assertTrue(trie.search("app"));
    }

    @Test
    void rejectsMissingWordAndPrefix() {
        Trie trie = new Trie();
        trie.insert("cat");
        assertFalse(trie.search("car"));
        assertFalse(trie.startsWith("do"));
    }

    @Test
    void supportsEmptyPrefix() {
        Trie trie = new Trie();
        trie.insert("word");
        assertTrue(trie.startsWith(""));
    }
}
