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

      while(fast!= null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }

      //slow is the mid node
      ListNode prev = null;
      ListNode curr = slow;
   
    ListNode anext = curr.next;
      while(curr != null){
        curr.next = prev;
        prev = curr;
        curr = anext;
        if(anext != null){
            anext = anext.next;
        }
      }

        ListNode start = head;
        ListNode last  = prev;

        while(last.next != null){
            ListNode startnext = start.next;
            ListNode lastnext = last.next;

            start.next = last;
            last.next = startnext;

            start = startnext;
            last = lastnext;
        }
      
      
    }
}