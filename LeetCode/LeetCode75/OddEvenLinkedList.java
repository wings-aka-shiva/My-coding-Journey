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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode oddTemp = head, evenTemp = head.next, evenHead = head.next;
        while(oddTemp.next != null && evenTemp.next != null) {
            oddTemp.next = evenTemp.next;
            oddTemp = oddTemp.next;
            evenTemp.next = oddTemp.next;
            evenTemp = evenTemp.next;
        }
        oddTemp.next = evenHead;

        return head;
    }
}