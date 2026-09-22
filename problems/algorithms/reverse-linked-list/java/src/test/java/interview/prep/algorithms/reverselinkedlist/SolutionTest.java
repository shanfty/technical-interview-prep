package interview.prep.algorithms.reverselinkedlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reversesMultipleNodes() {
        assertArrayEquals(new int[]{3, 2, 1, 0}, values(Solution.reverseList(list(0, 1, 2, 3))));
    }

    @Test
    void handlesEmptyList() {
        assertArrayEquals(new int[]{}, values(Solution.reverseList(null)));
    }

    @Test
    void preservesSingleton() {
        assertArrayEquals(new int[]{7}, values(Solution.reverseList(list(7))));
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
