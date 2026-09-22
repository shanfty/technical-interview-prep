package interview.prep.algorithms.constructbinarytreefrompreorderandinordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reconstructsAsymmetricTree() {
        TreeNode root = Solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }

    @Test
    void handlesEmptyTraversals() {
        assertNull(Solution.buildTree(new int[]{}, new int[]{}));
    }

    @Test
    void handlesSingleton() {
        assertEquals(1, Solution.buildTree(new int[]{1}, new int[]{1}).val);
    }
}
