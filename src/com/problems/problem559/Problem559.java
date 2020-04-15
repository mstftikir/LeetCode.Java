/*559. Maximum Depth of N-ary Tree

Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).



Example 1:



Input: root = [1,null,3,2,4,null,5,6]
Output: 3
Example 2:



Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: 5


Constraints:

The depth of the n-ary tree is less than or equal to 1000.
The total number of nodes is between [0, 10^4].
* */

package com.problems.problem559;

import com.common.Node;

import java.util.LinkedList;
import java.util.List;

public class Problem559 {
    public static void main(String[] args) {
        Problem559 instance = new Problem559();

        Node root = new Node(1);
        List<Node> children = new LinkedList<>();

        children.add(new Node(3));
        children.add(new Node(2));
        children.add(new Node(4));
        root.children = children;

        Node firstChild = (root.children.get(0));

        List<Node> firstChildChildren = new LinkedList<>();

        firstChildChildren.add(new Node(5));
        firstChildChildren.add(new Node(6));
        firstChild.children = firstChildChildren;

        int result = instance.maxDepth(root);
        System.out.println(result);
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 0;
        if (root.children != null) {
            for (Node e : root.children) {
                int v = maxDepth(e);

                if (v > max) {
                    max = v;
                }
            }
            return ++max;
        }

        return ++max;
    }
}
