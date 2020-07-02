/*1382. Balance a Binary Search Tree

Given a binary search tree, return a balanced binary search tree with the same node values.

A binary search tree is balanced if and only if the depth of the two subtrees of every node never differ by more than 1.

If there is more than one answer, return any of them.



Example 1:



Input: root = [1,null,2,null,3,null,4,null,null]
Output: [2,1,3,null,null,null,4]
Explanation: This is not the only correct answer, [3,1,4,null,2,null,null] is also correct.


Constraints:

The number of nodes in the tree is between 1 and 10^4.
The tree nodes will have distinct values between 1 and 10^5.
* */

package com.problems.problem1382;

import com.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Problem1382 {
    final private List<TreeNode> list = new LinkedList<>();

    public static void main(String[] args) {
        Problem1382 instance = new Problem1382();

        TreeNode input = new TreeNode(1);
        input.right = new TreeNode(2);
        input.right.right = new TreeNode(3);
        input.right.right.right = new TreeNode(4);

        TreeNode result = instance.balanceBST(input);

        System.out.println(result.val);
    }

    public TreeNode balanceBST(TreeNode root) {
        traverse(root);
        return sortedArrayToBST(0, list.size() - 1);
    }

    private TreeNode sortedArrayToBST(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = list.get(mid);
        root.left = sortedArrayToBST(start, mid - 1);
        root.right = sortedArrayToBST(mid + 1, end);
        return root;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        list.add(root);
        traverse(root.right);
    }
}
