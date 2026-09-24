package interview.prep.algorithms.addtwonumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void addsReverseOrderDigits() {
        Solution.ListNode a = new Solution.ListNode(2); a.next = new Solution.ListNode(4); a.next.next = new Solution.ListNode(3);
        Solution.ListNode b = new Solution.ListNode(5); b.next = new Solution.ListNode(6); b.next.next = new Solution.ListNode(4);
        Solution.ListNode r = Solution.addTwoNumbers(a,b);
        assertEquals(7,r.val); assertEquals(0,r.next.val); assertEquals(8,r.next.next.val);
    }
}

