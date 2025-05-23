/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null || head.next==null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null) {
            if(slow==fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;

        // HashSet<ListNode> existingNodes = new HashSet<>();
        // while(head!=null) {
        //     if(existingNodes.contains(head)) {
        //         return true;
        //     }
        //     existingNodes.add(head);
        //     head = head.next;
        // }
        // return false;
    }
}