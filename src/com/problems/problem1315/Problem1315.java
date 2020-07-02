/*1315. Sum of Nodes with Even-Valued Grandparent

Given a binary tree, return the sum of values of nodes with even-valued grandparent.  (A grandparent of a node is the parent of its parent, if it exists.)

If there are no nodes with an even-valued grandparent, return 0.



Example 1:



Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 18
Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.


Constraints:

The number of nodes in the tree is between 1 and 10^4.
The value of nodes is between 1 and 100.
* */

package com.problems.problem1315;

import com.common.TreeNode;

public class Problem1315 {
    private int result = 0;
    public static void main(String[] args) {
        Problem1315 instance = new Problem1315();

        TreeNode tree = new TreeNode(6);
        tree.left = new TreeNode(7);
        tree.right = new TreeNode(8);
        tree.left.left = new TreeNode(2);
        tree.left.right = new TreeNode(7);
        tree.left.right = new TreeNode(1);
        tree.right.right = new TreeNode(3);

        int result = instance.sumEvenGrandparent(tree);

        System.out.println(result);
    }

    public int sumEvenGrandparent(TreeNode root) {
        traverse(root);
        return result;
    }

    private void traverse(TreeNode root){
        if(root == null) {
            return;
        }

        if(root.val % 2 == 0){
            if(root.left != null){
                if(root.left.left != null){
                    result += root.left.left.val;
                }
            }
        }

        if(root.val % 2 == 0){
            if(root.left != null){
                if(root.left.right != null){
                    result += root.left.right.val;
                }
            }
        }
        if(root.val % 2 == 0){
            if(root.right != null){
                if(root.right.left != null){
                    result += root.right.left.val;
                }
            }
        }

        if(root.val % 2 == 0){
            if(root.right != null){
                if(root.right.right != null){
                    result += root.right.right.val;
                }
            }
        }
        traverse(root.left);
        traverse(root.right);
    }
}
