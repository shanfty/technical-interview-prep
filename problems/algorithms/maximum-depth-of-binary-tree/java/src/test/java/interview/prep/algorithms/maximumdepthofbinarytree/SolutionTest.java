package interview.prep.algorithms.maximumdepthofbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsLongestRootToLeafPath() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        assertEquals(4, Solution.maxDepth(root));
    }

    @Test
    void emptyTreeHasDepthZero() {
        assertEquals(0, Solution.maxDepth(null));
    }

    @Test
    void singleNodeHasDepthOne() {
        assertEquals(1, Solution.maxDepth(new TreeNode(8)));
    }
}
