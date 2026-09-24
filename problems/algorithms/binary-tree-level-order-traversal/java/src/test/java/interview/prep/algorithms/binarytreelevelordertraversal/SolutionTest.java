package interview.prep.algorithms.binarytreelevelordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void groupsNodesByDepthFromLeftToRight() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), Solution.levelOrder(root));
    }

    @Test
    void handlesEmptyTree() {
        assertEquals(List.of(), Solution.levelOrder(null));
    }

    @Test
    void handlesSingleNode() {
        assertEquals(List.of(List.of(4)), Solution.levelOrder(new TreeNode(4)));
    }
}
