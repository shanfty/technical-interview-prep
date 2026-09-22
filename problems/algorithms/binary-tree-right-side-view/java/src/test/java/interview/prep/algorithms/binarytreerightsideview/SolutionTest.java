package interview.prep.algorithms.binarytreerightsideview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsRightmostNodeAtEachDepth() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        assertEquals(List.of(1, 3, 4), Solution.rightSideView(root));
    }

    @Test
    void handlesEmptyTree() {
        assertEquals(List.of(), Solution.rightSideView(null));
    }

    @Test
    void seesSingleNode() {
        assertEquals(List.of(8), Solution.rightSideView(new TreeNode(8)));
    }
}
