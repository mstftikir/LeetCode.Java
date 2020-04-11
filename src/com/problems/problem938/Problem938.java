/*938. Range Sum of BST

Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

 

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
 

Note:

The number of nodes in the tree is at most 10000.
The final answer is guaranteed to be less than 2^31.
 * */

package com.problems.problem938;

import com.common.TreeNode;

public class Problem938 {

	private int sum;
	
	Problem938(){
		sum = 0;
	}
	
	public static void main(String[] args) {
		var instance = new Problem938();

		TreeNode input = new TreeNode(10);
		input.left = new TreeNode(5);
		input.right = new TreeNode(15);
		input.left.left = new TreeNode(3);
		input.left.right = new TreeNode(7);
		input.right.right = new TreeNode(18);
				
		int L = 7, R = 15;
		
		var result = instance.rangeSumBST(input, L, R);
		
		System.out.println(result);
	}
	
    public int rangeSumBST(TreeNode root, int L, int R) {
    	traverse(root, L, R);
    	
    	return sum;
    }
    
    private void traverse(TreeNode root, int L, int R) {
    	if(root == null) {
    		return;
    	}
    	
    	if(root.val >= L && root.val <= R) {
    		sum += root.val;
    	}
    	
    	if(root.val > L) {
    		traverse(root.left, L, R);	
    	}
    	
    	if(root.val < R) {
        	traverse(root.right, L, R);
    	}
    		
    }
}
