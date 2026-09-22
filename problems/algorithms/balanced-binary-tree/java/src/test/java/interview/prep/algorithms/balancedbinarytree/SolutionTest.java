package interview.prep.algorithms.balancedbinarytree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void acceptsBalancedTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(Solution.isBalanced(root));
    }

    @Test
    void rejectsUnevenDeepBranch() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        assertFalse(Solution.isBalanced(root));
    }

    @Test
    void considersEmptyTreeBalanced() {
        assertTrue(Solution.isBalanced(null));
    }
}
