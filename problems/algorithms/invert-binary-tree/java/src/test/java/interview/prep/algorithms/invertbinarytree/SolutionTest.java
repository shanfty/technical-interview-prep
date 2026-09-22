package interview.prep.algorithms.invertbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void swapsEveryLevel() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.right.right = new TreeNode(9);
        TreeNode result = Solution.invertTree(root);
        assertEquals(7, result.left.val);
        assertEquals(2, result.right.val);
        assertEquals(9, result.left.left.val);
        assertEquals(1, result.right.right.val);
    }

    @Test
    void handlesEmptyTree() {
        assertNull(Solution.invertTree(null));
    }

    @Test
    void handlesSingleNode() {
        TreeNode node = new TreeNode(5);
        assertEquals(node, Solution.invertTree(node));
    }
}
