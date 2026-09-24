package interview.prep.algorithms.countgoodnodesinbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void countsNodesThatMeetPathRule() {
        Solution.TreeNode r = new Solution.TreeNode(3); r.left = new Solution.TreeNode(1); r.right = new Solution.TreeNode(4);
        r.left.left = new Solution.TreeNode(3); r.right.left = new Solution.TreeNode(1); r.right.right = new Solution.TreeNode(5);
        assertEquals(4, Solution.goodNodes(r));
    }
}

