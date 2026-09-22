package interview.prep.algorithms.binarytreemaximumpathsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsPathThroughBestSubtree() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(42, Solution.maxPathSum(root));
    }

    @Test
    void pathMayUseBothChildren() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(6, Solution.maxPathSum(root));
    }

    @Test
    void handlesAllNegativeTree() {
        TreeNode root = new TreeNode(-3);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(-1);
        assertEquals(-1, Solution.maxPathSum(root));
    }
}
