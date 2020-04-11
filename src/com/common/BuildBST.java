package com.common;

public class BuildBST {
    TreeNode root;

    public TreeNode build(int [] numbs){

        for (int i: numbs){
            root = addRecursive(root, i);
        }

        return root;
    }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }
}
