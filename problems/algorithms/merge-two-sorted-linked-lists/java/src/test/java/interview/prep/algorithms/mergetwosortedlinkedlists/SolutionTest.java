package interview.prep.algorithms.mergetwosortedlinkedlists;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergesInterleavedValues() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, values(Solution.mergeTwoLists(list(1, 2, 4), list(1, 3, 4))));
    }

    @Test
    void handlesOneEmptyList() {
        assertArrayEquals(new int[]{1, 2}, values(Solution.mergeTwoLists(null, list(1, 2))));
    }

    @Test
    void handlesBothEmptyLists() {
        assertArrayEquals(new int[]{}, values(Solution.mergeTwoLists(null, null)));
    }

    private static ListNode list(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        return dummy.next;
    }

    private static int[] values(ListNode head) {
        int size = 0;
        for (ListNode node = head; node != null; node = node.next) size++;
        int[] result = new int[size];
        int index = 0;
        for (ListNode node = head; node != null; node = node.next) result[index++] = node.val;
        return result;
    }
}
