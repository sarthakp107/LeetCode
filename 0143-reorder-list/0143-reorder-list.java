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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow; //mid
        

            ListNode anext = curr.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = anext;
            //null check
            if(anext != null){

            anext = anext.next;
            }
        }

        ListNode start = head;
        ListNode second = prev;
        while(second.next != null){
            ListNode startnext = start.next;
             ListNode prevnext = second.next;
            start.next = second;
            second.next = startnext;

            start = startnext;
            second = prevnext;
        }

    }
}