package interview.prep.algorithms.clonegraph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> neighbors = new ArrayList<>();

    public Node(int val) {
        this.val = val;
    }
}
