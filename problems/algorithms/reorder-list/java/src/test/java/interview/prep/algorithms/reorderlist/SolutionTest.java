package interview.prep.algorithms.reorderlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reordersEvenList() {
        ListNode head = list(1, 2, 3, 4);
        Solution.reorderList(head);
        assertArrayEquals(new int[]{1, 4, 2, 3}, values(head));
    }

    @Test
    void reordersOddList() {
        ListNode head = list(1, 2, 3, 4, 5);
        Solution.reorderList(head);
        assertArrayEquals(new int[]{1, 5, 2, 4, 3}, values(head));
    }

    @Test
    void leavesShortListsUnchanged() {
        ListNode head = list(1);
        Solution.reorderList(head);
        assertArrayEquals(new int[]{1}, values(head));
    }

    private static ListNode list(int... values) { ListNode d = new ListNode(0), t = d; for (int v : values) { t.next = new ListNode(v); t = t.next; } return d.next; }
    private static int[] values(ListNode h) { int n = 0; for (ListNode p = h; p != null; p = p.next) n++; int[] a = new int[n]; int i = 0; for (ListNode p = h; p != null; p = p.next) a[i++] = p.val; return a; }
}
