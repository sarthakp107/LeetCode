/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
 

        //brute force approach
        while(pointerA != null){
            ListNode pointerB = headB;
            while(pointerB != null){
                if(pointerA == pointerB){
                    return pointerA;
                }
                pointerB = pointerB.next;
            }
            pointerA = pointerA.next;
        }
        return null;
    }
}