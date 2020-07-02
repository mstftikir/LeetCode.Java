/*814. Binary Tree Pruning

We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)

Example 1:
Input: [1,null,0,0,1]
Output: [1,null,0,null,1]

Explanation:
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.


Example 2:
Input: [1,0,1,0,0,0,1]
Output: [1,null,1,null,1]



Example 3:
Input: [1,1,0,1,1,0,1,0]
Output: [1,1,0,1,1,null,1]



Note:

The binary tree will have at most 100 nodes.
The value of each node will only be 0 or 1.
* */

package com.problems.problem814;

import com.common.TreeNode;

public class Problem814 {
    public static void main(String[] args) {
        Problem814 instance = new Problem814();

        TreeNode input = new TreeNode(1);
        input.right = new TreeNode(0);
        input.right.right = new TreeNode(1);
        input.right.left = new TreeNode(0);

        TreeNode result = instance.pruneTree(input);

        System.out.println(result.val);
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }

}
