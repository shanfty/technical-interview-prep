package interview.prep.algorithms.clonegraph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void clonesCyclicGraphAndPreservesConnections() {
        Node first = new Node(1);
        Node second = new Node(2);
        first.neighbors.add(second);
        second.neighbors.add(first);
        Node clone = Solution.cloneGraph(first);
        assertNotSame(first, clone);
        assertEquals(1, clone.val);
        assertEquals(2, clone.neighbors.get(0).val);
        assertNotSame(second, clone.neighbors.get(0));
        assertEquals(clone, clone.neighbors.get(0).neighbors.get(0));
    }

    @Test
    void clonesSingleton() {
        Node node = new Node(7);
        Node clone = Solution.cloneGraph(node);
        assertNotSame(node, clone);
        assertEquals(7, clone.val);
    }

    @Test
    void handlesNullInput() {
        assertNull(Solution.cloneGraph(null));
    }
}
