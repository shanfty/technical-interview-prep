package interview.prep.algorithms.reversenodesinkgroup;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reversesCompleteGroups() {
        assertArrayEquals(new int[]{2, 1, 4, 3, 5}, values(Solution.reverseKGroup(list(1, 2, 3, 4, 5), 2)));
    }

    @Test
    void preservesPartialTrailingGroup() {
        assertArrayEquals(new int[]{3, 2, 1, 4, 5}, values(Solution.reverseKGroup(list(1, 2, 3, 4, 5), 3)));
    }

    @Test
    void kOneLeavesListUnchanged() {
        assertArrayEquals(new int[]{1, 2, 3}, values(Solution.reverseKGroup(list(1, 2, 3), 1)));
    }

    private static ListNode list(int... values) { ListNode d = new ListNode(0), t = d; for (int v : values) { t.next = new ListNode(v); t = t.next; } return d.next; }
    private static int[] values(ListNode h) { int n = 0; for (ListNode p = h; p != null; p = p.next) n++; int[] a = new int[n]; int i = 0; for (ListNode p = h; p != null; p = p.next) a[i++] = p.val; return a; }
}
