package interview.prep.algorithms.serializeanddeserializebinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CodecTest {
    @Test
    void roundTripsAsymmetricTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(5);
        TreeNode copy = roundTrip(root);
        assertEquals(1, copy.val);
        assertEquals(2, copy.left.val);
        assertEquals(3, copy.right.val);
        assertEquals(4, copy.right.left.val);
        assertEquals(5, copy.right.left.right.val);
        assertNull(copy.right.right);
    }

    @Test
    void roundTripsEmptyTree() {
        assertNull(roundTrip(null));
    }

    @Test
    void roundTripsNegativeAndDuplicateValues() {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(0);
        TreeNode copy = roundTrip(root);
        assertEquals(-1, copy.val);
        assertEquals(-1, copy.left.val);
        assertEquals(0, copy.right.val);
    }

    private static TreeNode roundTrip(TreeNode root) {
        Codec codec = new Codec();
        return codec.deserialize(codec.serialize(root));
    }
}
