/*876. Middle of the Linked List

Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.



Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.
* */

package com.problems.problem876;

import com.common.ListNode;

public class Problem876 {
    public static void main(String[] args) {
        Problem876 instance = new Problem876();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(5);
        listNode.next.next.next.next = null;

        ListNode result = instance.middleNode(listNode);

        System.out.println(result.val);
    }

    public ListNode middleNode(ListNode head) {
        ListNode backup = head;
        int counter = 1;

        while(head != null){
            counter++;
            head = head.next;
        }

        int loopCount = (counter - 1) / 2;

        for (int i = 0; i < loopCount; i++) {
            backup = backup.next;
        }

        return  backup;
    }

}
