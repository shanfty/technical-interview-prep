package interview.prep.algorithms.copylistwithrandompointer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void preservesValuesAndRelationshipsWithNewNodes() {
        Solution.Node a = new Solution.Node(7);
        Solution.Node b = new Solution.Node(13);
        a.next = b; b.random = a;
        Solution.Node copy = Solution.copyRandomList(a);
        assertNotNull(copy);
        assertNotSame(a, copy);
        assertEquals(7, copy.val);
        assertNotNull(copy.next);
        assertEquals(13, copy.next.val);
        assertSame(copy, copy.next.random);
    }
    @Test void copiesEmptyList() {
        assertNull(Solution.copyRandomList(null));
    }
}

