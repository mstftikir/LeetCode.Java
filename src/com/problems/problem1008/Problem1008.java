package com.problems.problem1008;

import com.common.TreeNode;

public class Problem1008 {
    public static void main(String[] args) {
        Problem1008 instance = new Problem1008();

        int[] nums = {8, 5, 1, 7, 10, 12};

        TreeNode result = instance.bstFromPreorder(nums);

        instance.printInOrder(result);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;

        for (int i : preorder) {
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

    public void printInOrder(TreeNode root){
        if(root == null)
            return;

        printInOrder(root.left);
        System.out.println(root.val);
        printInOrder(root.right);
    }
}
