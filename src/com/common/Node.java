package com.common;

import java.util.List;

public class Node {
    public final int val;
    public List<Node> children;

    public Node(int _val) {
        val = _val;
    }
}
