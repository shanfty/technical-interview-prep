package interview.prep.algorithms.mergeksortedlinkedlists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void mergesAllSortedLists() {
        Solution.ListNode a = new Solution.ListNode(1); a.next = new Solution.ListNode(4);
        Solution.ListNode b = new Solution.ListNode(1); b.next = new Solution.ListNode(3);
        Solution.ListNode r = Solution.mergeKLists(new Solution.ListNode[]{a,b});
        assertEquals(1,r.val); assertEquals(1,r.next.val); assertEquals(3,r.next.next.val); assertEquals(4,r.next.next.next.val);
    }
}

