package interview.prep.algorithms.sametree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void acceptsEqualStructuresAndValues() {
        TreeNode first = new TreeNode(1);
        first.left = new TreeNode(2);
        first.right = new TreeNode(3);
        TreeNode second = new TreeNode(1);
        second.left = new TreeNode(2);
        second.right = new TreeNode(3);
        assertTrue(Solution.isSameTree(first, second));
    }

    @Test
    void rejectsDifferentStructure() {
        TreeNode first = new TreeNode(1);
        first.left = new TreeNode(2);
        TreeNode second = new TreeNode(1);
        second.right = new TreeNode(2);
        assertFalse(Solution.isSameTree(first, second));
    }

    @Test
    void considersTwoEmptyTreesEqual() {
        assertTrue(Solution.isSameTree(null, null));
    }
}
