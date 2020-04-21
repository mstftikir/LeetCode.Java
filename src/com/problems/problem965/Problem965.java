/*965. Univalued Binary Tree

A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.



Example 1:


Input: [1,1,1,1,1,null,1]
Output: true
Example 2:


Input: [2,2,2,5,2]
Output: false
* */
package com.problems.problem965;

import com.common.TreeNode;

public class Problem965 {
    public boolean isUnival = true;

    public static void main(String[] args) {
        var instance = new Problem965();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        boolean result = instance.isUnivalTree(root);

        System.out.println(result);
    }

    public boolean isUnivalTree(TreeNode root) {
        traverse(root, root.val);

        return isUnival;
    }

    public void traverse(TreeNode root, int val){
        if(root == null){
            return;
        }

        if(root.val != val){
            isUnival = false;
        }

        traverse(root.left, val);
        traverse(root.right, val);
    }
}
