package interview.prep.algorithms.linkedlistcycle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void detectsCycle() {
        Solution.ListNode a = new Solution.ListNode(3);
        Solution.ListNode b = new Solution.ListNode(2);
        a.next = b; b.next = a;
        assertTrue(Solution.hasCycle(a));
    }
    @Test void rejectsAcyclicList() {
        Solution.ListNode a = new Solution.ListNode(1);
        a.next = new Solution.ListNode(2);
        assertFalse(Solution.hasCycle(a));
    }
}

