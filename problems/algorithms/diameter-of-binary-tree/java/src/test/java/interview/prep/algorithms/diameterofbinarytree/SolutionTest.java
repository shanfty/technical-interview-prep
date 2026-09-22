package interview.prep.algorithms.diameterofbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsLongestPathThroughRoot() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, Solution.diameterOfBinaryTree(root));
    }

    @Test
    void emptyAndSingletonTreesHaveZeroDiameter() {
        assertEquals(0, Solution.diameterOfBinaryTree(null));
        assertEquals(0, Solution.diameterOfBinaryTree(new TreeNode(1)));
    }

    @Test
    void diameterNeedNotUseRoot() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        root.right = new TreeNode(6);
        assertEquals(3, Solution.diameterOfBinaryTree(root));
    }
}
