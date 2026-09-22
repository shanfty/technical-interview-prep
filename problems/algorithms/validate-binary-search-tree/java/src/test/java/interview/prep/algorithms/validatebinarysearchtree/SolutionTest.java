package interview.prep.algorithms.validatebinarysearchtree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void acceptsValidOrdering() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertTrue(Solution.isValidBST(root));
    }

    @Test
    void rejectsDeepOrderingViolation() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        assertFalse(Solution.isValidBST(root));
    }

    @Test
    void emptyTreeIsValid() {
        assertTrue(Solution.isValidBST(null));
    }
}
