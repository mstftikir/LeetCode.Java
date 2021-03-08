/*1721. Swapping Nodes in a Linked List

You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).



Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
Example 3:

Input: head = [1], k = 1
Output: [1]
Example 4:

Input: head = [1,2], k = 1
Output: [2,1]
Example 5:

Input: head = [1,2,3], k = 2
Output: [1,2,3]


Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
* */
package com.problems.problem1721;

import com.common.ListNode;

public class Problem1721 {

    public static void main(String[] args) {

        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);

        System.out.println(swapNodes(input, 2).next.val);
    }

    public static ListNode swapNodes(ListNode head, int k) {
        int length = length(head);
        int[] arr = new int[length];


        ListNode tempHead = head;
        for(int i = 0; i < length; i++){
            arr[i] = tempHead.val;
            tempHead = tempHead.next;
        }

        int temp = arr[k - 1];
        arr[k - 1] = arr[length - k];
        arr[length - k] = temp;

        tempHead = head;
        for(int i = 0; i < length; i++){
            tempHead.val = arr[i];
            tempHead = tempHead.next;
        }

        return head;
    }

    private static int length(ListNode head){
        int counter = 0;
        while(head != null){
            head = head.next;
            counter++;
        }

        return counter;
    }

}
