package interview.prep.algorithms.kthsmallestelementinabst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsRankedValues() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        assertEquals(1, Solution.kthSmallest(root, 1));
        assertEquals(2, Solution.kthSmallest(root, 2));
        assertEquals(4, Solution.kthSmallest(root, 4));
    }

    @Test
    void handlesSingleNode() {
        assertEquals(8, Solution.kthSmallest(new TreeNode(8), 1));
    }
}
