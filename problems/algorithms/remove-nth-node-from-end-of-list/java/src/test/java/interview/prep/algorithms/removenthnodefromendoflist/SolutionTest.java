package interview.prep.algorithms.removenthnodefromendoflist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removesInteriorNode() {
        assertArrayEquals(new int[]{1, 2, 3, 5}, values(Solution.removeNthFromEnd(list(1, 2, 3, 4, 5), 2)));
    }

    @Test
    void removesHeadWhenNIsListLength() {
        assertArrayEquals(new int[]{2, 3}, values(Solution.removeNthFromEnd(list(1, 2, 3), 3)));
    }

    @Test
    void removesOnlyNode() {
        assertArrayEquals(new int[]{}, values(Solution.removeNthFromEnd(list(1), 1)));
    }

    private static ListNode list(int... values) { ListNode d = new ListNode(0), t = d; for (int v : values) { t.next = new ListNode(v); t = t.next; } return d.next; }
    private static int[] values(ListNode h) { int n = 0; for (ListNode p = h; p != null; p = p.next) n++; int[] a = new int[n]; int i = 0; for (ListNode p = h; p != null; p = p.next) a[i++] = p.val; return a; }
}
