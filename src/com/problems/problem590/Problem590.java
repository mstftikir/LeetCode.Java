/*590. N-ary Tree Postorder Traversal

Given an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).



Follow up:

Recursive solution is trivial, could you do it iteratively?



Example 1:



Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]
Example 2:



Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]


Constraints:

The height of the n-ary tree is less than or equal to 1000
The total number of nodes is between [0, 10^4]
*/

package com.problems.problem590;

import com.problems.common.Node;

import java.util.*;

public class Problem590 {
    public static void main(String[] args) {
        Problem590 instance = new Problem590();

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

        List<Integer> result = instance.postorder(root);

        for (int i : result) {
            System.out.println(i);
        }

    }

    public List<Integer> postorder(Node root) {
        List<Integer> l = new LinkedList<>();
        if (root == null) return l;

        Stack<Node> s = new Stack<>();
        s.add(root);

        while (!s.isEmpty()) {
            Node item = s.pop();
            l.add(item.val);
            if (item.children != null) {
                s.addAll(item.children);
            }
        }
        Collections.reverse(l);
        return l;
    }
}

