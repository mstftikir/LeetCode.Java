/*897. Increasing Order Search Tree

Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.

Example 1:
Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \
1        7   9

Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9


Constraints:

The number of nodes in the given tree will be between 1 and 100.
Each node will have a unique integer value from 0 to 1000.
* */

package com.problems.problem897;

import com.common.BuildBST;
import com.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Problem897 {
    private final List<Integer> l = new LinkedList<>();
    public static void main(String[] args) {
        Problem897 instance = new Problem897();

        int [] input = {5,3,6,2,4,8,1,7,9};

        BuildBST bst = new BuildBST();
        TreeNode root = bst.build(input);

        TreeNode result = instance.increasingBST(root);

        bst.printInOrder(result);
    }

    public TreeNode increasingBST(TreeNode root) {
        orderBST(root);

        int [] ordered = new int[l.size()];

        for (int i = 0; i < l.size(); i++) {
            ordered[i] = l.get(i);
        }

        BuildBST bst = new BuildBST();
        return bst.build(ordered);
    }

    public void orderBST(TreeNode root){
        if(root == null)
            return;

        orderBST(root.left);
        l.add(root.val);
        orderBST(root.right);
    }
}
