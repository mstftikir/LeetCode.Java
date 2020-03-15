/*1290. Convert Binary Number in a Linked List to Integer

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
Example 3:

Input: head = [1]
Output: 1
Example 4:

Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880
Example 5:

Input: head = [0,0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
 * */

package com.problems.problem1290;

public class Problem1290 {

	public static void main(String[] args) {
		var instance = new Problem1290();
		
		var input = new ListNode(1);
		input.next = new ListNode(0);
		input.next.next = new ListNode(1);
		
		var result = instance.getDecimalValue(input);
		
		System.out.println(result);
	}

    public int getDecimalValue(ListNode head) {
    	ListNode copy = head;
        int twofactor = 1, result = 0;
        
    	while(copy != null) {
    		twofactor *= 2;
    		
    		copy = copy.next;
    	}
    	
    	twofactor /= 2;
    	
    	while(head != null) {
    		result += twofactor * head.val;
    		
    		twofactor /= 2;
    		
    		head = head.next;
    	}
    	
    	return result;
    }
}
