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
    public boolean isPalindrome(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
       //slow is the mid
       ListNode prev = null;
    ListNode curr = slow;
    ListNode next = curr.next;

    //rev
    while(curr != null){
        curr.next = prev;
        prev = curr;
        curr = next;
        if(next!= null){
        next = next.next;
        }
    }
    fast = head;
    while(prev != null){
        if(fast.val != prev.val){
            return false;
        }
        fast = fast.next;
        prev = prev.next;
    }
    return true;
    
    }
}