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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode dummy = new ListNode(0 , head);
        ListNode prevGrpEnd = dummy;

        if(head == null || k == 1){
            return head;
        }

        ListNode start = head;
        ListNode end = head;

        while(end != null){
            for(int i = 1; i<= k-1; i++){
                if(end == null || end.next == null){
                    return dummy.next;
                }
                end = end.next;
            }
            ListNode endNext = end.next;

            //rev
            ListNode prev = null;
            ListNode curr = start;
            ListNode next = curr.next;

            while(curr != endNext){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){

                next = next.next;
                }
            }
            //connect the lists
            //i have to make head as 2
            prevGrpEnd.next = prev;
            start.next = endNext;

            //IMPORTANT
            prevGrpEnd = start;
            start = endNext;
            end = endNext;
        }
        return dummy.next;
    }
       
   
}