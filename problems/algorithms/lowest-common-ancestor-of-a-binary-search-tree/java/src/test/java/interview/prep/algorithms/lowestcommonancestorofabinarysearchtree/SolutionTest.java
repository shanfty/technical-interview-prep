package interview.prep.algorithms.lowestcommonancestorofabinarysearchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsAncestorOnOppositeBranches() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        assertEquals(root, Solution.lowestCommonAncestor(root, root.left, root.right));
    }

    @Test
    void returnsAncestorWhenOneNodeContainsTheOther() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        assertEquals(root.left, Solution.lowestCommonAncestor(root, root.left, root.left.right));
    }

    @Test
    void handlesSingleNodeTree() {
        TreeNode node = new TreeNode(5);
        assertEquals(node, Solution.lowestCommonAncestor(node, node, node));
    }
}
