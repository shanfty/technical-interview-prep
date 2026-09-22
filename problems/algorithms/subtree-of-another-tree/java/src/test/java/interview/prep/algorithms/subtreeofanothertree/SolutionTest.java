package interview.prep.algorithms.subtreeofanothertree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsMatchingSubtreeBelowRoot() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        assertTrue(Solution.isSubtree(root, subRoot));
    }

    @Test
    void rejectsExtraStructure() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        subRoot.left.left = new TreeNode(0);
        assertFalse(Solution.isSubtree(root, subRoot));
    }

    @Test
    void considersEmptySubtreeValid() {
        assertTrue(Solution.isSubtree(new TreeNode(1), null));
    }
}
