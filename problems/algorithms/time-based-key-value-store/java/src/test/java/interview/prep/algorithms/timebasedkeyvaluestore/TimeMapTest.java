package interview.prep.algorithms.timebasedkeyvaluestore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TimeMapTest {
    @Test
    void returnsMostRecentValueAtOrBeforeTimestamp() {
        TimeMap map = new TimeMap();
        map.set("foo", "bar", 1);
        assertEquals("bar", map.get("foo", 1));
        assertEquals("bar", map.get("foo", 3));
        map.set("foo", "bar2", 4);
        assertEquals("bar", map.get("foo", 3));
        assertEquals("bar2", map.get("foo", 4));
    }

    @Test
    void returnsEmptyForMissingKeyOrEarlierTimestamp() {
        TimeMap map = new TimeMap();
        map.set("foo", "bar", 5);
        assertEquals("", map.get("missing", 5));
        assertEquals("", map.get("foo", 4));
    }

    @Test
    void supportsIndependentKeys() {
        TimeMap map = new TimeMap();
        map.set("a", "one", 1);
        map.set("b", "two", 1);
        assertEquals("one", map.get("a", 1));
        assertEquals("two", map.get("b", 1));
    }
}
