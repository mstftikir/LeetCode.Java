/*1305. All Elements in Two Binary Search Trees

Given two binary search trees root1 and root2.

Return a list containing all the integers from both trees sorted in ascending order.



Example 1:


Input: root1 = [2,1,4], root2 = [1,0,3]
Output: [0,1,1,2,3,4]
Example 2:

Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
Output: [-10,0,0,1,2,5,7,10]
Example 3:

Input: root1 = [], root2 = [5,1,7,0,2]
Output: [0,1,2,5,7]
Example 4:

Input: root1 = [0,-10,10], root2 = []
Output: [-10,0,10]
Example 5:


Input: root1 = [1,null,8], root2 = [8,1]
Output: [1,1,8,8]


Constraints:

Each tree has at most 5000 nodes.
Each node's value is between [-10^5, 10^5].
* */

package com.problems.problem1305;

import com.common.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem1305 {
    private final List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        Problem1305 instance = new Problem1305();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(8);

        TreeNode tree2 = new TreeNode(8);
        tree2.left = new TreeNode(1);

        List<Integer> result = instance.getAllElements(tree1, tree2);

        for (Integer i :
                result) {
            System.out.println(i);
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverse(root1);
        traverse(root2);

        Collections.sort(list);

        return list;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        list.add(root.val);

        traverse(root.left);
        traverse(root.right);
    }
}
