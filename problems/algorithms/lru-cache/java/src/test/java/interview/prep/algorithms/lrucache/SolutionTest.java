package interview.prep.algorithms.lrucache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void evictsLeastRecentlyUsedEntry() {
        Solution.LRUCache cache = new Solution.LRUCache(2);
        cache.put(1, 1); cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        assertEquals(3, cache.get(3));
    }
    @Test void updatesExistingKey() {
        Solution.LRUCache cache = new Solution.LRUCache(1);
        cache.put(1, 1); cache.put(1, 9);
        assertEquals(9, cache.get(1));
    }
}

