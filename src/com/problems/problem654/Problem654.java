/*654. Maximum Binary Tree

Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    /
     2  0
       \
        1
Note:
The size of the given array will be in the range [1,1000].
* */

package com.problems.problem654;

import com.common.TreeNode;

public class Problem654 {
    public static void main(String[] args) {
        Problem654 instance = new Problem654();

        int[] nums = {3, 2, 1, 6, 0, 5};

        TreeNode result = instance.constructMaximumBinaryTree(nums);

        System.out.println(result.val);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) return null;
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int start, int end) {
        if (start > end) return null;

        int idxMax = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[idxMax]) {
                idxMax = i;
            }
        }

        TreeNode root = new TreeNode(nums[idxMax]);

        root.left = build(nums, start, idxMax - 1);
        root.right = build(nums, idxMax + 1, end);

        return root;
    }
}