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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode( 0 ,head);
        ListNode leftPrev = dummy; 
        ListNode curr = head;

        //to make the temp point to the place in L's position
        // iterate l-1 times
        //check from where u start i = 0/ i = 0 and range

        for(int i = 0; i< left - 1; i++){
            leftPrev = curr;  
            curr = curr.next;
        }
        ListNode prev = null;
 
        
        for(int i = 0; i < (right - left) + 1 ; i++){
 ListNode aNext = curr.next;  
            curr.next = prev;
            prev = curr;
            curr = aNext;
             
      
        }

        leftPrev.next.next = curr;
        leftPrev.next = prev;

        return dummy.next;

    }
}