/*226. Invert Binary Tree

Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
* */

package com.problems.problem226;

import com.common.TreeNode;

public class Problem226 {
    public static void main(String[] args) {
        System.out.println(invertTree(new TreeNode(1)));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);

        root.left = invertTree(root.right);
        root.right = left;

        return root;
    }
}
