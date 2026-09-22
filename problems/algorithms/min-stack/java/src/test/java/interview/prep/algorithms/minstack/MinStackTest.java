package interview.prep.algorithms.minstack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinStackTest {
    @Test
    void tracksMinimumAcrossPushAndPop() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(0);
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(2, stack.top());
        assertEquals(1, stack.getMin());
    }

    @Test
    void retainsDuplicateMinimumAfterOnePop() {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(1);
        stack.push(1);
        stack.pop();
        assertEquals(1, stack.getMin());
    }
}
