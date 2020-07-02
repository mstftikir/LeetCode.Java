/*1038. Binary Search Tree to Greater Sum Tree

Given the root of a binary search tree with distinct values, modify it so that every node has a new value equal to the sum of the values of the original tree that are greater than or equal to node.val.

As a reminder, a binary search tree is a tree that satisfies these constraints:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:



Input: [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]


Constraints:

The number of nodes in the tree is between 1 and 100.
Each node will have value between 0 and 100.
The given tree is a binary search tree.
Note: This question is the same as 538: https://leetcode.com/problems/convert-bst-to-greater-tree/
* */

package com.problems.problem1038;

import com.common.BuildBST;
import com.common.TreeNode;

public class Problem1038 {
    private static int sum = 0;

    public static void main(String[] args) {
        Problem1038 instance = new Problem1038();

        int[] input = {4, 1, 6, 0, 2, 5, 7, 3, 8};

        BuildBST buildBST = new BuildBST();

        TreeNode tree = buildBST.build(input);

        TreeNode result = instance.bstToGst(tree);

        buildBST.printInOrder(result);
    }

    public TreeNode bstToGst(TreeNode root) {
        traverseToFindSum(root);
        traverseWithChange(root);
        return root;
    }

    private void traverseToFindSum(TreeNode root) {
        if (root == null) return;

        sum += root.val;

        traverseToFindSum(root.left);
        traverseToFindSum(root.right);
    }

    private void traverseWithChange(TreeNode root) {
        if (root == null) return;

        traverseWithChange(root.left);

        int temp = root.val;
        root.val = sum;
        sum = sum - temp;

        traverseWithChange(root.right);
    }

}
