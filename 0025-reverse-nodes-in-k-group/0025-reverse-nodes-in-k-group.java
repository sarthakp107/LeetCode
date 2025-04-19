/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || k == 1) return head;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prevGroupEnd = dummy;

    ListNode start = head;
    ListNode end = head;

    while (end != null) {
        // Check if we have k nodes
        for (int i = 1; i < k; i++) {
            end = end.next;
            if (end == null) return dummy.next;
        }

        ListNode endNext = end.next;

        // Reverse the group
        ListNode prev = null;
        ListNode curr = start;
        ListNode next = null;

        while (curr != endNext) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Reconnect the reversed group
        prevGroupEnd.next = prev;
        start.next = endNext;

        // Move to next group
        prevGroupEnd = start;
        start = endNext;
        end = endNext;
    }

    return dummy.next;
}

       
   
}