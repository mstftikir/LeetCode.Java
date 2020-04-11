/*589. N-ary Tree Preorder Traversal

Given an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

Follow up:

Recursive solution is trivial, could you do it iteratively?

Example 1:

Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]
Example 2:

Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
* */

package com.problems.problem589;

import com.common.Node;

import java.util.LinkedList;
import java.util.List;

public class Problem589 {
    public static void main(String[] args) {
        Problem589 instance = new Problem589();

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

        List<Integer> result = instance.preorder(root);

        for (int i : result) {
            System.out.println(i);
        }

    }

    public List<Integer> preorder(Node root) {
        List<Integer> l = new LinkedList<>();
        if (root == null) return l;

        List<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node item = q.remove(0);
            l.add(item.val);
            if (item.children != null) {
                q.addAll(0, item.children);
            }
        }

        return l;
    }
}
